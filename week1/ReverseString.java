import java.util.Arrays;

public class ReverseString {
    public void reverse(char[] s){
        int n = s.length;
        int l = 0;
        int r = n-1;

        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        
    }
    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        char s[] = {'h','e','l','l','o'};
        sol.reverse(s);
        System.out.println(Arrays.toString(s));
    }

}
