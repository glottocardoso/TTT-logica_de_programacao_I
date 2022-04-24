package aula04;

public class Exc7 {
    public static void main(String[] args) {
        char[] gabarito = {'A','B','C','D','E','A','B','C','D','E'};
        char[][] R = {{'A','A','A','A','A','A','A','A','D','E'},{'A','B','C','D','E','A','B','C','D','E'},{'A','B','C','D','E','A','B','C','D','E'},{'A','B','C','D','A','A','A','A','A','A'},{'A','B','C','D','E','A','B','C','D','E'},{'A','B','C','D','E','A','B','C','D','E'},{'A','B','C','D','E','A','B','C','D','E'},{'A','B','C','D','E','A','B','C','D','E'},{'A','B','C','D','E','A','B','C','D','E'},{'A','B','C','D','E','A','B','C','D','E'}};
        int nota = 0;

        for (int i=0; i<10;i++) {
            for (int y = 0; y < 10; y++) {
                if (gabarito[y] == R[i][y]) {
                    nota++;
                }
            }
            if (nota >= 6) {
                System.out.println("O aluno " + i + " foi APROVADO");
            } else {
                System.out.println("O aluno " + i + " foi REPROVADO");
            }
            nota = 0;
        }
    }
}
