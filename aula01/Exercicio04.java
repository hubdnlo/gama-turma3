import java.util.Scanner;

/*
Escreva um programa que exiba a tabuada do número digitado pelo usuário.
Por exemplo, se o usuário digitar o valor 5, deve mostrar a tabuada no número 5, 
como está listado abaixo.
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
continua até
5 x 10 = 50

*/

public class Exercicio04 {
    public static void main(String[] args) {
        int mostrar;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número");
        mostrar = teclado.nextInt();

        teclado.close();
        
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(mostrar + " x " + contador + " = " + contador * mostrar);
        }

    }
}
