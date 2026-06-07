package Model;


public enum Topping {
  Sausage(0.50),
  Pineapple(0.25),
  Ham(1.00),
  Chicken(1.00),
  Bell_Pepper(0.05),
  Onion(0.15),
  Olive(0.25),
  Pepperoni(1.00),
  Mushroom(0.50);
      
  private final double price;
  private Topping(double thePrice) {
    price = thePrice;
  }
  
  public double getPrice() {
    return price;
  }

  public static void printToppingsMenu() {
    int count = 1;
    for (Topping topping : getToppingsArray()) {
        System.out.println(count + ") " + topping + " (" + topping.getPrice() + ")");
        count++;
    }
  }
  public static Topping[] getToppingsArray() {
    Topping[] toppings = {Sausage, Pineapple, Ham, Chicken, Bell_Pepper, Onion, Olive, Pepperoni, Mushroom};
    return toppings;
  }
}
