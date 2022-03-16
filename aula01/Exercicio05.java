import java.util.Scanner;

/*
Escreva um programa que leia vários números inteiros digitados pelo usuário, até que o usuário digite zero. 
O zero termina o programa e exibe a soma de todos os valores digitados. 
*/
public class Exercicio05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 1, soma = 0;

        //numero = 1;
        //soma = 0;
        while(numero != 0){
            System.out.println("Digite um número inteiro");
            numero = teclado.nextInt();
            soma += numero;
        }
        System.out.println("Soma = " + soma);

        teclado.close();       
                
    }
}
