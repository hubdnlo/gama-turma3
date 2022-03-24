package br.conta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
    private Conta c;

    @BeforeEach
    public void setup() {
        c = new ContaCorrente(1, 100);
    }

    @Test
    public void deveSacarValor(){      
        c.saca(100);
        assertEquals(0, c.getSaldo());     
    }

    @Test
    public void deveDepositarValor(){       
        c.deposita(100);
        assertEquals(200, c.getSaldo());         
    }
}
