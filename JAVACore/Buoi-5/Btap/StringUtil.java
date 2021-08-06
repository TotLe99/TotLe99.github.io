import java.util.Map;

public class StringUtil {
  /*
  Hãy viết hàm isContain để kiểm tra strA có chứa strB không mà không hàm có sẵn 
  trong String
  */
  public boolean isContain(String strA, String strB) {
      strA = strA.toLowerCase();
      if (strA.contains(strB)){
        return true;
      }
      return false;
  }

  /*
  Nghịch đảo một chuỗi: Hello -> olleH 
  */
  public String reverse(String str) {
      str = "Hello";
      for (int i = str.length() - 1; i >= 0; i--) {
          System.out.print(str.charAt(i));
        }
    return str;
  }

  /* trả về vị trí mà strB được tìm thấy trong strA
  -1: không tìm thấy
  >= 0: là  vị trí tìm thấy
  */
  public int find(String strA, String strB) {
    for (int i = 0; i < strA.length(); i++) {
      if (strA[i] == strB) return i;
    }
    return -1;
  }

  /* Upper case ký tự đầu tiên của từ
  */
  public String camelCase(String input) {
      char[] charArray = input.toCharArray();
      boolean foundSpeace = true;
      for(int i=0; i<charArray.length; i++) {
        if(Character.isLetter(charArray[i])) {
            if(foundSpeace) {
                charArray[i] = Character.toUpperCase(charArray[i]);
                foundSpeace = false;
            }
        }
        else {
            foundSpeace = true;
        }
      }
      return input;
  }

  /* 
  "Không có gì quý hơn độc lập tự do"
  Từ dài nhất là "Không"
  */
  public String longestWord(String input) {
    int index = 0;
    int lenMax = 0;
    for (int i = 0; i < input.length(); i++) {
        int len = input[i].length();
        if(len > lenMax) {
            lenMax = len;
            index = i;
         }   
    }
    return input;
  }

  /*
  Đếm số lần tự lặp lại
  */

  /*
  "Một con mèo, hai con chó, chó đuổi mèo"
  Một: 1
  con: 2
  mèo: 2
  hai: 1
  chó: 2
  đuổi: 1
  */
  public Map<String, Integer> countWords(String input){
    Map<String, Integer> wordMap = new TreeMap<String, Integer>();
    input = "Một con mèo, hai con chó, chó đuổi mèo";
    if (input == null) {
      return wordMap;
    }
    int size = input.length();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < size; i++) {
      if (input.charAt(i) != SPACE && input.charAt(i) != "," ) {
        sb.append(input.charAt(i));
      } else {
        addWord(wordMap.sb);
        sb = new StringBuilder();
      }
    }
    addWord(wordMap, sb);
    return wordMap;
  }
}