package aula04;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[2][5];
        for (int i=0; i<2;i++ ) {
            for (int y=0; y<5; y++){
                System.out.println("Digite um número:");
                matriz[i][y] = sc.nextDouble();
                System.out.println(matriz[i][y]);
            }
        }
    }
}
