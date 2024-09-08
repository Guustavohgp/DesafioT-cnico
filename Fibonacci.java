import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        // Loop para não encerrar o programa
        while (continuar.equalsIgnoreCase("s")) {

            // Pedir ao usuário para digitar um número inteiro
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // Lógica para verificar se pertence à sequência de Fibonacci
            if (verificarFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }

            // Perguntar se o usuário quer verificar outro número 
            System.out.print("Deseja verificar outro número? (s/n): ");
            continuar = scanner.next();
        }

        // Encerrar loop
        System.out.println("Programa encerrado.");
        scanner.close();
    }

    // Função para verificar se o número pertence à sequência de Fibonacci
    public static boolean verificarFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int a = 0, b = 1;
        int proximo = a + b;

        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }

        return false;
    }
}