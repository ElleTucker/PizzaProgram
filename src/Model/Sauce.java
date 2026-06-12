package Model;
public enum Sauce {
  Ranch(1.00),
  Marinara(0.25),
  Garlic(1.00),
  BBQ(0.50),
  Pesto(2.00),
  Alfredo(1.00);
  
  private final double price;
  private Sauce(double thePrice) {
    price = thePrice;
  }

  public double getPrice() {
    return price;
  }
   
  public static void printSauceMenu() {
    int count = 1;
    for (Sauce sauce : getSauceArray()) {
      System.out.println(count + ") " + sauce + " (" +sauce.getPrice() + ")");
      count++;
    }
  }
  public static Sauce[] getSauceArray() {
    Sauce[] sauces = {Ranch, Marinara, Garlic, BBQ, Pesto, Alfredo};
    return sauces;
  }
}