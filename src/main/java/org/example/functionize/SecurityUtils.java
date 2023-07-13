package org.example.functionize;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecurityUtils {

    // private constructor to prevent instantiation
    private SecurityUtils() {}

    // hash a given string using SHA-256 algorithm
    public static String hashString(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // check if a given string matches a hashed string
    public static boolean checkHash(String input, String hash) {
        return hashString(input).equals(hash);
    }

    // extend the class to support more hashing algorithms in the future
    public interface HashAlgorithm {
        String getName();
        byte[] hash(byte[] input) throws NoSuchAlgorithmException;
    }

    public static class SHA512HashAlgorithm implements HashAlgorithm {
        @Override
        public String getName() {
            return "SHA-512";
        }

        @Override
        public byte[] hash(byte[] input) throws NoSuchAlgorithmException {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            return digest.digest(input);
        }
    }

    // example usage
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String input = "password123";
        String hash = SecurityUtils.hashString(input);
        System.out.println("Hashed password: " + hash);
        System.out.println("Password matches hash: " + SecurityUtils.checkHash(input, hash));

        // example of extending the class to use SHA-512 algorithm
        SHA512HashAlgorithm sha512 = new SHA512HashAlgorithm();
        byte[] inputBytes = input.getBytes();
        byte[] hashBytes = sha512.hash(inputBytes);
        System.out.println("SHA-512 Hashed password: " + new String(hashBytes));
    }
}
