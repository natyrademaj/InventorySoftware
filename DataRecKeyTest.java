public class DataRecKeyTest
{public static void main(String [] args)
{Database d1 =new Database(100);
FoodRecord food=new FoodRecord(new Key1("Ch",781938198),"Chocolate","01.01.2019");
FoodRecord foo=new FoodRecord(new Key1("Ch",86),"Chocolate","02.01.2020");

System.out.println(d1.insert(food));
Key1 lookup_key1=new Key1("Ch",781938198);
System.out.println(d1.delete(lookup_key1));
System.out.println(d1.find(lookup_key1));
}
}

