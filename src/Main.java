import java.util.*;

public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(26, 34, 1, 1, 2, 2, 3, 4, 4, 6, 9, 32, 33, 358));
    public static final List<String> string = new ArrayList<>(List.of("sdf", "ase", "aep", "ase", "aep", "dfe", "aep"));

    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task1();
        //task2();
        task3();
        task4(string);
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);
        int previousNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num != previousNum && num % 2 == 0) {
                System.out.println(num);
                previousNum = num;

            }
        }
    }

    public static void task3() {
        Set<String> unique = new HashSet<>(string);
        System.out.println(unique.toString());
    }

    public static void task4(List<String> word) {
        Map<String, Integer> ww = new TreeMap<>();
        for (String s : word) {
            if (!ww.containsKey(s)) {
                ww.put(s, 1);
            } else {
                ww.replace(s, ww.get(s) + 1);
            }
        }
        System.out.println(ww);
    }
}



