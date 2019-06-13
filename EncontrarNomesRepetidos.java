package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    String[] nomes = new String[3];
    String[] nomes2 = new String[1];
    String aux; 
    
    boolean achei = false;
     
    for ( int i = 0; i < nomes.length; i++){
    System.out.println("Informe o "+(i+1)+"° nome");
     nomes[i] = leia.next();
    }
    System.out.println("Informe outro nome: ");
    aux = leia.next();
         
    for (int i2 = 0; i2 < nomes.length; i2++){
    if (nomes [i2].equals(aux)){
    achei= true;
    break;     
    }
}
    if (achei == true){
    System.out.println("ACHEI!!");    
    } else
    System.out.println("NÃO ACHEI!!");    
   
    
    } 
    }
