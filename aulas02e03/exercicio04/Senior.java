package exercicio04;

public class Senior extends Funcionario {
    private double bonus;

    public Senior(String nome, int horasTrabalhadas, double valorHora, double bonus){
        super(nome, horasTrabalhadas, valorHora);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + (getHorasTrabalhadas() / 10) * bonus;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", " + bonus;
    }
}
