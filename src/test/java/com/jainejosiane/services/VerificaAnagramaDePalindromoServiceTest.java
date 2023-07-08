package com.jainejosiane.services;

import com.jainejosiane.exceptions.PalavraVaziaException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class VerificaAnagramaDePalindromoServiceTest {

    private VerificaAnagramaDePalindromoService service;

    @Before
    public void setup() {
        service = new VerificaAnagramaDePalindromoService();
    }

    @Test
    public void deveVerificarAnagramaDePalindromo() throws PalavraVaziaException {

        //cenario
        String palavra = "racecar";
        boolean resultado = true;

        //acao
        boolean recebido = service.verificar(palavra);

        //verificacao
        assertThat(recebido, is(resultado));
    }

    @Test
    public void deveLancarExcecaoPalavraVazia() {

        //cenario
        String palavra = "";

        //acao
        try {
            service.verificar(palavra);
            fail();
        } catch (PalavraVaziaException exception) {
            assertThat(exception.getMessage(), is("Palavra vazia"));
        }
    }
}