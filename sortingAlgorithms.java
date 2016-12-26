/*
    A combination of the most Sorting used Algorithms.
 */

/**
 * @author KhalifaPharoh
 **/
public class Algorithms {
    public static void selectionSort(int []arr)
    {
        int a, b,first;
        for(a = (arr.length - 1) ; a > 0 ; a--)
        {
            first = 0;
            for(b = 1 ; b <= a ; b++)
            {
                if(arr[b] > arr[first])
                    first = b;
            }
         int temp;
        temp = arr[a];
        arr[a] = arr[first];
        arr[first] = temp;
        }
    }
     public static void InsertionSort(int[] num)
    {
        int j, key, i;
        for(j = 1; j < num.length; j++)     // start with 1 (not 0)
        {
            key = num[j];
            for(i=j - 1; (i >= 0)&&(num[i] > key);i--)  // Smaller values are moving up
            {
                num[i+1] = num[i];
            }
        num[i+1] = key; // Put the key in its proper location
        }
}
}
