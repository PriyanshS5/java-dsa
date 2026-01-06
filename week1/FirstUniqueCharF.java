public class FirstUniqueCharF {
    public int freak(String s){
        int[] freq = new int[26];
        
        for(int i = 0 ; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharF sol = new FirstUniqueCharF();
        String s = "hhappy";
        System.out.println(sol.freak(s));
    }
}
