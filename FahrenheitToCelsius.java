import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit;

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");

        input.close();
    }
}