//to generate random numbers

import java.util.*;
public class Random_numbers
{
  public static void main(String[] args)
  {
    Random r = new Random();
    System.out.println("random integers:"+r.nextInt());
    System.out.println("random float values:"+r.nextFloat());
    System.out.println("random float values:"+r.nextDouble());
    System.out.println("random integer values:"+r.nextLong());
  }
}
