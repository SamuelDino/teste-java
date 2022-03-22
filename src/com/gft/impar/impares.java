package com.gft.impar;

import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        String result = "";
        final String ESPACO_BRANCO = " ";
        for (int i=inicio; i<=fim; i++){
            if (i%2!=0){
                result += (String.valueOf(i)+ESPACO_BRANCO);
            }
        }
        System.out.println(result.trim());
    }
}
