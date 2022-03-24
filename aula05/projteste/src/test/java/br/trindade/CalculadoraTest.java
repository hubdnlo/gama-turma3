
package br.trindade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora c;

    @BeforeEach
    public void setup(){
        c = new Calculadora();
    }

    @Test
    public void deveRetornarASomaDosValores(){        
        double resultado = c.somar(10, 20);

        assertEquals(30, resultado);
    }

    @Test
    public void deveRetornarASubtracaoDosValores(){        
        double resultado = c.subtrair(20, 10);

        assertEquals(10, resultado);
    }

    @Test
    public void deveRetornarAMultiplicacaoDosValores(){        
        double resultado = c.multiplicar(20, 10);

        assertEquals(200, resultado);
    }

    @Test
    public void deveRetornarDivisaoQuandoDenominadorDiferenteZero(){        
        double resultado = c.dividir(10, 2);

        assertEquals(5, resultado);
    } 

    @Test
    public void deveRetornarNegativoQuandoDenominadorDiferenteZero(){        
        double resultado = c.dividir(20, 0);

        assertEquals(-1, resultado);
    } 
}
