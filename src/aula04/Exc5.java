package aula04;

public class Exc5 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,50,4,5},{1,2,3,4,99}};
        int linha = 0;
        int soma = 0;
        double media = 0;

            for (int y=0; y<matriz[linha].length; y++){
                soma += matriz[linha][y];
            }
            media = soma/matriz[linha].length;

        System.out.println("A média da linha " + linha + " é: " + media);
    }
}

