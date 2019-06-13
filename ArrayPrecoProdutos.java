
package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
    
    double [] precosProdutos = new double [10];
    // o indice sempre vai começar com o 0
    precosProdutos [0] = 10;
    precosProdutos [1] = 85;
    precosProdutos [2] = 105;
    precosProdutos [3] = 150;
    precosProdutos [4] = 180;
    precosProdutos [5] = 204;
    precosProdutos [6] = 250;
    precosProdutos [7] = 300;
    precosProdutos [8] = 9;
    precosProdutos [9] = 400;
    
    //length : tamanho do indice 
    for (int i = 0; i < precosProdutos.length; i++){
       System.out.println(i+": "+precosProdutos [i]);
    }
    }
    
}

Array com random. sorteio


package javaapplication2;

import java.util.Random;

public class JavaApplication2 {

    public static void main(String[] args) {
    
    double [] precosProdutos = new double [10];
    // o indice sempre vai começar com o 0
    Random r = new Random();
    
    for(int i = 0; i < precosProdutos.length; i++){
       precosProdutos [i] = r.nextDouble(); //SORTEIA UM NUMERO (r =random)
    }
    
    //length : tamanho do indice 
    for (int i = 0; i < precosProdutos.length; i++){
       System.out.println(i+": "+precosProdutos [i]);
    }
    }
    
}
