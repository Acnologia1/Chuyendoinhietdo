package Lession2;
import java.util.Scanner;


public class Chuyendoinhietdo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Fehrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celcius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: "+ celsiusToFahre(celsius));
                    break;
                case 3:
                    System.exit(0);
            }
        }while(choice != 0);
    }
    public static double celsiusToFahre(double celsius)
    {
        double fahrenheit =(9.0 /5) * celsius +32;
        return  fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius  = (5.0/9)*(fahrenheit -32);
        return celsius;
    }
}
