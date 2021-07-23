/*
 
                                 ********  ASSIGNMENT 04  *******
                                 
                                            RECURSION


*/

 package Recursion;
 import java.util.*;
 class Maths
 {


  /**
   * @param int a , int b
   * @return hcf
   */
  public static int hcf(int a,int b)
   {
     if (b != 0)
        return hcf(b,a%b);
    
     else
        return a;
   }


   /**
   * @param int a , int b
   * @return lcm of a and b
   */
   public static int lcm(int a,int b)
   {
     return a*b/hcf(a,b);
   }


  //@main method
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = s.nextInt();
    System.out.println("enter the second number");
    int b = s.nextInt();

    
    System.out.println("Hcf is "+hcf(a,b));
    System.out.println("Lcm is "+lcm(a,b) );

  }

 }
