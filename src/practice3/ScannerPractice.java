package practice3;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        //nameScanner();
        calculator();
    }

    public static void nameScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name : " );
        String name = scanner.next();
        System.out.println("Welcome to the world of Java Mr."+ name);
        scanner.close();
    }
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : " );
       int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2= scanner.nextInt();
        int finalResult = number1+number2;
        System.out.println("Addition of the given number is : "+ finalResult);
        scanner.close();

    }


}
