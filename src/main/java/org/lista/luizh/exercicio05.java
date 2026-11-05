package org.lista.luizh;


import java.util.Scanner;


public class exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notas = new int[]{1, 1, 1, 2, 3, 3, 3, 3, 4, 9};
        int[] apareceu = new int[11];

        for (int i = 0; i < notas.length; i++) {
            apareceu[notas[i]]++;
        }
        int maior = 0;
        int notaMaisVotada = 0;
        for (int i = 0; i < apareceu.length; i++) {
            if (apareceu[i] > maior) {
                maior = apareceu[i];
                notaMaisVotada = i;
            }
            System.out.println("O valor " + i + " apareceu " + apareceu[i] + " vezes");
        }
        System.out.println("A nota mais votada foi " + notaMaisVotada + ", aparecendo " + apareceu[notaMaisVotada] + " vezes");
    }

}


