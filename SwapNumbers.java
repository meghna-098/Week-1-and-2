import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter number1: ");
        number1 = input.nextInt();

        System.out.print("Enter number2: ");
        number2 = input.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        input.close();
    }
}