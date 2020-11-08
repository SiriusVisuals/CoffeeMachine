package coffeemachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);
    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;

    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = scanner.next();
        switch (input) {
            case "buy":
                makeTheOrder();
                break;
            case "fill":
                fillCoffeeMachine();
                break;
            case "take":
                takeMoneyFromCoffeeMachine();
                break;
            case "remaining":
                checkCapacityOfCoffeeMachine();
                break;
            case "exit":
                System.exit(0);
        }
    }

    public static void makeTheOrder() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
        String userChoice = scanner.next();
        switch (userChoice) {

            case "1": {
                if (((water == 250 || water > 250)) &&
                        ((coffeeBeans == 16 || coffeeBeans > 16)) &&
                        ((disposableCups == 1 || disposableCups > 1))){
                    water = water - 250;
                    coffeeBeans = coffeeBeans - 16;
                    disposableCups = disposableCups - 1;
                    money = money + 4;
                    System.out.println("Finished making your espresso!\n");
                } else
                    System.out.println("Not enough resources! \n");
                menu();
                break;
            }
            case "2": {
                if (((water == 350 || water > 350)) &&
                        ((milk == 75 || milk > 75)) &&
                        ((coffeeBeans == 20 || coffeeBeans > 20)) &&
                        ((disposableCups == 1 || disposableCups > 1))){
                    water = water - 350;
                    milk = milk - 75;
                    coffeeBeans = coffeeBeans - 20;
                    disposableCups = disposableCups - 1;
                    money += 7;
                    System.out.println("Finished making your latte!\n");
                } else
                    System.out.println("Not enough resources! \n");
                menu();
                break;
            }
            case "3": {
                if (((water == 200 || water > 200)) &&
                        ((milk == 100 || milk > 100)) &&
                        ((coffeeBeans == 12 || coffeeBeans > 12)) &&
                        ((disposableCups == 1 || disposableCups > 1))){
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    disposableCups -= 1;
                    money += 6;
                    System.out.println("Finished making your cappuccino!\n");
                } else
                    System.out.println("Not enough resources! \n");
                menu();
                break;

            }
            case "back": {
                menu();
            }
            case "4": {
                menu();
            }
        }
    }

    public static void fillCoffeeMachine() {
        System.out.println("\nEnter the amount of water you are adding (in ml):");
        water = water + scanner.nextInt();
        System.out.println("Enter the amount of milk you are adding (in ml):");
        milk = milk + scanner.nextInt();
        System.out.println("Enter the amount of coffeebeans you are adding (in grams):");
        coffeeBeans = coffeeBeans + scanner.nextInt();
        System.out.println("Enter the number of disposable cups that you are adding:");
        disposableCups = disposableCups + scanner.nextInt();
        System.out.println(" ");
        menu();
    }

    public static void checkCapacityOfCoffeeMachine() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + "ml of water");
        System.out.println(milk + "ml of milk");
        System.out.println(coffeeBeans + "g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("Balance: " + "$" + money);
        System.out.print("\n");
        menu();
    }
    

    public static void takeMoneyFromCoffeeMachine() {
        System.out.println("Withdrew $" + money);
        money = 0;
        menu();
    }
}