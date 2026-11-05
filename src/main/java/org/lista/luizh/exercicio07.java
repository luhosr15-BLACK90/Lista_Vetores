package org.lista.luizh;

public class exercicio07 {
    public static void main(String[] args) {
        String[] nomes = new String[]{"José", "Rafaela", "Lucas", "Paulo", "Paula", "Bruna"};
        int[] totalVendas = new int[]{6, 7, 5, 2, 3, 9};

        System.out.println("-----RANKING VENDAS-----");

        for (int i = 0; i < totalVendas.length; i++) {
            for (int j = 0; j < totalVendas.length - 1; j++) {
                if (totalVendas[j] < totalVendas[j + 1]) {

                    int valorVenda = totalVendas[j];
                    totalVendas[j] = totalVendas[j + 1];
                    totalVendas[j + 1] = valorVenda;

                    String nomeVenda = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = nomeVenda;
                }
            }
        }
        for (int i = 0; i < totalVendas.length; i++) {
            System.out.println(nomes[i] + ": " + totalVendas[i]);
        }
    }
}

