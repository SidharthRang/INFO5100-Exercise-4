import java.util.regex.*;

public class App {
    public static void main(String[] args) throws Exception {
        boolean m, n, o, p;

        String[][] input = new String[][] { { "[abc][abc][abc]", "acb", "abe", "bca", "b" },
                { "[0-9]{3}[A-Z]{3}", "123VBD", "123A1B", "45ABC", "23AQ" }, { "1?2?3?", "13", "43", "", "21" },
                { "[A|B][^a-z]*", "A123", "Ba1", "AA", "C" },
                {"^He[^y]*","Hello","Hey","He","Hi"} };

        for (int i = 0; i < input.length; i++) {
            m = Pattern.matches(input[i][0], input[i][1]);
            n = Pattern.matches(input[i][0], input[i][2]);
            o = Pattern.matches(input[i][0], input[i][3]);
            p = Pattern.matches(input[i][0], input[i][4]);
            System.out.println(input[i][0] + "\n" + input[i][1] + "-" + m + "  " + input[i][2] + "-" + n + "  "
                    + input[i][3] + "-" + o + "  " + input[i][4] + "-" + p);
        }
    }
}
