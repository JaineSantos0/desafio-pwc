package com.jainejosiane.services;

import com.jainejosiane.exceptions.FraseVaziaException;
import com.jainejosiane.exceptions.NaoReverteFraseComUmaPalavraException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class RemoveCaracterDuplicadoServiceTest {

    private RemoveCaracterDuplicadoService service;

    @Before
    public void setup() {
        service = new RemoveCaracterDuplicadoService();
    }

    @Test
    public void deveRemoverCaracterDuplicado() throws FraseVaziaException {

        //cenario
        String fraseEntrada = "Hello, World!";
        String fraseSaida = "Helo, Wrd!";

        //acao
        String fraseSemDuplicacao = service.remover(fraseEntrada);

        //verificacao
        assertThat(fraseSemDuplicacao, is(fraseSaida));
    }

    @Test
    public void deveRemoverCaracterDuplicadoComMaisDeDuasPalavrasDeEntrada() throws FraseVaziaException {

        //cenario
        String fraseEntrada = "Hello, World! My name is Jaine!";
        String fraseSaida = "Helo, Wrd! My na is J";

        //acao
        String fraseSemDuplicacao = service.remover(fraseEntrada);

        //verificacao
        assertThat(fraseSemDuplicacao, is(fraseSaida));
    }

    @Test
    public void deveLancarExcecaoFraseVazia() {

        //cenario
        String fraseEntrada = "";

        //acao
        try {
            service.remover(fraseEntrada);
            fail();
        } catch (FraseVaziaException exception) {
            assertThat(exception.getMessage(), is("Frase vazia"));
        }
    }
}