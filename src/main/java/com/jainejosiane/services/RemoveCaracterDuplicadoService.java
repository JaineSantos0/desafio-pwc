package com.jainejosiane.services;

public class RemoveCaracterDuplicadoService {

    public String remover(String entrada) {

        StringBuilder palavrasTratadas = new StringBuilder();

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (palavrasTratadas.indexOf(String.valueOf(c)) == -1 || String.valueOf(c).isBlank()) {
                palavrasTratadas.append(c);
            }
        }
        String saida = palavrasTratadas.toString();

        return saida;
    }
}