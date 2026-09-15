import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {

        System.out.println("En cuantas partes se dividirá la sandía?");
        
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        if (w % 2 == 0 && w > 2) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
