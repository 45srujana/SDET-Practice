package Patterns;

import java.util.Scanner;

public class DimondPattern {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars u wanna print: ");
        n = sc.nextInt();
        diamondPattern();
    }

    public static void diamondPattern(){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            for(int j=1;j<i;j++){
                System.out.print(" * ");
            }

            System.out.println();

        }
    }
}
