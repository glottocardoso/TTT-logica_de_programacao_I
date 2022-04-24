package aula04;

import java.util.Random;

public class Exc9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][5];
        int somaLinha[] = new int[3];
        int somaColuna[] = new int[5];
        int somaLinhaInt = 0;
        int somaColunaInt = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhaInt += matriz[i][j];
            }
            somaLinha[i] = somaLinhaInt;
            somaLinhaInt = 0;
            System.out.println("Soma da linha " + i + ": " + somaLinha[i]);
        }
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                somaColunaInt += matriz[j][i];
            }
            somaColuna[i] = somaColunaInt;
            somaColunaInt = 0;
            System.out.println("Soma da coluna " + i + ": " + somaColuna[i]);
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz [" + i + "]["+j+"]: "+matriz[i][j]);
            }
        }
    }
}
