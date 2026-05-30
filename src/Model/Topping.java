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
}
