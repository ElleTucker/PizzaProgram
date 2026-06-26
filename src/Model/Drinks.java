package Model;
public class Drinks extends FoodItem {
  public Drinks(double thePrice) {
    super(thePrice);
  }

    @Override
    public double getTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
