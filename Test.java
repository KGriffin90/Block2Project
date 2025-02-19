import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Create an AES encryption object with a new key
            AESEncryption aes = new AESEncryption(null);

            System.out.print("Enter text to encrypt: ");
            String inputText = scanner.nextLine();

            // Encrypt the text
            String encryptedText = aes.encrypt(inputText);
            System.out.println("Encrypted: " + encryptedText);

            // Decrypt the text
            String decryptedText = aes.decrypt(encryptedText);
            System.out.println("Decrypted: " + decryptedText);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
