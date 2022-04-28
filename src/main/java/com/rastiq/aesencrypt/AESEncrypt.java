package com.rastiq.aesencrypt;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class AESEncrypt {
    public static AESEncrypt instance = new AESEncrypt();

    public static void encrypt(String key, File inputFile, File outputFile) {
        try {
            final Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
            final Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            final FileInputStream inputStream = new FileInputStream(inputFile);
            final byte[] inputBytes = new byte[(int)inputFile.length()];
            inputStream.read(inputBytes);
            final byte[] outputBytes = cipher.doFinal(inputBytes);
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputStream.write(outputBytes);
        }
        catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException | IOException ex3) {
            System.exit(0);
        }
    }

    public static void decrypt(String key, File inputFile, File outputFile) {
        try {
            final Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
            final Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            final FileInputStream inputStream = new FileInputStream(inputFile);
            final byte[] inputBytes = new byte[(int)inputFile.length()];
            inputStream.read(inputBytes);
            final byte[] outputBytes = cipher.doFinal(inputBytes);
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputStream.write(outputBytes);
        }
        catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException | IOException ex3) {
            System.exit(0);
        }
    }
}
