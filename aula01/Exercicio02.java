import java.util.Scanner;

/*
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. 
Entretanto, o valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
Faça um programa que leia o salário bruto e o valor da prestação e informe se o empréstimo 
pode ou não ser concedido.
*/

public class Exercicio02 {

    public static void main(String[] args) {        
    
    double Salario, ValorParcela;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o Salário R$");
    Salario = teclado.nextDouble();
    System.out.println("Digite o valor da parcela R$");
    ValorParcela = teclado.nextDouble();

    double ValorLimiteParcela = Salario * 0.3;
    System.out.println("O valor limite de cada parcela é de R$ "+ValorLimiteParcela);

    if(ValorParcela > ValorLimiteParcela){
        System.out.println("Empréstimo não concedido");
        return;
    }
    System.out.println("Empréstimo concedido");
    }

}
