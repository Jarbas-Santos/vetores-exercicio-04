import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
            }
        }
        System.out.println();

        int pairNumbers = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                pairNumbers++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = " + pairNumbers);

        sc.close();
    } 
}