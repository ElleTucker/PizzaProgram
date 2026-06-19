
import Model.Amount;
import Model.Pizza;
import Model.Sauce;
import Model.Size;
import Model.Topping;
import java.util.Scanner;

public class PizzaOrderer {
    
    private OrderState state = OrderState.MAIN_MENU;

    public Pizza order(Scanner scanner) {
        boolean keepOrdering = true;
        state = OrderState.MAIN_MENU;
        Pizza pizza = null;
        while(keepOrdering) {
            switch (state) {
                case OrderState.MAIN_MENU -> {
                    String input = choosePizzaMenu(scanner);
                    if(input.equals("7")) {
                        state = OrderState.NONE;
                        keepOrdering = false;
                    }
                    else if(input.equals("6")) {
                        pizza = new Pizza(8);
                        addToppings(pizza, scanner);
                        state = OrderState.SIZE; 
                    }
                    else {
                      pizza = createPizza(input);
                      state = OrderState.SIZE;  
                    }
                }

                case OrderState.SIZE -> {
                    selectSize(pizza, scanner);
                    state = OrderState.SAUCE;
                }
                case OrderState.SAUCE -> {
                    selectSauce(pizza, scanner);
                    state = OrderState.CHEESE;
                }
                case OrderState.CHEESE -> {
                    selectCheeseAmount(pizza, scanner);
                    state = OrderState.NONE;
                }
                case OrderState.NONE -> {
                    System.out.println(pizza);
                    System.out.println("Is this correct?");
                    String input = scanner.next();
                    if(input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")) {
                        return pizza;
                    }
                    else {
                        state = OrderState.MAIN_MENU;
                        pizza = null;
                    }
                }
                default -> {
                    state = OrderState.MAIN_MENU;
                    System.out.println("Error occured.");
                }
            }
        }
        return pizza;
    }
	public String choosePizzaMenu(Scanner scanner) {
      System.out.println("Select a type of pizza");
      System.out.println("1) Pepperoni");
      System.out.println("2) Cheese");
      System.out.println("3) Hawaiian");
      System.out.println("4) Veggie");
      System.out.println("5) Meat Lover");
      System.out.println("6) Custom");
      System.out.println("7) Cancel");
      System.out.println("Enter a value to select: ");
      String input = scanner.next();
      return input;
    }

    private Pizza createPizza(String userInput) {
        Pizza userPizza;
        switch(userInput) {
            case "1" -> {
                userPizza = new Pizza(10); //pepperoni pizza
                addMultipleToppings(userPizza, 6, Topping.Pepperoni);
                return userPizza;
                    }
            case "2" -> {
                userPizza = new Pizza(10);
                return userPizza;
                    }
            case "3" -> {
                userPizza = new Pizza(8);
                addMultipleToppings(userPizza, 6, Topping.Pineapple);
                addMultipleToppings(userPizza, 4, Topping.Ham);
                return userPizza;
                    }
            case "4" -> {
                userPizza = new Pizza(8);
                addMultipleToppings(userPizza, 3, Topping.Bell_Pepper);
                addMultipleToppings(userPizza, 6, Topping.Olive);
                addMultipleToppings(userPizza, 4, Topping.Onion);
                addMultipleToppings(userPizza, 6, Topping.Mushroom);
                return userPizza;
                    }
            case "5" -> {
                userPizza = new Pizza(8);
                addMultipleToppings(userPizza, 4, Topping.Pepperoni);
                addMultipleToppings(userPizza, 4, Topping.Sausage);
                addMultipleToppings(userPizza, 4, Topping.Ham);
                addMultipleToppings(userPizza, 4, Topping.Chicken);
                return userPizza;
                    }
            default -> {
                userPizza = new Pizza(-1);
                return userPizza;
                    }
        }
        }

    private void addMultipleToppings(Pizza thePizza, int num, Topping theTopping) {
      for (int count = 0; count < num; count++) {
        thePizza.addTopping(theTopping);
      }
    }

    private void addToppings(Pizza thePizza, Scanner scanner) {
      boolean keepAddingToppings = true;
      while(keepAddingToppings) {
        System.out.println("Select a topping.");
        Topping.printToppingsMenu();
        System.out.println("Enter a value:");
        int input = scanner.nextInt();
        input--;
        if(input>=0 && input<=9) {
          System.out.println("How many of the toppings do you want?");
          int amount = scanner.nextInt();
          addMultipleToppings(thePizza, amount, Topping.getToppingsArray() [input]);
          System.out.println(amount + " amount of toppings were added!");
          System.out.println("Do you want to add more toppings?");
          String reply = scanner.next();

          if(reply.toLowerCase().trim().equals("no")) {
            keepAddingToppings = false;
          }
        }
        else {
          System.out.println("Invalid Choice");
        }
      }
     
    }

    private void selectSize(Pizza pizza, Scanner scanner) {
        boolean keepSelectingSize = true;
        while (keepSelectingSize) { 
            System.out.println("Select a size.");
            Size.printSizeMenu();
            System.out.println("Enter a value.");
            int input = scanner.nextInt();
            input--;
            if(input>=0 && input<=3) {
                keepSelectingSize = false;
                pizza.setSize(Size.getSizeArray()[input]);
            }
            else {
                System.out.println("Invalid Choice.");
            }
        }
    }

    private void selectSauce(Pizza pizza, Scanner scanner) {
        boolean keepSelectingSauce = true;
        while (keepSelectingSauce) {
            System.out.println("Select the type of sauce.");
            Sauce.printSauceMenu();
            System.out.println("Enter a value.");
            int input = scanner.nextInt();
            input--;
            if (input>=0 && input<=5) {
                keepSelectingSauce = false;
                pizza.setSauce(Sauce.getSauceArray()[input]);
            }
            else {
                System.out.println("Invalid Choice.");
            }
        }
    }

    private void selectCheeseAmount(Pizza pizza, Scanner scanner) {
        boolean keepSelectingCheese = true;
        while (keepSelectingCheese) {
            System.out.println("Select the amount of cheese.");
            Amount.printAmount();
            System.out.println("Enter a value.");
            int input = scanner.nextInt();
            input--;
            if (input>=0 && input<=2) {
                keepSelectingCheese = false;
                pizza.setCheeseAmount(Amount.getAmountArray()[input]);
            }
            else {
                System.out.println("Invalid Choice.");
            }
        }
    }

    private enum OrderState {
        NONE, 
        MAIN_MENU,
        SPECIALITY,
        TOPPINGS,
        SIZE,
        SAUCE,
        CHEESE;
    
    }

}
