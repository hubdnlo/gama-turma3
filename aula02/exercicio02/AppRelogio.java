package exercicio02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(10, 17, 27); 
        
        // ou seja os gets não permitem alterar p/ hora negativa (hora que não existe)
        relogio.setHora(-24);
        relogio.setMinuto(-59);
        relogio.setSegundo(-59);

        relogio.setHora(00);
        relogio.setMinuto(39);
        relogio.setSegundo(59);

        relogio.mostrar();
        System.out.println("Hora = " + relogio.getHoraAtual());
        
    }
}
