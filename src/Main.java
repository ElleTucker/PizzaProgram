
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.FoodItem;
import Model.Pizza;

public class Main {
  	private static Scanner scanner = new Scanner(System.in);
    private static List<FoodItem> foodItems = new ArrayList<FoodItem>();
  
	public static void main(String[] args) {
		boolean keepOrdering = true;
      	System.out.println("Hello welcome to Tutor Hut Pizzas.");
      	while(keepOrdering) {
          	String input = printMainMenu();
          	chooseOption(input);
        }
	}
  
    private static String printMainMenu() {
      System.out.println("1) Order a Pizza");
      System.out.println("2) Order Chicken Wings");
      System.out.println("3) Order a Drink");
      System.out.println("4) Review Current Order");
      System.out.println("5) Checkout");
      System.out.println("Enter a value to continue: ");
      String input = scanner.nextLine();
      return input;
    }
  
  	private static void chooseOption(String userInput) {
      switch(userInput) {
        case "1" -> orderPizza();
        case "2" -> orderChickenWings();
        case "3" -> orderDrink();
        case "4" -> reviewCurrentOrder();
        case "5" -> checkout();
        default -> System.out.println("Invalid input");
      }
    }

  	private static String printPizzaMenu() {
      System.out.println("Select a type of pizza");
      System.out.println("1) Pepperoni");
      System.out.println("2) Cheese");
      System.out.println("3) Hawaiian");
      System.out.println("4) Veggie");
      System.out.println("5) Meat Lover");
      System.out.println("6) Custom");
      System.out.println("Enter a value to select: ");
      String input = scanner.nextLine();
      return input;
    }
  
  	private static void orderPizza() {
      String userInput = printPizzaMenu();
      switch(userInput) {
        case "1":
          foodItems.add(new Pizza(5));
          
      }
    }
    private static void orderChickenWings() {
      System.out.println("Select an amount of Chicken Wings: ");
      int amount = scanner.nextInt();
    }
    private static void orderDrink() {
    System.out.println("Select the size of the drink");
    System.out.println("1) Small");
    System.out.println("2) Medium");
    System.out.println("3) Large");
    System.out.println("4) XLarge");
    }
    private static void reviewCurrentOrder() {
      
    }
    private static void checkout() {
      
    }
}