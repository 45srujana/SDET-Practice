package Patterns;

import java.util.Scanner;

public class ReverseRightHalfPyramid {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars u wnna print: ");
        n = sc.nextInt();
        decreasingTriangle();

    }

    public static void decreasingTriangle(){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
