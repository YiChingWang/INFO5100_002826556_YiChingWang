import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.Cipher;
import java.util.Base64;

public class Asymmetric {
    private static final String ALGORITHM = "RSA/ECB/PKCS1Padding";

    public static void main(String[] args) throws Exception {
        KeyPair keyPair = generateKeyPair();

        byte[] plainMessage = "Hey, Bob!".getBytes("UTF-8");
        byte[] encryptedMessage = encrypt(plainMessage, keyPair.getPublic());
        byte[] decryptedMessage = decrypt(encryptedMessage, keyPair.getPrivate());

        System.out.println("Original Message: " + new String(plainMessage));
        System.out.println("Encrypted Result: " + Base64.getEncoder().encodeToString(encryptedMessage));
        System.out.println("Decrypted Result: " + new String(decryptedMessage));
    }

    private static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        return keyPairGen.generateKeyPair();
    }

    private static byte[] encrypt(byte[] data, java.security.PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(data);
    }

    private static byte[] decrypt(byte[] data, java.security.PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }
}


