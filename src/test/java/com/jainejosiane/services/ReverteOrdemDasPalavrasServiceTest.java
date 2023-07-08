package com.jainejosiane.services;

import com.jainejosiane.exceptions.FraseVaziaException;
import com.jainejosiane.exceptions.NaoReverteFraseComUmaPalavraException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverteOrdemDasPalavrasServiceTest {

    private ReverteOrdemDasPalavrasService service;

    @Before
    public void setup() {
        service = new ReverteOrdemDasPalavrasService();
    }

    @Test
    public void deveReverterOrdemDasPalavras() throws FraseVaziaException, NaoReverteFraseComUmaPalavraException {

        //cenario
        String fraseEntrada = "Hello, World! OpenAI is amazing";
        String fraseSaida = "amazing is OpenAI World! Hello,";

        //acao
        String fraseRevertida = service.reverter(fraseEntrada);

        //verificacao
       assertThat(fraseRevertida, is(fraseSaida));
    }

    @Test
    public void deveLancarExcecaoFraseVazia() throws NaoReverteFraseComUmaPalavraException {

        //cenario
        String fraseEntrada = "";

        //acao
        try {
            service.reverter(fraseEntrada);
            fail();
        } catch (FraseVaziaException exception) {
            assertThat(exception.getMessage(), is("Frase vazia"));
        }
    }

    @Test
    public void deveLancarExcecaoNaoReverteFraseComUmaPalavra() throws FraseVaziaException {

        //cenario
        String fraseEntrada = "Hello";

        //acao
        try {
            service.reverter(fraseEntrada);
            Assert.fail();
        } catch (NaoReverteFraseComUmaPalavraException exception) {
            assertThat(exception.getMessage(), is("Não pode converter frase com uma palavra"));
        }

    }
}