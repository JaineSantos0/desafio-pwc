package com.jainejosiane.services;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeraSubstringPalindromaMaisLongaServiceTest {

    private GeraSubstringPalindromaMaisLongaService service;

    @Before
    public void setup() {
        service = new GeraSubstringPalindromaMaisLongaService();
    }

    @Test
    public void deveGerarSubstringPalindromaMaisLonga() {

        //cenario
        String palavraEntrada = "banana";
        String resultado = "anana";

        //acao
        String palavraSaida = service.gerar(palavraEntrada);

        //verificacao
        assertThat(palavraSaida, is(resultado));
    }
}