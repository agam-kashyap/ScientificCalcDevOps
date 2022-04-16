import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your function:\n"
                + "\t1. Sum\n"
                + "\t2. Subtract\n"
                + "\t3. Multiply\n"
                + "\t4. Divide\n"
                + "\t5. Natural log\n"
                + "\t6. Square\n"
                + "\t7. Square root\n"
                + "\t8. Exponent\n" +
                "\t9. Factorial");
        Integer funcID = input.nextInt();
        Integer number1=0;
        Integer number2=0;
        System.out.println("Enter Input: ");
        number1 = input.nextInt();
        if(funcID == 1 || funcID == 2 || funcID == 3 ||
                funcID == 4 || funcID == 8)
        {
            number2 = input.nextInt();
        }

        switch(funcID) {
            case 1: System.out.println(Calculator.sum(number1, number2));break;
            case 2: System.out.println(Calculator.subtract(number1, number2));break;
            case 3: System.out.println(Calculator.multiply(number1, number2));break;
            case 4: System.out.println(Calculator.divide(number1, number2));break;
            case 5: System.out.println(Calculator.naturalLogarithm(number1));break;
            case 6: System.out.println(Calculator.square(number1));break;
            case 7: System.out.println(Calculator.squareRoot(number1));break;
            case 8: System.out.println(Calculator.Exponent(number1, number2));break;
            case 9: System.out.println(Calculator.factorial(number1));break;
            default: System.out.println("Invalid input");break;
        }

        input.close();
    }

}
