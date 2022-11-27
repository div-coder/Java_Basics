import java.util.Scanner;
public class BruteForce
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, l, k = 97, key = 0, flag = 0, index = 0, keyVal;
        String pt;
        char[] ct1 = new char[10];
        char[] pt1 = new char[10];
        char temp;
        System.out.println("ENTER PLAIN TEXT");
        pt = sc.next();
        System.out.println("ENTER KEY VALUE :");
        key = sc.nextInt();
        for (i = 0; i < pt.length(); i++) {
            for (j = 0; j < 26; j++) {

                if (pt.charAt(i) == ' ') {
                    flag = 0;
                    break;
                }
                temp = (char) (j + k);
                if (pt.charAt(i) == temp) {
                    flag = 1;
                    index = j;
                    break;
                }
            }
            if (flag == 1) {

                char c = (char) (((index + key) % 26) + 97);
                ct1[i] = c;

            }
        }
        System.out.println("ENCRYPTED DATA:");
        for (i = 0; i < pt.length(); i++) {
            System.out.print(ct1[i]);
        }
        System.out.println("\n" + "DECRYPTION OF DATA USING BRUTE-FORCE ATTACK :");
        key = 1;
        while (key <= 26) {
            for (i = 0; i < pt.length(); i++) {
                for (j = 0; j < 26; j++) {
                    if (ct1[i] == ' ') {
                        flag = 0;
                        break;
                    }
                    temp = (char) (j + k);
                    if (ct1[i] == temp) {
                        flag = 1;
                        index = j;
                        break;
                    }
                }
                keyVal = index - key;
                if (flag == 1 & keyVal > 0) {
                    pt1[i] = (char) ((keyVal % 26) + 97);

                } else if (flag == 1) {
                    pt1[i] = (char) ((26 + keyVal) + 97);
                }

            }
            System.out.print("\n" + "DECRYPTED DATA:");
            for (i = 0; i < pt.length(); i++) {
                System.out.print(pt1[i]);
            }
            key++;
        }
    }
}