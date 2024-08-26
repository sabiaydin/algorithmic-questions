package untitled.src;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    static int romanToInt(String number) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int intNumber = 0;
        for (int i = 0; i < number.length(); i++) {
       if(i<number.length()-1 && m.get(number.charAt(i))<m.get(number.charAt(i+1))){
intNumber -= m.get(number.charAt(i));
       }else {
           intNumber += m.get(number.charAt(i));
       }
        }
        return intNumber;
    }
}

