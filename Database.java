public class Database
{ private FoodRecord[] r;   
  private int NOT_FOUND = -1;  

  public Database(int size)
  { if ( size > 0 )
         { r = new FoodRecord[size]; }
    else { r = new FoodRecord[1]; }
  }

  private int findLocation(Key1 k)
  { int result = NOT_FOUND;
    boolean found = false;
    int i = 0;
    while ( !found  &&  i != r.length )
          { if ( r[i] != null  &&  r[i].getKey1().equals(k) )
                 { found = true;
                   result = i;
                 }
            else { i = i + 1; }
          }
    return result;
  }

  public FoodRecord find(Key1 k)
  { FoodRecord answer = null;
    int index = findLocation(k);
    if ( index != NOT_FOUND )
       { answer = r[index]; }
    return answer;
  }
 
  public boolean insert(FoodRecord f)
  { boolean success = false;
    if ( findLocation(f.getKey1()) == NOT_FOUND ) 
       { boolean found_empty_place = false;
         int i = 0;
         while ( !found_empty_place  &&  i != r.length )
               
               { if ( r[i] == null )   
                      { found_empty_place = true; }
                 else { i = i + 1; }
               }
         if ( found_empty_place )
              { r[i] = f; }
         else { 
                FoodRecord[] temp = new FoodRecord[r.length * 2];
                for ( int j = 0;  j != r.length;  j = j + 1 )
                    { temp[j] = r[j]; } 
                temp[r.length] = f;   
                r = temp;   
              }
         success = true;
       }
    return success;
  }
public boolean delete(Key1 k)
  { boolean result = false;
    int index = findLocation(k);
    if ( index != NOT_FOUND )
       { r[index] = null;
         result = true;
       }
    return result;
  }
}
