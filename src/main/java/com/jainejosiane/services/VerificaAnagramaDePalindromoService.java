package com.jainejosiane.services;

import com.jainejosiane.exceptions.FraseVaziaException;
import com.jainejosiane.exceptions.PalavraVaziaException;

public class VerificaAnagramaDePalindromoService {

    public boolean verificar(String entrada) throws PalavraVaziaException {

        if (entrada.isEmpty()){
            throw new PalavraVaziaException("Palavra vazia");
        }

        StringBuilder palavraInversa = new StringBuilder();

        for (int i = (entrada.length() -1); i >= 0; i--) {
            char c = entrada.charAt(i);
            palavraInversa.append(c);
        }

        String saida = palavraInversa.toString();
        if (entrada.equalsIgnoreCase(saida)) {
            return true;
        } else {
            return false;
        }
    }
}
