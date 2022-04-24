package aula03;

public class Exc3 {
    public static void main(String[] args){
        int count = 1;
        while (count <= 100){
            System.out.println(count);
            if (count%10 == 0){
                System.out.println("Múltiplo de 10");
            }
            count++;
        }
    }
}
