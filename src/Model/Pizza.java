package Model;
import java.util.List;

public class Pizza extends FoodItem {
  private Size size;
  private List<Topping> toppings;
  private Amount cheeseAmount;
  private Sauce sauce;
  
  public Pizza(double thePrice) {
    super(thePrice);
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
  public void setSauceAmount(Sauce theSauce) {
    sauce = theSauce;
  }
}
