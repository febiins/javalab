package record;
 class GenericMethod {
    
    // Generic method to find the maximum value
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {

public class P36 {
    
}
