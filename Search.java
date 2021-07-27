/*

                              ********  ASSIGNMENT - 04   *******
                                
                                          RECURSION 



     Test  Case 1:              Test  Case 2:

     5                             5
    12                             12
    30                             34
    45                             67
    50                             100
    100                            150
    1                              34
   -1                              2
   -1                              1


*/



 import java.util.*;
 class Search {




  public static int linearSearch(int arr[],int low,int search)
   { 
      if( low >= arr.length )
        return -1;

      if( arr[low] == search )
         return low+1;

      return linearSearch(arr,low+1,search);
   }




  public static int binarySearch(int arr[], int search, int low, int high) {
  
  
    if( search>arr[arr.length-1])
      return -1;
      
      
    if (low > high) 
       { return -1; 
       }
   
    
    int mid = (low + high) / 2;

    if (arr[mid] == search) 
       return mid+1; 
    
    if(arr[mid] < search) 
      return binarySearch(arr, search, mid+1, high); 
        
    
    
    
    else if (arr[mid] > search) 
     return binarySearch(arr, search, low, mid-1); 
        
    
    return 0;
  }





  public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();

      int arr[] = new int[n];

      for(int i=0; i<n; i++)
         arr[i] = s.nextInt();


      int num = s.nextInt();
      System.out.println(linearSearch(arr,0,num));
      System.out.println(binarySearch(arr,num,0,arr.length-1));
      
   }
 } 
