/*
Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

Questions:
Return boolean or unique characters?
Character casing?
ASCII string or Unicode string?

Example:
isUnique("integrity") -> false
isUnique("Integrity") -> false
isUnique("dog") -> true
isUnique("Dog") -> true

Option 1:
1. Iterate through the string
2. For each character in the string, input into hashmap
3. If already present in hashmap then immediately return false
4. Else return true at end of iteration

Option 2 - w/o additional data structure:
1. Run sorting algorithm to sort characters
2. Iterate through string
3. If current character is same as neighbooring character then immediately return false
4. Else return true at end of iteration
*/

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Solution myObject = new Solution("dog");
    System.out.print(myObject.isUnique());
  }
}

// you can add other public classes to this editor in any order
public class Solution
{
  private String message;
  private boolean answer = false;
  
  public Solution(String input)
  {
    message = input;
  }
  
  public String toString()
  {
    return message;
  }
  
  public String sort() {
    char[] content = message.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }
  
  public boolean isUnique() {
    String sortedStr = this.sort();
    
    for(int i = 0; i < sortedStr.length(); i++) {
      if(i == sortedStr.length()-1) {
        return true;
      }
      else if(sortedStr.charAt(i) == sortedStr.charAt(i+1)) {
        return false;
      }
    }
    return true;
  }
}