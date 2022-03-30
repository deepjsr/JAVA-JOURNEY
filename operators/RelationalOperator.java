import java.util.function.DoubleToIntFunction;

public class RelationalOperator {
    public static void main(String[] args) 
    {
     int i=3;
     int j=7;
     System.out.println(i>j ^ i<j);   
    //  bitwise operators
     System.out.println(i>j & i<j);   //or
     System.out.println(i<j & j>i);   //or
     System.out.println(i<j & i>j);   //or
     System.out.println(j<i & i>j);   //or
     System.out.println(i>j | i<j);   //and
     System.out.println(i<j);   
    //  conditonal operator
        int y=10;
        int z=96;
        int e=69;
    // int l1 = (y>z)?y:z)>e?((y>z)?y:z):e; 
     
     System.out.println(" Largest no is "+l1);
  }
}
