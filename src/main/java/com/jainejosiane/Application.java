package com.jainejosiane;

import com.jainejosiane.exceptions.FraseVaziaException;
import com.jainejosiane.exceptions.NaoReverteFraseComUmaPalavraException;
import com.jainejosiane.exceptions.PalavraVaziaException;
import com.jainejosiane.services.*;

public class Application {

    public static void main(String[] args) {

        System.out.println("1. Reverta a ordem das palavras, mantendo a ordem das palavras: ");
        String input = "Hello, World! OpenAI is amazing";
        System.out.println("Input: " + input);

        ReverteOrdemDasPalavrasService service1 = new ReverteOrdemDasPalavrasService();
        try {
            String output = service1.reverter(input);
            System.out.println("Output: " + output + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("2. Remova todos os caracteres duplicados da string abaixo: ");
        input = "Hello, World!";
        System.out.println("Input: " + input);

        RemoveCaracterDuplicadoService service2 = new RemoveCaracterDuplicadoService();
        try {
            String output = service2.remover(input);
            System.out.println("Output: " + output + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("3. Encontre a substring palindroma  mais longa na string abaixo: ");
        input = "babad";
        System.out.println("Input: " + input);

        GeraSubstringPalindromaMaisLongaService service3 = new GeraSubstringPalindromaMaisLongaService();
        String output = service3.gerar(input);
        System.out.println("Output: " + output + "\n");

        System.out.println("4. Coloque em maiúscula a primeira letra de cada frase na string: ");
        input = "hello, how are you? i'm fine, thank you.";
        System.out.println("Input: " + input);

        ConverteAPrimeiraLetraEmMaiusculaService service4 = new ConverteAPrimeiraLetraEmMaiusculaService();
        try {
            output = service4.converter(input);
            System.out.println("Output: " + output + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("5. Verifique se a string é um anagrama de um palíndromo: ");
        input = "racecar";
        System.out.println("Input: " + input);

        VerificaAnagramaDePalindromoService service5 = new VerificaAnagramaDePalindromoService();
        try {
            boolean output1 = service5.verificar(input);
            System.out.println("Output: " + output1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}