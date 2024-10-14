package entities;

public class StringUtil {
    public static String reverse(String original) {
        return new StringBuilder(original).reverse().toString();
    }
}
