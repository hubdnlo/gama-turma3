package exercio01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("VW", "Gol", 0);
        Veiculo veiculo2 = new Veiculo("Ford", "Fox", 10);

        veiculo.mostrar();
        System.out.println("Consumo = " + veiculo.getConsumo());
        
        veiculo2.mostrar();
        veiculo2.setConsumo(12);
        System.out.println("Consumo = " + veiculo2.getConsumo());  
    }
}
