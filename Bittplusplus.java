import java.util.Scanner;

public class Bittplusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0; 
        
        for (int i = 0; i < n; i++) {
            String operacion = sc.next();
  
            if (operacion.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        
        System.out.println(x);
        sc.close();
    }
}