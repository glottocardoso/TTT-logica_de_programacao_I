package aula04;

import java.util.Arrays;

public class Exc3 {
    public static void main(String[] args) {
        double[][] matriz = {{1.1,2,99.1,4,5},{1,2,3,4,99}};
        double maiorNumero = 0;

        for (int i=0; i< matriz.length;i++ ) {
            for (int y=0; y<matriz[i].length; y++){
                if (matriz[i][y]>maiorNumero) {
                    maiorNumero = matriz[i][y];
                }
            }
        }
        System.out.println(maiorNumero);
    }
}