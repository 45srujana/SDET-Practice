package Patterns;

import java.util.Scanner;

public class SquareHallowPattern {
    static int n;
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N: ");
     n= sc.nextInt();
    hallowSquare();
}

public static void hallowSquare(){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            //System.out.print(" * ");

            if(i==0 ||j==0||i==n-1||j==n-1){
                System.out.print(" * ");
            }else{
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}
}
