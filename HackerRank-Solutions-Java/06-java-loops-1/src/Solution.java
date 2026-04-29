import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Le o numero inteiro N
        int N = scanner.nextInt();

        // Loop de 1 ate 10
        for (int i = 1; i <= 10; i++) {
            // Calcula o resultado
            int result = N * i;

            // Imprime no formato: N x i = result
            System.out.printf("%d x %d = %d%n", N, i, result);
        }

        scanner.close();
    }
}