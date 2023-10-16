public class RomanNumberToInt {
  public int romanToInt(String s) {
      if (s == null || s.length() == 0) {
          return 0;
      }
      int result = 0;
      int prevValue = 0;
      for (int i = s.length() - 1; i >= 0; i--) {
          char c = s.charAt(i);
          int value = romanCharToInt(c);
          if (value < prevValue) {
              result -= value;
          } else {
              result += value;
          }
          prevValue = value;
      }
      return result;
  }
  
  private int romanCharToInt(char c) {
      switch (c) {
          case 'I': return 1;
          case 'V': return 5;
          case 'X': return 10;
          case 'L': return 50;
          case 'C': return 100;
          case 'D': return 500;
          case 'M': return 1000;
          default: return 0;
      }
  }
}
