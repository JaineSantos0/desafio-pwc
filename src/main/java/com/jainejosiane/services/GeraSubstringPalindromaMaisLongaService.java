package com.jainejosiane.services;

public class GeraSubstringPalindromaMaisLongaService {

    public String gerar(String entrada) {

        if (entrada == null || entrada.length() < 1) {
            return " ";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < entrada.length(); i++) {
            int len1 = expandiDoMeio(entrada, i, i);
            int len2 = expandiDoMeio(entrada, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return entrada.substring(start, end + 1);
    }

    public int expandiDoMeio(String palavra, int left, int right) {

        if (palavra == null || left > right) {
            return 0;
        }

        while(left >= 0 && right < palavra.length() && palavra.charAt(left) == palavra.charAt(right)) {
            left --;
            right ++;
        }

        return right - left - 1;
    }
}
