package com.us.core.utils;

public abstract class GuidGenerator {

   // private static RandomValueStringGenerator defaultClientSecretGenerator = new RandomValueStringGenerator(32);

    /**
     * private constructor
     */
    private GuidGenerator() {
    }

    public static String generate() {
        //return UUID.randomUUID().toString().replaceAll("-", "");
    	return  UuidUtils.compressedUuid();
    }


    public static String generateClientSecret() {
     //   return defaultClientSecretGenerator.generate();
        return  UuidUtils.compressedUuid();
    }
}