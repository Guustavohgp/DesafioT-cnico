import java.util.Scanner;

public class ValorSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int indece = 13, soma = 0, k = 1;
    
        while (k<indece){
            k = k+1; 
            soma = soma + k;

            System.out.println(soma);
        }
    } 
}