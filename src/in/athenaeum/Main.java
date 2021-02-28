package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> scores = List.of(123, 345, 456, 567, 566, 9999);

        //  early unboxing is a significant gain
        Integer totalWrapper = totalAsWrapper(scores);
        int totalPrimitive = totalAsPrimitive(scores);
    }

    public static Integer totalAsWrapper(List<Integer> integerList) {
        long start = System.nanoTime();

        Integer total = 0;
        for (Integer i: integerList) {
            total += i;
        }

        long end = System.nanoTime();

        System.out.println("totalAsWrapper took: " + (end-start) + " nanoseconds");

        return total;
    }

    public static int totalAsPrimitive(List<Integer> integerList) {
        long start = System.nanoTime();

        int total = 0;
        for (int i: integerList) {
            total += i;
        }

        long end = System.nanoTime();

        System.out.println("totalAsPrimitive took: " + (end-start) + " nanoseconds");

        return total;
    }
}
