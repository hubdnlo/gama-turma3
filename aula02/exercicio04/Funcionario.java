/*
Construir uma classe para representar um funcionário com os seguintes atributos: 
nome, horas trabalhadas e valor pago por hora trabalhada. Implementar um método para 
calcular e retornar o salário final de um funcionário e um método para exibir os dados do funcionário.

Criar uma subclasse para representar um funcionário sênior. A diferença entre eles é que um funcionário
sênior recebe um bônus a cada 10 horas trabalhadas. O bônus é um atributo do funcionário sênior. 
Sobrescreva os métodos calcularSalario() e exibirDados() para esta regra.

Criar uma classe AppFuncionario para instanciar objetos da classe Funcionario e Sênior e realizar 
chamada a seus métodos.

*/

package exercicio04;

public class Funcionario {

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    // construtor
    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		this.nome = nome;
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
	}

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if(horasTrabalhadas > 0)
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        if(valorHora > 0)
        this.valorHora = valorHora;
    }

    public double calcularSalario(){
        return horasTrabalhadas * valorHora;
    }

    public String exibirDados(){
        return nome + ", " + horasTrabalhadas + ", " + valorHora;
    }
}
