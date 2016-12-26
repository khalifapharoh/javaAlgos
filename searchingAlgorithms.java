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
    
}

