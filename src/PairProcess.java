import java.util.Scanner;

public class PairProcess {
    public static void main( String[] args){
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        num1 = keyboard.nextInt();

        System.out.print("Please enter second number: ");
        num2 = keyboard.nextInt();
        int sum = num1+num2;

//        System.out.println("Sum of two numbers: " + (num1 + num2));
        if ( sum > 200 && sum < 1000){
            System.out.println("Sum of two numbers:" + sum + "*~");
        }
        else if (sum > 200 && sum > 1000 ){
            System.out.println("Sum of two numbers:" + sum + "*");
        }
        else if (sum < 1000 && sum < 200)
            System.out.println("Sum of two number:" + sum + "~");

        System.out.println("Product of two numbers: " + (num1 * num2));
        System.out.println("Average of two numbers: "  + (num1 + num2) / 2);
    }
}
