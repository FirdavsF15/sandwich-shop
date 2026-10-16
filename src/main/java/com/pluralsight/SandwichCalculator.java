package com.pluralsight;

import java.util.Scanner;

public class SandwichCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1: Regular: base price $5.45
                2: Large: base price $8.95
                
                What size sandwich do you want(1 or 2)
                """);

        String size = scanner.nextLine();

        double sandwichPrice = 0;
        if(size.equals("1")){
            sandwichPrice = 5.45;
        }
        if(size.equals("2")){
            sandwichPrice = 8.95;
        }

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());


        double totalCost;
        if(age<18) {
            totalCost = sandwichPrice - (sandwichPrice * .1);
        }
        else if(age>=65){
            totalCost = sandwichPrice - (sandwichPrice*.2);
        }else{
            totalCost = sandwichPrice;
        }
        System.out.printf("Your total is: $%.2f", totalCost);
    }
}
