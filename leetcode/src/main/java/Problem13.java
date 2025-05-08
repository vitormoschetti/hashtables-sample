import java.util.HashMap;

public class Problem13 {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));

    }

    private static int romanToInt(String s) {

        final var symbols = new HashMap<Character, Integer>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int result = 0;
        int currentValue = 0;

        for (int i = 0; i < s.length(); i++) {

            final var ch = s.charAt(i);

            final var symbolValue = symbols.get(ch);

            if (currentValue == 0) {
                currentValue = symbolValue;
                result = currentValue;
            } else if (symbolValue > currentValue) {
                result += (symbolValue - 2 * currentValue);
            } else {
                result += symbolValue;
            }
            currentValue = symbolValue;

        }

        return result;

    }

}
