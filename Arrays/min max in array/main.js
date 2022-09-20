//question from geeksfromgeeks

// Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

//User function Template for Java
// for ex - Input:
// N = 6
// A[] = {3, 2, 1, 56, 10000, 167}
// Output:
// min = 1, max =  10000

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
    
       long min;
       long max;
       int i;
       if (n== 1){
           max = a[0];
           min = a[0];
       }
       
       max = a[0];
       min = a[0];
       
       
        for (  i = 1 ; i< a.length; i++){
            if(max< a[i]){
                max = a[i];
            }
            if(min > a[i]){
                min = a[i];
            }
        }
       pair minmax = new pair(min,max);
       return minmax;
    }
}