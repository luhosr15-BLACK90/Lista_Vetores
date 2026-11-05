package org.lista.luizh;

public class exercicio06 {
    public static void main(String[] args) {
        int[]senhas = new int[]{1,2,3,4,5,6,7,8,9,10};
        String[]cliente = new String[]{"Nao idoso","idoso","idoso","Nao idoso","idoso","Nao idoso","idoso","Nao idoso","idoso","Nao idoso"};
        int atendimentoIdoso = 0;

        for(int i=0;i<2;i++){
            if(cliente[i].equals("idoso")){
            atendimentoIdoso++;
            }
        }
        System.out.println("total de idosos: " + atendimentoIdoso);
    }
}

