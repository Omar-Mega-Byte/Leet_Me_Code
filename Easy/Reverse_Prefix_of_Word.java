package Easy;

import java.util.Stack;

public class Reverse_Prefix_of_Word {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        String temp = "";
        String temp2 = "";
        for(int i = 0; i < word.length() ; i++){
            if (!word.contains(String.valueOf(ch))) {
                return word;
            }
            if (word.charAt(i) != ch) {
                stack.push(word.charAt(i));
            }
            else{
                stack.push(word.charAt(i));
                temp = word.substring(i+1, word.length());
                break;
            }
        }
        while(!stack.isEmpty()){
            temp2 += stack.pop();
        }
        return temp2 + temp;
    }
}