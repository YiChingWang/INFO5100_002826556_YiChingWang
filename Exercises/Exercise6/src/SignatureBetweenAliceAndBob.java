import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Base64;

public class SignatureBetweenAliceAndBob {

    public static void main(String[] args) throws Exception {
        // Alice's key pair
        KeyPair aliceKeyPair = generateKeyPair();
        String plainMessage = "Hey, Bob!";
        System.out.println("Plain Message: " + plainMessage);

        // Alice signs the message
        byte[] digitalSignature = signMessage(plainMessage, aliceKeyPair.getPrivate());
        System.out.println("Signature: " + Base64.getEncoder().encodeToString(digitalSignature));

        // Bob verifies the signature
        boolean isSignatureValid = verifySignature(plainMessage, digitalSignature, aliceKeyPair.getPublic());
        System.out.println("Signature is valid or not: " + isSignatureValid);
    }

    private static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        return keyPairGen.generateKeyPair();
    }

    private static byte[] signMessage(String message, PrivateKey privateKey) throws Exception {
        Signature rsaSignature = Signature.getInstance("SHA256withRSA");
        rsaSignature.initSign(privateKey);
        rsaSignature.update(message.getBytes("UTF-8"));
        return rsaSignature.sign();
    }

    private static boolean verifySignature(String message, byte[] signature, PublicKey publicKey) throws Exception {
        Signature rsaSignature = Signature.getInstance("SHA256withRSA");
        rsaSignature.initVerify(publicKey);
        rsaSignature.update(message.getBytes("UTF-8"));
        return rsaSignature.verify(signature);
    }
}




