package untitled.src;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    Map<String,Integer> map = new HashMap<>();

  static int[] sumOfIndices(int[] numbers,int target){
        for(int i=0;i< numbers.length;i++){
            for (int j=0;j< numbers.length;j++){
             if(numbers[i]+numbers[j]==target && i!=j){
                 return new int[] {i,j};
             }
            }
        }
        return new int[] {};
    }
}
