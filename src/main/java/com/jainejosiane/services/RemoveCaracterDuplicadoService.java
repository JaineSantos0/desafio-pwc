package com.jainejosiane.services;

import com.jainejosiane.exceptions.FraseVaziaException;

public class RemoveCaracterDuplicadoService {

    public String remover(String entrada) throws FraseVaziaException {

        if (entrada.isEmpty()){
            throw new FraseVaziaException("Frase vazia");
        }

        StringBuilder palavrasTratadas = new StringBuilder();

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (indexOfIgnoreCase(palavrasTratadas,(String.valueOf(c))) == -1 || String.valueOf(c).isBlank()) {
                palavrasTratadas.append(c);
            }
        }
        String saida = palavrasTratadas.toString();

        return saida;
    }

    public int indexOfIgnoreCase(StringBuilder sb, String search ) {
        String str = sb.toString().toLowerCase();
        String searchLower = search.toLowerCase();

        return str.indexOf(searchLower);
    }
}