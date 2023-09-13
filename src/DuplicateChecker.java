import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {
    public static void findAndPrintDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements in the array: " + duplicates);
    }
}
