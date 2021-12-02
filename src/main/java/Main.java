import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreve um númerozinho: ");
        int x = sc.nextInt();

        while (x != 9) {
            System.out.println("Escreve o número 9... ");
            System.out.println("Escreve um númerozinho: ");
            x = sc.nextInt();
        }
    }
}
