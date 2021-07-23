
/*


                                     ********* ASSIGNMENT  08  ********


*/


 import java.util.*;
 class ArrOperation
  {



  public static void displayArray(int arr[])
   { 
     for( int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
   }

  public static int[] swap(int arr[] ,int a , int b)
   {
      arr[a] =arr[a] + arr[b]; 
      arr[b] =arr[a] - arr[b]; 
      arr[a] =arr[a] - arr[b]; 

     return arr;
   }


  public static int[] fixXY(int arr[])
   {  
      Scanner s = new Scanner(System.in);

      int x = s.nextInt();
      int y = s.nextInt();

      int low = -1 , high = -1;

      for(int i=0; i<arr.length; i++)
         {
           if(arr[i] == x)
             {
               low = i;
             }


           if(arr[i] == y)
             {
               high = i;
             } 

           if( low != -1 && high !=-1 && (low+1) <= arr.length-1 )
             {
               arr = swap(arr,low+1,high);
               low = -1;
               high = -1;
               i++;    
             }
         }

     return arr;
 
   }

  public static int arraySum(int arr[],int i,int j)
   {
     int sum = 0;

     for(int k=i; k<=j; k++ )
        {
           sum += arr[k];
        } 
     return sum;
   }

  public static int splitArray(int arr[] )
   {
     for( int i=0; i<arr.length; i++ )
        {
          int sum1 = arraySum(arr,0,i);
          int sum2 = arraySum(arr,i+1,arr.length-1);

          if(sum1 == sum2)
            return i+1;
        }

     return -1;
   }

  public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();

      int arr[] = new int[n];


      for( int i=0; i<n; i++ )
         arr[i] = s.nextInt();


      System.out.println( splitArray(arr) );
      displayArray(arr);
      arr =  fixXY(arr) ;
      displayArray(arr);
      
   }

  }