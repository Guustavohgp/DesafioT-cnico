import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Scanner;

public class VerificarString {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
          // Pedir ao usuário para fornecer uma string
        System.out.print("Digite seu texto para verificar a quantidade de letras A: ");
        String entrada = scanner.nextLine();

        // Chamar função para contar a quantidade de 'a' (maiúscula e minúscula)
        int quantidade = contarLetraA(entrada);

        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece.");
        }

        scanner.close();
    }

    // Função para contar as ocorrências da letra 'a' (maiúscula ou minúscula)
    public static int contarLetraA(String texto) {
        int contador = 0;

        // Loop para verificar cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        return contador;
    }
}