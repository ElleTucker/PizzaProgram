package Model;
public enum Size {
  Small(0),
  Medium(1.00),
  Large(2.00),
  XLarge(5.00);

  private final double price;
  private Size(double thePrice) {
    price = thePrice;
  }

  public double getPrice() {
    return price;
  }

  public static void printSizeMenu() {
    int count = 1;
    for (Size size : getSizeArray()) {
      System.err.println(count + ") " + size + " (" + size.getPrice() + ")");
      count++;
    }
  }

  public static Size[] getSizeArray() {
    Size[] sizes = {Small, Medium, Large, XLarge};
    return sizes;
  }
}