package Arrayhw1;

public class BinarySearch{
    public int search(int[] listOfNumbers, int target){
        int high =listOfNumbers.length-1;
        int low=0;
        while(low <= high){
            int mid = (low + high)/2;
            if(listOfNumbers[mid]==target){
                return mid;
            }else if(target < listOfNumbers[mid]){
                high=mid -1;
            }
            else{
                low = mid +1;
            }

        }
        return -1;
    }
    
  }
