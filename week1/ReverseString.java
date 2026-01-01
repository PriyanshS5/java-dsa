import java.util.Arrays;

public class ReverseString {
    public void reverse(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        
    }
    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        char s[] = {'h','e','l','l','o'};
        sol.reverse(s);
        System.out.println(Arrays.toString(s));
    }

}
