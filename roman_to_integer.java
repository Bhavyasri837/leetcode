import java.util.*;
class roman_to_integer {
    public static int romanToInt(String s) {
        // Define a map of Roman numeral characters and their values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;

        // Traverse through the string
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current character
            int current = romanValues.get(s.charAt(i));

            // Check if the current value is less than the next value
            if (i + 1 < s.length() && current < romanValues.get(s.charAt(i + 1))) {
                total -= current; // Subtract the current value (because it's part of a subtractive combination)
            } else {
                total += current; // Otherwise, just add the value
            }
        }

        return total;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}
  
