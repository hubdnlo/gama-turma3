/*
Considere que você está desenvolvendo um aplicativo de livro eletrônico. 
Você deve criar uma classe chamada Ebook com os seguintes atributos:
título, autor, total de páginas e número da página atual.
A classe deve ter os seguintes métodos:
Avançar uma página
Voltar uma página
Mudar para uma página informada
Mostrar o número da página atual
Monstrar os dados do livro
Escreva  o app main para criar um objeto e testar os métodos.   
*/

package exercicio03;

public class Ebook {

    private String titulo, autor;
	private int totalPaginas, paginaAtual;
	
	// construtor
	public Ebook(String titulo, String autor, int totalPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		if(totalPaginas > 0){
			this.totalPaginas = totalPaginas;
		}		
	}

    public void mostrar(){
		System.out.println("Titulo = " + titulo + ". Autor = " + autor + ". Total de páginas = " + totalPaginas);
	}
    
    public void avancarPagina(){
		if(paginaAtual < totalPaginas){
			this.paginaAtual++;
		}
	}

    public void voltarPagina(){
		if(paginaAtual > 0){
			this.paginaAtual--;
		}
	}

    public int getPaginaAtual() {
        return paginaAtual;
    }

	public boolean irParaPagina(int pagina){
		if(pagina >= 0 && pagina <= totalPaginas){
			paginaAtual = pagina;
			return true;
		}
		return false;
	}

	public String mostrarDados(){
		return "Titulo = " + titulo + ". Autor = " + autor + ". Total de páginas = " + totalPaginas;
	}
    
}
