package org.example;

import java.util.Scanner;

public class Calculator {
    static int num;
    static int secondNum;
    static int thirdNum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1 to 3: ");
        num = sc.nextInt();
        if(num<=3) {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter second number: ");
            secondNum = sc2.nextInt();
            Scanner sc3 = new Scanner(System.in);
            System.out.print("Enter third number: ");
            thirdNum = sc3.nextInt();
            calculator();
        }else{
            System.out.print("Please enter valid number.... ");
        }

    }

    public static void calculator() {

            switch (num) {

                case 1:
                    System.out.println(secondNum + thirdNum);
                    break;
                case 2:
                    if (secondNum > thirdNum) {
                        System.out.println(secondNum - thirdNum);
                    } else {
                        System.out.println(thirdNum - secondNum);
                    }
                    break;
                case 3:
                    System.out.println(secondNum * thirdNum);
                    break;
                default:
                    System.out.println("oops no such operation is there...");
                    break;
            }
        }
    }

