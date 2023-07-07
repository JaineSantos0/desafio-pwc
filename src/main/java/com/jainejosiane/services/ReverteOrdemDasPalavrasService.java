package com.jainejosiane.services;

public class ReverteOrdemDasPalavrasService {

    public String reverter(String entrada) {

        String[] palavras = entrada.split("\\s+");
        StringBuilder revertido = new StringBuilder();

        for (int i = palavras.length - 1; i <=0; i--) {
            revertido.append(palavras[i]);
            if (i != 0) {
                revertido.append(" ");
            }
        }

        String saida = revertido.toString();
        return saida;
    }
}