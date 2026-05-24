public enum Topping {
  Sausage(0.50),
  Pineapple(0.25),
  Ham(1.00),
  Chicken(1.00),
  Bell_Peppers(0.05),
  Onions(0.15),
  Olives(0.25),
  Pepperoni(2.00);
      
  private final double price;
  private Topping(double thePrice) {
    price = thePrice;
  }
  
  public double getPrice() {
    return price;
  }
}
