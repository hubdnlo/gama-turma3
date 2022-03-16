import java.util.Scanner;

/*
Escreva um programa que leia um número inteiro digitado pelo usuário e exiba uma sequência 
de números de 1 até o valor digitado pelo usuário. 
Por exemplo, se o usuário digitar o número 8, o programa deve mostrar
1 2 3 4 5 6 7 8
*/

public class Exercicio03 {
    public static void main(String[] args) {

        int mostrar;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o número");        
		mostrar = teclado.nextInt();

        teclado.close();

		for (int contador=1; contador<=mostrar; contador ++) {
               System.out.print(contador+" ");
        }
    }
}