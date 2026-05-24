public abstract class FoodItem {
  private double price;
  
  public FoodItem(double thePrice) {
    price = thePrice;
  }
  
  public double getPrice() {
    return price;
  }
}