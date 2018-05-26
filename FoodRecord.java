public class FoodRecord
{ 
  private Key1 product_code;
  private String product_name;
  private String expiration_date;

  public FoodRecord(Key1 num, String t, String date)
  { product_code = num;
    product_name = t;
    expiration_date = date;
  }

  public Key1 getKey1() { return product_code; }

  public String getName() { return product_name; }

  public String getDate() { return expiration_date; }
}
