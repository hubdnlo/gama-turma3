package exercicio01;
/*
Crie a classe veículo, com os atributos modelo, marca e consumo (quantos km/l).
Faça um construtor para inicializar os atributos da classe.
Escreva um método para mostrar na tela os dados do carro (modelo, marca) e outro método para retornar 
o valor do consumo.
Faça um arquivo com o método main para testar a classe criada, ou seja, criar um objeto e exibir os dados.
*/

public class Veiculo {

    private String marca, modelo;
	private double consumo;
	
	// construtor
	public Veiculo(String marca, String modelo, double consumo) {
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
	}

	public void mostrar(){
		System.out.println("Marca = " + marca + ". Modelo = " + modelo);
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double novoConsumo){
		if(novoConsumo >0){
			this.consumo = novoConsumo;
			System.out.println("Consumo alterado com sucesso");
			return;
		}
		System.out.println("Consumo não alterado. Inclua um valor maior ou igual a 0");
		return;
	}
}