/*
Crie uma classe chamada Placar, que representa o placar de um jogo de futebol. 
Pense quais atributos devem ser adicionados à classe, e faça 3 construtores:

– Um construtor padrão (default, sem parâmetros);
– Um construtor que tenha apenas os nomes dos times do jogo (mantendo o placar em 0 a 0);
– Um construtor que defina os nomes dos times e o placar do jogo;

Crie no main três objetos do tipo placar, um para cada tipo de construtor, e exiba os dados do placar da seguinte forma: 	
Nome do Time1 Gols X Gols Nome do Time2.

Por exemplo: São Paulo 1 X 0 Corinthians

*/

package exercicio05;

public class Placar {

    private String Time1, Time2;
	private int placarTime1, placarTime2;
	
	// construtor1
    public Placar(){

    }

    // construtor2
	public Placar(String Time1, String Time2) {
		this.Time1 = Time1;
		this.Time2 = Time2;		
        setPlacarTime1(placarTime1);
        setPlacarTime2(placarTime2);
	}
    
    // construtor3
    public Placar(int placarTime1, int placarTime2) {
        if(placarTime1 >= 0)	
        this.placarTime1 = placarTime1;
        if(placarTime2 >= 0)
        this.placarTime2 = placarTime2;	
	}

    public void setPlacarTime1(int placarTime1) {
        if(placarTime1 >= 0)
        this.placarTime1 = placarTime1;
    }

    public void setPlacarTime2(int placarTime2) {
        if(placarTime2 >= 0)
        this.placarTime2 = placarTime2;
    }

    public String exibirPlacar(){
        return Time1 + " = " + placarTime1 + ". " + Time2 + " = " + placarTime2+ ".";
    }
}
