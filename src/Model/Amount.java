package Model;
public enum Amount {
  Light(0.25),
  Normal(0.5),
  Extra(1.00);

  private final double price;
  private Amount(double thePrice) {
    price = thePrice;
  }
  public double getPrice() {
    return price;
  }
  public static void printAmount() {
    int count = 1;
    for (Amount amount : getAmountArray()) {
      System.out.println(count + ") " + amount + " (" + amount.getPrice() + ")");
      count++;
    }
  }

  public static Amount[] getAmountArray() {
    Amount[] amounts = {Light, Normal, Extra};
    return amounts;
  }

}
