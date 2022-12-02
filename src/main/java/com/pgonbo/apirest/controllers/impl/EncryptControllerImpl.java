package com.pgonbo.apirest.controllers.impl;

import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.web.bind.annotation.RestController;

import com.pgonbo.apirest.controllers.EncryptController;
import com.pgonbo.apirest.models.EncodeRequestModel;
import com.pgonbo.apirest.utils.AESEncryption;

@RestController
public class EncryptControllerImpl implements EncryptController {

    @Override
    public String getEncode(EncodeRequestModel request) throws Exception {
        // Selección de algoritmo e inicialización
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);

        // Generarcion de llave simetrica
        SecretKey key = keyGenerator.generateKey();

        // Generación de vector
        byte[] IV = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(IV);

        System.out.println("Texto original: " + request.getCadena());

        byte[] cipherText = AESEncryption.encrypt(request.getCadena().getBytes(), key, IV);
        String texto_base64 = Base64.getEncoder().encodeToString(cipherText);
        System.out.println("Texto encriptado: " + texto_base64);

        String decryptedText = AESEncryption.decrypt(cipherText, key, IV);
        System.out.println("Texto desencriptado: " + decryptedText);

        return texto_base64;
    }

}
