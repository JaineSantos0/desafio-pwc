package com.jainejosiane.services;

import com.jainejosiane.exceptions.FraseVaziaException;

public class ConverteAPrimeiraLetraEmMaiusculaService {

    public String converter(String entrada) throws FraseVaziaException {

        if (entrada.isEmpty()){
            throw new FraseVaziaException("Frase vazia");
        }

        StringBuilder resultado = new StringBuilder();
        Boolean novaSentenca = true;

        for (char c : entrada.toCharArray()) {
            if (novaSentenca && Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                novaSentenca = false;
            } else if (c == '.' || c == '!' || c == '?') {
                novaSentenca = true;
            }

            resultado.append(c);
        }

        String saida = resultado.toString();
        return saida;
    }
}