package com.pgonbo.apirest.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryption {

    public static byte[] encrypt(byte[] plaintext, SecretKey key, byte[] IV) throws Exception {
        // Instancia del cifrado
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        // Creación de SecretKeySpec
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");

        // Creación de vector
        IvParameterSpec ivSpec = new IvParameterSpec(IV);

        // Inicializa cifrado para ENCRYPT_MODE
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

        // encriptación
        byte[] cipherText = cipher.doFinal(plaintext);

        return cipherText;
    }

    public static String decrypt(byte[] cipherText, SecretKey key, byte[] IV) throws Exception {
        // Instancia del cifrado
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        // Creación de SecretKeySpec
        SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");

        // Creación de vector
        IvParameterSpec ivSpec = new IvParameterSpec(IV);

        // Inicializa cifrado para DECRYPT_MODE
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

        // Desencriptación
        byte[] decryptedText = cipher.doFinal(cipherText);

        return new String(decryptedText);
    }

}
