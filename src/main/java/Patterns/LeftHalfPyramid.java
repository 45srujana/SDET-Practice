package Patterns;

import java.util.Scanner;

public class LeftHalfPyramid {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars u wnna print: ");
        n = sc.nextInt();
       leftHalfPyramid();
    }

    public static void leftHalfPyramid(){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
