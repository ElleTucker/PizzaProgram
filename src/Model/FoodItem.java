package Model;
public abstract class FoodItem {
  private final double price;
  
  public FoodItem(double thePrice) {
    price = thePrice;
  }
  
  public double getPrice() {
    return price;
  }

  public abstract double getTotal();

}