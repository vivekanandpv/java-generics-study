package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/List.html
        List<Vehicle> vehiclesAsArrayList = new ArrayList<>();
        List<Vehicle> vehiclesAsLinkedList = new LinkedList<>();
        List<Vehicle> vehiclesAsVector = new Vector<>();    //  thread-safe, performance penalty

        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Set.html
        Set<Vehicle> vehiclesAsHashSet = new HashSet<>();
        Set<Vehicle> vehiclesAsLinkedHashSet = new LinkedHashSet<>();

        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Map.html
        Map<String, Vehicle> stringVehicleAsHashMap = new HashMap<>();
        Map<String, Vehicle> stringVehicleAsLinkedHashMap = new LinkedHashMap<>();
        Map<String, Vehicle> stringVehicleAsTreeMap = new TreeMap<>();

        //  Self study:
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Collection.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Queue.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Deque.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/SortedSet.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Stack.html

        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/NavigableMap.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/SortedMap.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/concurrent/ConcurrentMap.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/concurrent/ConcurrentNavigableMap.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/IdentityHashMap.html
        //  https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/WeakHashMap.html
    }
}
