package javaapplication3;

import java.util.Scanner;

public class JavaApplication3{

public static void main(String[] args) {

Scanner leia = new Scanner(System.in);

int contador = 0;
int numlinhas = 0;
int numcolunas = 0;

System.out.println("Insira o número de linhas das matrizes ");
numlinhas = leia.nextInt();
System.out.println("insira o número de colunas das matrizes ");
numcolunas = leia.nextInt();
System.out.println("");

int[][] matrizA = new int[numlinhas][numcolunas];
//MATRIZ A
//Preenche
for (int linha = 0; linha < matrizA.length; linha++) {
for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
System.out.println("Informe o valor da célula " + contador);
matrizA[linha][coluna] = leia.nextInt();
contador++;
}
}

//MATRIZ B
System.out.println("");
System.out.println("informe os valores da matriz B: ");
System.out.println("");
int[][] matrizB = new int[numlinhas][numcolunas];
contador = 0;

// Preenche
for (int linha = 0; linha < matrizB.length; linha++) {
for (int coluna = 0; coluna < matrizB[linha].length; coluna++) {
System.out.println("Informe o valor" + contador);
matrizB[linha][coluna] = leia.nextInt();
contador++;
}
}

//MATRIZ C
int[][] matrizC = new int[numlinhas][numcolunas];
System.out.println("");
System.out.println("O resultado da matrizC é");
System.out.println("");

for (int linha = 0; linha < matrizA.length; linha++) {
for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
System.out.print("[" + linha + "]" + "[" + coluna + "]" + " | " + matrizC[linha][coluna] + "\t");
}
System.out.println("");

}
}
}
