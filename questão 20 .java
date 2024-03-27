//Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//entrada de dados 
        System.out.println("Digite um número inteiro: ");
        int numero = input.nextInt();
//fatorial
        int fatorial = 1;
        int i = 1;

      while (numero > 16) {
          System.out.println("Digite um número inteiro e menor 16: ");
        numero = input.nextInt();
      }
        while (i <= numero) {
            fatorial *= i;
            i++;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
      
    }
}