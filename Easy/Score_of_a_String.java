package Easy;

public class Score_of_a_String {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0 ; i < s.length()-1 ; i++){
            sum +=  Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return sum;
    }
}
