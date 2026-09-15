import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println(a.length() + b.length());
        
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String capA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capB = b.substring(0, 1).toUpperCase() + b.substring(1);
        
        System.out.println(capA + " " + capB);
        sc.close();
    }
}