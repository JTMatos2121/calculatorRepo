import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args){

        System.out.println("Welcome to simple Calculator!");

        Scanner keyboard = new Scanner(System.in);

        //Gets the User first number
        System.out.print("Enter First Number: ");
        String firstNumber1 =keyboard.nextLine();
        double firstNumber = Double.parseDouble(firstNumber1);

        //Gets the User second number
        System.out.print("Enter second number:1");
        String secondNumber1 = keyboard.nextLine();
        double secondNumber = Double.parseDouble(secondNumber1);

        //Gets user Operator input
        System.out.print("Enter math operator (Enter 1(+),2(-),3(*),4(/):");
        String oprator1 = keyboard.nextLine();
        int opertor = Integer.parseInt(oprator1);

        //Math is processed inside the switch
        switch(opertor){
            case 1:
            System.out.print("The answer is : ");
            System.out.println(firstNumber+secondNumber);
            break;
            case 2:
            System.out.print("The answer is : ");
            System.out.println(firstNumber-secondNumber);
            break;
            case 3:
            System.out.print("The answer is : ");
            System.out.println(firstNumber*secondNumber);
            break;
            case 4:
            System.out.print("The answer is : ");
            System.out.println(firstNumber/secondNumber);
            break;
            
        //Provides input validation on operator if operator number is not 1,2,3 or 4
            default:
            System.out.println("Invalid Operator");
            break;

        }

    
    }
}