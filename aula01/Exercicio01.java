import java.util.Scanner;

/**
 * Exercicio01
 * Faça um programa que leia duas notas de um aluno, calcule e mostre a média
 * aritmética do aluno.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        String aluno = "Danilo";
        int nota1 = 10;
        int nota2 = 8;

        System.out.println("O nome do(a) aluno(a) é " + aluno + ". Suas notas são: nota 1: " + nota1 + ", nota 2: "
                + nota2 + ". Média final: " + ((nota1 + nota2) / 2));

        int valor1;
        int valor2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o 1o Valor:");
        valor1 = teclado.nextInt();
        System.out.println("Digite o 2o Valor:");
        valor2 = teclado.nextInt();

        teclado.close();
        System.out.println("Suas notas são: nota 1: " + valor1 + ", nota 2: " + valor2 + ". Média final: "
                + ((valor1 + valor2) / 2));

        /*Scanner teclado2 = new Scanner(System.in);
        double Nota1, Nota2, Media;

        System.out.println("Digite o 1a Nota:");
        Nota1 = teclado.nextInt();
        System.out.println("Digite o 2a Nota:");
        Nota2 = teclado.nextInt();

        Media = Nota1 + Nota2 / 2;

        System.out.println("Suas notas são: nota 1: " + Nota1 + ", nota 2: " + Nota2 + ". Média final: " + Media);

        teclado.close();*/
    }
}