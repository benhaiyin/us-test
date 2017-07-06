package com.us.core.security.util;

import java.security.MessageDigest;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public  class UsCrypt {
	
	 private static final Logger log = LoggerFactory.getLogger(UsCrypt.class);
		
	
	 /**
    * DES算法密钥
    */
   private static final byte[] DES_KEY = { 21, 1, -110, 82, -32, -85, -128, -65 };
   
   private final static String strKey = "20141516-10129-21230";

   /**
    * 基于MD5算法的单向加密
    *
    * @param strSrc
    *            明文
    * @return 返回密文
    */
   public static String encryptBasedMd5(String strSrc) {
       String outString = null;
       try {
           MessageDigest md5 = MessageDigest.getInstance("MD5");
           byte[] outByte = md5.digest(strSrc.getBytes("UTF-8"));
           outString = outByte.toString();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return outString;
   }
   
  
   /**
    * 数据加密，算法（DES）
    *
    * @param data
    *            要进行加密的数据
    * @return 加密后的数据
    */
   public static String encryptBasedDes(String data) {
       String encryptedData = null;
       try {
           // DES算法要求有一个可信任的随机数源
           SecureRandom sr = new SecureRandom();
           DESKeySpec deskey = new DESKeySpec(DES_KEY);
           // 创建一个密匙工厂，然后用它把DESKeySpec转换成一个SecretKey对象
           SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
           SecretKey key = keyFactory.generateSecret(deskey);
           // 加密对象
           Cipher cipher = Cipher.getInstance("DES");
           cipher.init(Cipher.ENCRYPT_MODE, key, sr);
           // 加密，并把字节数组编码成字符串
           encryptedData = new sun.misc.BASE64Encoder().encode(cipher.doFinal(data.getBytes()));
       } catch (Exception e) {
           log.error("加密错误，错误信息：", e);
           throw new RuntimeException("加密错误，错误信息：", e);
       }
       return encryptedData;
   }
   

   /**
    * 数据解密，算法（DES）
    *
    * @param cryptData
    *            加密数据
    * @return 解密后的数据
    */
   public static String decryptBasedDes(String cryptData) {
       String decryptedData = null;
       try {
           // DES算法要求有一个可信任的随机数源
           SecureRandom sr = new SecureRandom();
           DESKeySpec deskey = new DESKeySpec(DES_KEY);
           // 创建一个密匙工厂，然后用它把DESKeySpec转换成一个SecretKey对象
           SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
           SecretKey key = keyFactory.generateSecret(deskey);
           // 解密对象
           Cipher cipher = Cipher.getInstance("DES");
           cipher.init(Cipher.DECRYPT_MODE, key, sr);
           // 把字符串解码为字节数组，并解密
           decryptedData = new String(cipher.doFinal(new sun.misc.BASE64Decoder().decodeBuffer(cryptData)));
       } catch (Exception e) {
           log.error("解密错误，错误信息：", e);
           throw new RuntimeException("解密错误，错误信息：", e);
       }
       return decryptedData;
   }
   
   public static String DKEncrypt(String sourceStr) {
		int i, j, k, m, n;
		String l_key = "";
		String l_dest = "";
		String strBuf = "";
		

		l_dest = sourceStr;
		l_key = strKey;
		if ((sourceStr.length() > 0) && (l_key != "")) {
			n = 0;
			for (k = 0; k < l_dest.length(); k++)
				n = n + (int) (l_dest.charAt(k));
			n = (int) (0.57829 * n + 0.50000);
			n = (n - 1) % l_dest.length() + 1;
			strBuf = l_dest.substring(n, l_dest.length());
			l_dest = strBuf + l_dest.substring(0, n);

			i = sourceStr.length();
			j = l_key.length();
			m = j % i;
			if (m != 0) {
				m = ((j / i) + 1) * i;
				for (k = j + 1, n = 0; k <= m; k++) {
					l_key = l_key + (char) (l_key.charAt(n));
					n++;
					if (n > j)
						n = 0;
				}
			}
			m = l_key.length();

			for (k = 0; k < m / i; k++) {
				for (j = 0; j < i; j++) {
					n = (int) (l_dest.charAt(j));
					if (n < 0)
						n += 256;
					n += (int) (l_key.charAt(k * i + j));
					n = (n - 20) % 108 + 20;
					char[] l_dest_array = l_dest.toCharArray();
					l_dest_array[j] = (char) n;
					l_dest = new String(l_dest_array);
				}
			}

			n = 0;
			for (k = 0; k < l_dest.length(); k++)
				n = n + (int) (l_dest.charAt(k));
			n = (n - 1) % l_dest.length() + 1;
			strBuf = l_dest.substring(n, l_dest.length());
			l_dest = strBuf + l_dest.substring(0, n);
		}
		return l_dest;

	}


	public static String DKDecrypt(String sourceStr) {
		int i, j, k, m, n;
		String l_key = "";
		String l_dest = "";
		String strBuf = "";
		

		l_dest = sourceStr;
		l_key = strKey;
		if ((sourceStr.length() > 0) && (l_key != "")) {
			n = 0;

			for (k = 0; k < l_dest.length(); k++)
				n += (int) l_dest.charAt(k);

			n = (n - 1) % l_dest.length() + 1;
			n = l_dest.length() - n;

			if (n == 0)
				n = l_dest.length();

			strBuf = l_dest.substring(n, l_dest.length());
			l_dest = strBuf + l_dest.substring(0, n);

			i = sourceStr.length();
			j = l_key.length();
			m = j % i;
			if (m != 0) {
				m = ((j / i) + 1) * i;
				for (k = j + 1, n = 0; k <= m; k++) {
					l_key = l_key + (char) (l_key.charAt(n));
					n++;
					if (n > j)
						n = 0;
				}
			}

			m = l_key.length();

			for (k = m / i - 1; k >= 0; k--) {
				for (j = 0; j < i; j++) {
					n = (int) (l_dest.charAt(j));
					if (n < 0)
						n += 256;

					n -= (int) (l_key.charAt(k * i + j));
					if (n < 20)
						n += 108;
					n = (n - 20) % 108 + 20;
					char[] l_dest_array = l_dest.toCharArray();
					l_dest_array[j] = (char) n;
					l_dest = new String(l_dest_array);
				}
			}

			n = 0;
			for (k = 0; k < l_dest.length(); k++)
				n = n + (int) (l_dest.charAt(k));

			n = (int) (0.57829 * n + 0.50000);
			n = (n - 1) % l_dest.length() + 1;
			n = l_dest.length() - n;
			strBuf = l_dest.substring(n, l_dest.length());
			l_dest = strBuf + l_dest.substring(0, n);
		}
		return l_dest;
	}

   public static void main(String[] args) {
		String s ="123456";
		String en = UsCrypt.encryptBasedDes(s);
				
		System.out.println(en);
		
		String de = UsCrypt.decryptBasedDes(en);
		
		System.out.println(de);
		
		String ss="l+)0%O]Xel^";
		
		System.out.println(UsCrypt.DKDecrypt("\")&("));
		System.out.println(UsCrypt.DKEncrypt("123456"));
		
	}
}
