/*  
  A combination of the most used Searching Algorithms.
 */ 

/**
 *
 * @author Khalifapharoh
 */
public class searchingAlgorithms {
    public static boolean linearSearch(int[] numbers, int value)
    {
        for(int i = 0 ; i < numbers.length ; i++ )
        {
            if(numbers[i] == value)
                return true;
            else continue;
        }
        return false;
    }
      public static boolean binarySearch(int[] numbers, int value)
    {
        //The Array must be sorted to use the binary search Algorithm so I'am using my insertion sort algorithm to sort the array.
        //You can find the insertion sort algorithm source code in the sortingAlgortihms.java file in the same repository.
        InsertionSort(numbers);
        int low = 0 ,high =numbers.length;
        for (int i = 0; i < high; i++) {
            if(numbers[(low+high) / 2] == value)
                return true;
            else if(numbers[(low+high) / 2] > value)
            {
                high = (high+ low)/2;
                continue;
            }
              else if(numbers[(low+high) / 2] < value)
            {
                low  = (high+ low)/2;
                continue;
            }
        }
        return false;
    }
    
}

