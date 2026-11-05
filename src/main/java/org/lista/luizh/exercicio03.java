package org.lista.luizh;
import java.util.Scanner;

public class exercicio03{
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int[] codigo = new int[]{67, 55, 10, 22,};
            double[] preco = new double[]{19.00, 50.00, 40.50, 20.50};
            int codigoEscolhido = 0;
            boolean encontrado = false;

            System.out.println("Digite o codigo do produto");
            codigoEscolhido = sc.nextInt();

            for (int i = 0; i < codigo.length; i++) {
                if (codigo[i] == (codigoEscolhido)) {
                    encontrado = true;
                    System.out.println(preco[i]);
                    break;
                }
            }if(encontrado==false){
                System.out.println("Produto não cadastrado");
            }
        }
    }
