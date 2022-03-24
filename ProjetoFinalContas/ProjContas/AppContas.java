package ProjContas;

import java.util.Scanner;

import ProjContas.modelo.Conta;
import ProjContas.modelo.ContaCorrente;
import ProjContas.modelo.ContaEspecial;
import ProjContas.util.GerenciaConta;

public class AppContas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciaConta contas = new GerenciaConta();
        int opcao = 0;
        int conta;
        double saldo, chequeEspecial, valor;
        String entradaDigitada;
        Conta c;        
        
        while (opcao != 7) {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Procurar");            
            System.out.println("4-Apagar");
            System.out.println("5-Depositar");
            System.out.println("6-Sacar");
            System.out.println("7-Sair");
            System.out.print("Sua opção: ");            
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a conta:");                    
                    conta = teclado.nextInt();
                    System.out.println("Digite o saldo:");
                    saldo = teclado.nextDouble();                    
                    c = new ContaCorrente(conta, saldo);
                    contas.adicionar(c);
                    break;
                case 2:
                    System.out.println("Digite a conta:");                    
                    conta = teclado.nextInt();;
                    System.out.println("Digite o saldo:");
                    saldo = teclado.nextDouble();
                    System.out.println("Digite o valor do cheque especial:");
                    chequeEspecial = teclado.nextDouble();
                    c = new ContaEspecial(conta, saldo, chequeEspecial);
                    contas.adicionar(c);
                    break;
                case 3:
                    System.out.println("Digite o número da conta para procurar:");                    
                    conta = teclado.nextInt();
                    System.out.println(contas.exibir(conta));
                    break;                
                case 4:
                    System.out.println("Digite a conta a ser removida:");                    
                    conta = teclado.nextInt();
                    boolean removeu = contas.remover(conta);
                    if(removeu) {
                        System.out.println("Conta removida com sucesso");
                    } else {
                        System.out.println("Não foi possível remover a conta");
                    }
                    break;
                case 5:
                    System.out.println("Digite o valor a ser depositado:");                    
                    valor = teclado.nextDouble();
                    System.out.println("Digite a conta a ser creditada:");                    
                    conta = teclado.nextInt();
                    contas.deposita(conta, valor);                    
                    break;
                case 6:
                    System.out.println("Digite o valor a ser sacado:");                    
                    valor = teclado.nextDouble();
                    System.out.println("Digite a conta a ser debitada:");                    
                    conta = teclado.nextInt();
                    contas.saca(conta, valor);
                    break;
                case 7:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        teclado.close();
    
    }
}
