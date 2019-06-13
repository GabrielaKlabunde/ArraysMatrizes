package javaapplication2;

import java.util.Random;

public class JavaApplication2 {

    public static void main(String[] args) {
    
    String[]nomes = new String [10];
    // 10 
    nomes [0] = "Gabriela";
    nomes [1] = "Fabiana";
    nomes [2] = "Luis";
    nomes [3] = "Lucas";
    nomes [4] = "Paola";
    nomes [5] = "Jessica";
    nomes [6] = "Amanda";
    nomes [7] = "Yara";
    nomes [8] = "João";
    nomes [9] = "Joaquina";
   
    Random r = new Random();
    int idx = r.nextInt(nomes.length);
   
    System.out.println(nomes[idx]);
    
    }
    
}
