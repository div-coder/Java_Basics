import java.io.*;
import java.util.*;
public class Decryption { //to keep track of index
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String message = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            message += replaceVal;
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int key = 0;
        System.out.print("Enter the String for Decryption:");
        message = sc.next();

        System.out.println("\n\nEnter Shift Key:");
        key = sc.nextInt();
        // System.out.println("\nEncrpyted msg:"+encrypt(message, key));
        System.out.println("\nDecrypted Message:" + decrypt(message, key));

    }
}
