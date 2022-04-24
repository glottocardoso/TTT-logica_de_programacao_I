package aula04;

public class Exc4 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,99,4,5},{1,2,3,4,99}};
        int soma = 0;

        for (int i=0; i< matriz.length;i++ ) {
            for (int y=0; y<matriz[i].length; y++){
                soma += matriz[i][y];
            }
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
