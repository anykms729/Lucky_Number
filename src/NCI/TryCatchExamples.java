package NCI;
import java.util.*;

public class TryCatchExamples {
    public static void main() {
       Map<Integer,Integer> fruits = new HashMap<>();
       fruits.put(123, 456);
        fruits.put(456, 789);
        fruits.put(111, 222);
        fruits.put(333, 444);

        System.out.println(fruits.get(111));
    }}
