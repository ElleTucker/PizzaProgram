import Model.Amount;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.FoodItem;
import Model.Pizza;
import Model.Topping;

public class Main {
  	private static Scanner scanner = new Scanner(System.in);
    private static List<FoodItem> foodItems = new ArrayList<FoodItem>();
    private static PizzaOrderer pizzaOrderer = new PizzaOrderer();
  
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
      String input = scanner.next();
      return input;
    }
  
  	private static void chooseOption(String userInput) {
      switch(userInput) {
        case "1" -> pizzaOrderer.order(scanner);
        case "2" -> orderChickenWings();
        case "3" -> orderDrink();
        case "4" -> reviewCurrentOrder();
        case "5" -> checkout();
        default -> System.out.println("Invalid input");
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