package br.conta;

public class ContaEspecial extends Conta {
    private double chequeEspecial;

    public ContaEspecial(int conta, double saldo, double chequeEspecial) {		
        super(conta, saldo);
		if(chequeEspecial <0)
			return;
        this.chequeEspecial = chequeEspecial;
    }

    public boolean saca(double valor) {
		if ((getSaldo() + chequeEspecial) >= valor){
			return super.saca(valor);
		}
		return false;

	}
    
}
