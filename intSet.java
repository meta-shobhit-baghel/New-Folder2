/*

                                  **********  ASSIGNMENT 06  **********
                 
                                               ADT  &  CDT

*/ 


 import java.util.*;
 class intSet 
  {


   /**
    * accepting   the  arr as  input
    * displayng  the  entire  array  elements
    */
  public static void displaySet(int arr[])
   { 
     for(int i=0; i<arr.length; i++)
       { 
         System.out.print(arr[i]+" ");
       }

     System.out.println();
   }


    


  /**
     * finding  the  complemet of  given  set  with  respect  to  the  universal  set 1-1000
     * returns  the  array set  that  is  not  presemt  in  the  given  array
  */
  public static int[] complement(int arr[])
  {
   int u_set[] = new int[1001];  // to  store 1-1000 , universal  set

   for(int i=0; i<u_set.length; i++)
      u_set[i] = i;

   for( int i=0; i<arr.length; i++ )
      u_set[ arr[i] ] = 0;

   int temp[] = new int[u_set.length-arr.length];
   int k =0;

   for( int i=0; i<u_set.length; i++)
      {
        if( u_set[i] != 0 )
          temp[k++] = u_set[i];
      }

   return temp;
 }



    /**
     1.  accepting  the  given  set ( as  set  contains  the  unique  value )
     2.  removing  the  duplicates  as  set  does  not  have  the  duplicate  values  using  count  array  universal  set
     3.   return  the  array  set
    */
   public static int[] removeDuplicates(int arr[]) 
   {
    int u_set[] = new int[1001]; // for  count 1-1000

    for( int i=0; i<arr.length; i++ )
        u_set[ arr[i] ]++;

    int count = 0;

    for( int i=0; i<u_set.length; i++ )
       {
         if( u_set[i] != 0 )
           count++;
       }

    int temp[] = new int[count];
    int k =0;

    for( int i=0; i<u_set.length; i++ )
       { 
         if( u_set[i] != 0 )
           temp[k++] = i;
       }

    return temp;
  }




   /**
    *   checking  whether  the  element  is  present  in  set  or  not
    *   return  the  boolean  value
    *   linear  search  approach
    */
   public static boolean isMember(int arr[])
   {
    Scanner s = new Scanner(System.in);
    System.out.print("enter  the  member  to  be  checked in set ");
    int num = s.nextInt();

    for(int i=0; i<arr.length; i++)
       { 
         if( arr[i] == num )
           return true;
       }

    return false;
   }


   
   /**
    * union of  the  two  sets 
    * accepting  sets and  returning  set 
    */
    public static int[] union(int arr1[],int arr2[])
    { 
     int k =0;
    int temp[] = new int[arr1.length+arr2.length];

    for(int i=0; i<arr1.length; i++)
       temp[k++] = arr1[i];

    for(int i=0; i<arr2.length; i++)
       temp[k++] = arr2[i];

    return removeDuplicates(temp); 
    }



   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();

     int arr[] = new int[n];              // first arr  is  the  input  array  received  may contain  duplicates

     for( int i=0; i<n; i++)
        arr[i] = s.nextInt();


     int m = s.nextInt();                // second arr  is  the  input  array  received  may contain  duplicates
     int arr2[] = new int[m];

     for(int i=0; i<m; i++)
       arr2[i] = s.nextInt(); 
  
                                         // arr_set  is  the  updated  set  of  input  array

     int arr_set[]  = new int[ removeDuplicates(arr).length ]; 
     int arr_set2[] = new int[ removeDuplicates(arr2).length ]; 


     

     displaySet(arr);                      // display before removing duplicates
     displaySet(arr2);
     arr_set  = removeDuplicates(arr);
     arr_set2 = removeDuplicates(arr2);
     displaySet(arr_set);                  // display  after  removing  duplicates
     displaySet(arr_set2);
     System.out.println(isMember(arr_set));
     System.out.println(arr_set.length);
     complement(arr_set);
     displaySet(arr_set);

 
     
     int temp[] = new int[arr_set.length+arr_set2.length];
     temp = union(arr_set,arr_set2);
     displaySet(temp);
     
     
   }

  }