public class AnagramSB {
    public boolean ana(String s, String t){
        if(s.length() != t.length()) return false;
        StringBuilder sb = new StringBuilder(t);
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = sb.indexOf(String.valueOf(c));
            if(index == -1){            
                return false;
            }
            sb.deleteCharAt(index);
        }
        return sb.length() == 0;
    }

    public static void main(String[] args) {
        AnagramSB sol = new AnagramSB();
        String ji = "car";
        String pi = "arc";

        System.out.println(sol.ana(ji, pi));
    }
}
