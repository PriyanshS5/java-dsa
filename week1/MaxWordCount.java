public class MaxWordCount {

    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;

        for (String sentence : sentences) {
            int count = sentence.split(" ").length;
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        MaxWordCount solution = new MaxWordCount();
        String[] testSentences = {
            "alice and bob are going to the park",
            "please help me"
        };

        System.out.println(solution.mostWordsFound(testSentences));
    }
}