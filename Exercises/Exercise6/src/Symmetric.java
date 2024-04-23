import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;
import java.security.SecureRandom;

public class Symmetric {
    private static final String ALGORITHM = "AES/GCM/NoPadding";
    private static final int AES_KEY_SIZE = 256;
    private static final int GCM_NONCE_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 128;

    public static void main(String[] args) throws Exception {
        SecretKey key = generateKey();
        byte[] iv = generateIV();
        GCMParameterSpec spec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);

        byte[] plainMessage = "Hey, Alice!".getBytes("UTF-8");
        byte[] encryptedMessage = encrypt(plainMessage, key, spec);
        byte[] decryptedMessage = decrypt(encryptedMessage, key, spec);

        System.out.println("Original Message: " + new String(plainMessage));
        System.out.println("Encrypted Result: " + Base64.getEncoder().encodeToString(encryptedMessage));
        System.out.println("Decrypted Result: " + new String(decryptedMessage));
    }

    private static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(AES_KEY_SIZE);
        return keyGen.generateKey();
    }

    private static byte[] generateIV() {
        SecureRandom random = new SecureRandom();
        byte[] iv = new byte[GCM_NONCE_LENGTH];
        random.nextBytes(iv); // Generate random IV
        return iv;
    }

    private static byte[] encrypt(byte[] data, SecretKey key, GCMParameterSpec spec) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key, spec);
        return cipher.doFinal(data);
    }

    private static byte[] decrypt(byte[] data, SecretKey key, GCMParameterSpec spec) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key, spec);
        return cipher.doFinal(data);
    }
}


