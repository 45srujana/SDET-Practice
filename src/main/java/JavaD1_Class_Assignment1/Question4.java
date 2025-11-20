package JavaD1_Class_Assignment1;

import java.util.Scanner;

import static JavaD1_Class_Assignment1.Question2.radius;

public class Question4 {
    static int num1;
    static int num2;
    static int Celsius=25;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        num2 = sc2.nextInt(); // reads an integer from keyboard

        System.out.println(bigger_Num());
        System.out.println(celsiusToFahrenheit());
    }
public static String bigger_Num(){
    if(num1>num2){
        return num1+" is bigger number";
    }else{
        return num2+" is bigger number";
    }
        }
//Question 5
public static String celsiusToFahrenheit(){
    double Fahrenheit = (Celsius * 9/5) + 32;
    return "Fahrenheit - "+Fahrenheit+ "°F";
}


}
