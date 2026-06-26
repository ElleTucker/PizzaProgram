package Model;
import java.util.ArrayList;
import java.util.List;

public class Pizza extends FoodItem {
  // properties
  private Size size;
  private final List<Topping> toppings;
  private Amount cheeseAmount;
  private Sauce sauce;

  // behaviors
  
  public Pizza(double thePrice) {
    super(thePrice);
    toppings = new ArrayList<>();
  }

  public Size getSize() {
    return size;
  }
  public void setSize(Size theSize) {
      size = theSize;
  }
  public void addTopping(Topping theTopping) {
    toppings.add(theTopping);
  }
  public boolean removeTopping(Topping theTopping) {
    boolean result = toppings.remove(theTopping);
    return result;
  }
  public List<Topping> getToppings() {
    return toppings;
  }
  public Amount getCheeseAmount() {
    return cheeseAmount;
  }
  public void setCheeseAmount(Amount theAmount) {
    cheeseAmount = theAmount;
  }
  public Sauce getSauce() {
    return sauce;
  }
  public void setSauce(Sauce theSauce) {
    sauce = theSauce;
  }
  @Override
  public double getTotal() {
    double total = getPrice() + sauce.getPrice() + cheeseAmount.getPrice() + size.getPrice();
    for(Topping topping : toppings) {
      total += topping.getPrice();
    }
    return total;
  }
  @Override
  public String toString() {
    String value = "Pizza\nToppings: ";
    for(int i = 0; i < toppings.size(); i++) {
      value += toppings.get(i) + " ";
    }
    value += "\nSize: " + size;
    value += "\nSauce: " + sauce;
    value += "\nCheese Amount: " + cheeseAmount;
    value += "\nTotal Price: " + getTotal();
    return  value;
  }
}
