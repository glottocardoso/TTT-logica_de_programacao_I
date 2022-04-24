package aula01;

public class Exc1 {
    public static void main(String args[]) {
        double celsius = 25;
        double kelvin = celsius+273.15;
        double fahrenheit = celsius*1.8+32;
        double rankine = celsius*1.8+32+459.67;
        double reaumur = celsius*0.8;

        System.out.println("kelvin = " + kelvin);
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("rankine = " + rankine);
        System.out.println("reaumur = " + reaumur);
    }
}
