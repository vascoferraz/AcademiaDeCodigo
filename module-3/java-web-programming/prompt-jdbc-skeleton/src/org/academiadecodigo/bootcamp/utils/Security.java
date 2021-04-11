package org.academiadecodigo.bootcamp.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Security {

    public final static String ALGORITHM = "SHA";

    public static String getHash(String message) {

        try {

            MessageDigest md = MessageDigest.getInstance(ALGORITHM);

            // obtain a new hash
            md.reset();
            md.update(message.getBytes());
            byte[] digest = md.digest();

            // convert hash bytes into string
            BigInteger bigInt = new BigInteger(1, digest);
            String hashText = bigInt.toString(16);

            // zero pad the hash for the full 32 chars
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }

            return hashText;

        } catch (NoSuchAlgorithmException ex) {
            return message;
        }

    }

}
