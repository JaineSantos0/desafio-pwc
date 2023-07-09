package com.jainejosiane.services;

import com.jainejosiane.exceptions.FraseVaziaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

public class ConverteAPrimeiraLetraEmMaiusculaServiceTest {

    private ConverteAPrimeiraLetraEmMaiusculaService service;

    @Before
    public void setup() {
        service = new ConverteAPrimeiraLetraEmMaiusculaService();
    }

    @Test
    public void deveConverteAprimeiraLetraEmMaiuscula() throws FraseVaziaException {

        //cenario
        String fraseEntrada = "hello. how are you? i'm fine, thank you.";
        String fraseSaida = "Hello. How are you? I'm fine, thank you.";

        //acao
        String fraseConvertida = service.converter(fraseEntrada);

        //verificacao
        assertThat(fraseConvertida, is(fraseSaida));
    }

    @Test
    public void deveLancarExcecaoFraseVazia() {

        //cenario
        String fraseEntrada = "";

        //acao
        try {
            service.converter(fraseEntrada);
            fail();
        } catch (FraseVaziaException exception) {
            Assert.assertThat(exception.getMessage(), is("Frase vazia"));
        }
    }
}