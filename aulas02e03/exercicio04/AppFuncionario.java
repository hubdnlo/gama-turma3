package exercicio04;

public class AppFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Joaquim", 30, 20);
        Senior s = new Senior("Ana", 25, 20, 20);

        System.out.println(f.exibirDados());
        System.out.println("Salario = " + f.calcularSalario());

        System.out.println(s.exibirDados());
        System.out.println("Salario = " + s.calcularSalario());
    }
}
