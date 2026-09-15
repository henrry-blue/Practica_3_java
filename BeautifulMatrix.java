import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filaUno = 0;
        int colUno = 0;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int valor = sc.nextInt();
                if (valor == 1) {
                    filaUno = i;
                    colUno = j;
                }
            }
        }
        
        int movimientos = Math.abs(filaUno - 3) + Math.abs(colUno - 3);
        
        System.out.println(movimientos);
        sc.close();
    }
}
