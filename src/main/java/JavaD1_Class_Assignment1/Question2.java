package JavaD1_Class_Assignment1;

import java.util.Scanner;

public class Question2 {
  static double radius;
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
     radius = sc.nextInt();   // reads an integer from keyboard

      System.out.println(areaOfCircle());
      System.out.println(evenNumber());
  }

  public static double areaOfCircle(){
      return 3.14*(radius*radius);
  }
//Question 3
  public static String evenNumber(){
      if(radius%2==0){
          return radius+" is an even number";
      }else{
          return radius+" is not an even number";
      }

    }
}
