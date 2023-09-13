public class StringReverser {

    public static String reverse(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
