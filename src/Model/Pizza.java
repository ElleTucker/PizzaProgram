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
}
