package javaarray;

import java.util.Scanner;

public class JavaArray {

    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    
    int[] a = new int [10];
   
    
     for ( int i =0; i < a.length; i++){
     System.out.println("Informe o número "+(i+1)+"°: "); 
     a[i]= leia.nextInt();
     }
    System.out.println("Informe mais um número: ");
    int X = leia.nextInt();
    
    System.out.println ("O resultado da multiplicação é: ");
    
    
    for ( int i2 = 0; i2 < a.length; i2++){
    int resultado  = (X*a[i2]);
    
    
    int [] m = new int [resultado];
    System.out.println(m.length);
    
    }
    }
}
