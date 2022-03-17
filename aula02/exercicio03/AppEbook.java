package exercicio03;

public class AppEbook {
    
    public static void main(String[] args) {

        Ebook livro = new Ebook("Java", "Nerdson Java Blanston", 100); 

        System.out.println(livro.mostrarDados());
        livro.avancarPagina();
        System.out.println(livro.getPaginaAtual());
        livro.voltarPagina();
        livro.voltarPagina();
        System.out.println(livro.getPaginaAtual());

        boolean alterou = livro.irParaPagina(400);
        if(alterou){
            System.out.println("Foi para a página");
        }
        System.out.println("Página inválida");        
        
    }
}
