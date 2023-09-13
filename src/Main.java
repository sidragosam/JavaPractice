import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String stringToReverse = "Ich bin eine Katze.";
        String reversed = StringReverser.reverse(stringToReverse);
        System.out.println("Word: " + stringToReverse + "\nReversed: " + reversed);

        System.out.println("_-------------------------------_");

        int[] arr = {12, 45, 78, 23, 56};
        int largest = LargestElement.findLargest(arr);
        System.out.println("Array: " + Arrays.toString(arr) + "\nLargest: " + largest);

        System.out.println("_-------------------------------_");

        String palindromeTest = "A man, a plan, a canal, Panama";
        boolean isPalin = PalindromeChecker.isPalindrome(palindromeTest);
        System.out.println("Is it a palindrome? " + isPalin);
        String palindromeTest2 = "A Hallo A Ballo";
        boolean isPalin2 = PalindromeChecker.isPalindrome(palindromeTest2);
        System.out.println("Is it a palindrome? " + isPalin2);

        System.out.println("_-------------------------------_");

        int n = 5;
        long fact = FactorialCalculator.factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);

        System.out.println("_-------------------------------_");

        int nth = 13;
        int nthFib = Fibonacci.nthFibonacci(nth);
        System.out.println("The " + nth + "th Fibonacci number is " + nthFib);

        System.out.println("_-------------------------------_");

        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = AnagramChecker.areAnagrams(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + areAnagrams);

        System.out.println("_-------------------------------_");

        int[] arrs = {1, 2, 3, 2, 4, 5, 5, 6, 2, 5, 6, 6, 6};
        DuplicateChecker.findAndPrintDuplicates(arrs);
    }
}