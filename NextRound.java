import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] puntuaciones = new int[n];
        for (int i = 0; i < n; i++) {
            puntuaciones[i] = sc.nextInt();
        }
        
        int puntajeCorte = puntuaciones[k - 1];
        int aprobados = 0;
        
        for (int i = 0; i < n; i++) {

            if (puntuaciones[i] >= puntajeCorte && puntuaciones[i] > 0) {
                aprobados++;
            }
        }
        
        System.out.println(aprobados);
        sc.close();
    }
}