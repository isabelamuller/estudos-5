import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreve um númerozinho de 0 a 10: ");
        int x = sc.nextInt();

        int count = 0;
        while (x != 9) {
            System.out.println("Tenta de novo... ");
            System.out.println("Escreve outro número: ");
            x = sc.nextInt();
            count++;
        }
        System.out.println("Tu tentou " + count + " vezes até acertar o número!!!");
    }
}
