package com.ydf.core.security.spring;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.ydf.common.utils.YdfCrypt;


/**
 * 对一些需要保密的数据进行加密处理
 */
public class DecryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private static final String DEFALUT_DESPREFIX = "{XNDES}";
    private static final String DEFALUT_DESPREFIX_REGX = "\\{XNDES\\}";
   
    @Override
    protected String convertPropertyValue(String originalValue) {

        if (StringUtils.isEmpty(originalValue)) {
            return originalValue;
            
        }else if (originalValue.startsWith(DEFALUT_DESPREFIX)) {
            originalValue = originalValue.replaceAll(DEFALUT_DESPREFIX_REGX, "");
            //originalValue = UsCrypt.decryptBasedDes(originalValue);
            originalValue = YdfCrypt.DKDecrypt(originalValue);
        }
        return originalValue;
    }

}
