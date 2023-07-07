package com.jainejosiane.services;

import com.jainejosiane.exceptions.FraseVaziaException;
import com.jainejosiane.exceptions.NaoReverteFraseComUmaPalavraException;

public class ReverteOrdemDasPalavrasService {

    public String reverter(String entrada) throws FraseVaziaException, NaoReverteFraseComUmaPalavraException {

       if (entrada.isEmpty()){
           throw new FraseVaziaException("Frase vazia");
       }

        String[] palavras = entrada.split("\\s+");
       if(palavras.length == 1) {
           throw new NaoReverteFraseComUmaPalavraException("Não pode converter frase com uma palavra");
       }

        StringBuilder revertido = new StringBuilder();

        for (int i = palavras.length - 1; i >=0; i--) {
            revertido.append(palavras[i]);
            if (i != 0) {
                revertido.append(" ");
            }
        }

        String saida = revertido.toString();
        return saida;
    }
}