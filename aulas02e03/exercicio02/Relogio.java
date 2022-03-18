/*
Escreva a classe Relógio, com os atributos hora, minuto e segundo, e com um construtor que recebe horas,
 minutos e segundos para inicializar o relógio.
Faça um método da classe para exibir a hora atual. Crie os getters e setters para os atributos.
Faça um programa (main) que crie um objeto do tipo Relógio e exiba a hora atual do relógio.
O relógio não pode aceitar valores inválidos, ou seja, a hora deve estar entre 0 e 23, 
o minuto e o segundo devem estar entre 0 e 59.
*/

package exercicio02;

public class Relogio {

	private int hora, minuto, segundo;

    	// construtor
	public Relogio(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
        setSegundo(segundo);
	}

    public void mostrar(){
		System.out.println("Hora(s): " + hora + ". Minuto(s): " + minuto + ". Segundo(s): " + segundo);
	}

    public String getHoraAtual(){
        return hora + ":" + minuto + ":" + segundo;
    }

	public int getHora() {
        return hora;     	   
	}
    public int getMinuto() {
        return minuto;     	   
	}
    public int getSegundo() {
        return segundo;     	   
	}
   
    public void setHora(int novaHora) {
        if(novaHora >=0 && novaHora<24){
            this.hora = novaHora;
        }       	   
	}
    public void setMinuto(int novoMinuto) {
        if(novoMinuto >=0 && novoMinuto <60){
            this.minuto = novoMinuto;
        }  	   
	}
    public void setSegundo(int novoSegundo) {
        if(novoSegundo >=0 && novoSegundo <60){
            this.segundo = novoSegundo;
        } 	   
	}
}
