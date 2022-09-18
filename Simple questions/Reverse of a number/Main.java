// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     while (n > 0) {
         System.out.println(n% 10);
         n = n / 10;
     }
    }
   }