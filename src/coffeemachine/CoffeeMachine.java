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
                    System.out.println("Finished making your espresso!");
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
                    System.out.println("Finished making your latte!");
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
                    System.out.println("Finished making your cappuccino!");
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
        System.out.println("\nWrite how many ml of water do you want to add:");
        water = water + scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk = milk + scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans = coffeeBeans + scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCups = disposableCups + scanner.nextInt();
        menu();
    }

    public static void checkCapacityOfCoffeeMachine() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.print("\n");
        menu();
    }
    

    public static void takeMoneyFromCoffeeMachine() {
        System.out.println("I gave you $" + money);
        money = 0;
        menu();
    }
}