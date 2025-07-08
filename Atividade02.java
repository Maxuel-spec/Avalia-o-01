import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("\nTemperatura em Celsius: %.2f °C", celsius);
        System.out.printf("\nTemperatura em Fahrenheit: %.2f °F", fahrenheit);
        System.out.printf("\nTemperatura em Kelvin: %.2f K\n", kelvin);

        input.close();
    }
}
