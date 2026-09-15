import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if (x < 0) {
            System.out.println("false");
        } else {
            int original = x;
            int invertido = 0;
            
            while (x != 0) {
                int ultimoDigito = x % 10;
                invertido = invertido * 10 + ultimoDigito;
                x /= 10;
            }
            
            if (original == invertido) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
    }
}