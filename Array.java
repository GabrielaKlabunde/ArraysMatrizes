package javaarray3;

import java.util.Scanner;

public class JavaArray3 {

    public static void main(String[] args) {
        // vetor de 20 números
        Scanner leia = new Scanner(System.in);
        int outroNumero;
        boolean existe = false;
        int posicao = 0;

        int[] numero = new int[20];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Informe o " + (i + 1) + "° número");
            numero[i] = leia.nextInt();
            int resultado = numero.length - 1;
            if (i >= resultado) {
                System.out.println("Informe outro número: ");
                int buscanmr = leia.nextInt();
                for (int i2 = 0; i2 < numero.length; i2++) {
                    if (buscanmr == numero[i2]) {
                        existe = true;
                        posicao = i2;
                        break;
                    }
                }
            }
        }
        if (existe) {
            System.out.println("Existe!");
            for (int i = 0; i < numero.length; i++) {
                if (i == posicao) {
                    System.out.println(" ..................");
                } else {
                    System.out.println(numero[i]);
                }
            }
        }else{
        System.out.println("");
        System.out.println("Não existe");
        }
    }
}


