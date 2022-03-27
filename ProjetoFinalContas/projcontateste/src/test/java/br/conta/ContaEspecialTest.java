package br.conta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaEspecialTest {
    private Conta c;

    @BeforeEach
    public void setup() {
        c = new ContaEspecial(1, 100, 100);
    }

    @Test
    public void deveSacarValor(){      
        c.saca(250);
        assertEquals(100, c.getSaldo());     
    }
}
