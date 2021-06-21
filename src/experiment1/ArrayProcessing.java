package experiment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// WAP tp print all the duplicate elements present in the array.

public class ArrayProcessing {
    public static void main(String[] args) {
        int[] arr = {1,8,1,9,2,3,8,6,9,1};
        System.out.println(Arrays.toString(arr));
        ArrayProcessing obj = new ArrayProcessing();
        obj.printDuplicate(arr);
    }
    public void printDuplicate(int[] arr){
            Set<Integer> set = new HashSet<>();
            Set<Integer> printed = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isAdded = set.add(arr[i]);
            if(!isAdded){
                boolean isPrinted = printed.add(arr[i]);
                if(isPrinted){
                    System.out.println(arr[i]+",");
                }
            }
        }
    }
}
