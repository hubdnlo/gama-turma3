package exercicio05;

public class AppPlacar {
    
    public static void main(String[] args) {
        Placar placar = new Placar ("Braziliano", "Paraguaio");
        
        placar.setPlacarTime1(2);
        placar.setPlacarTime2(1);
        
        System.out.println("Placar: " + placar.exibirPlacar());
        
    }
}
