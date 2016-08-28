import java.util.*;

class PrimeNumberClass
 {
   String result;;

   public static void main(String args[])
   { 
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number : ");
      int a = s.nextInt();
      PrimeNumberClass p = new PrimeNumberClass();
      p.isPrime(a);
      System.out.println(p);
      
   }

       String isPrime(int a)
       {   
         boolean flag = true;
         
         for(int i=2; i<=a-1;i++)
         {   
           if(a%i==0)
           {
             flag = false;
             break;
           }
         }
         if(flag)
           result = "Number is Prime";
         else
           result = "Number is not Prime";
       
         return result;
       }

       public String toString()
       {
         return result;
       }
 }