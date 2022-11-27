public class printing1 {

    public static void main(String[] args) {
        int x = 10;
        float y = 12.56f;
        String str = "Java Program";

        System.out.printf("%3$s %2$f %1$d",str,y,x);
        // System.out.printf("Hello %d %f %c %s\n",x,y,z,str);
        // (%o for octal), (%x for hexadecimal), (%e,%f,%g for float value's)
    }
}
