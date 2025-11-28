import java.util.ArrayList;
import java.util.List;

public class SequentialMode {

    public static List<String> validate(int[][] board) {
        List<String> all = new ArrayList<>();
        all.addAll(RowChecker.check(board));
        all.addAll(ColumnChecker.check(board));
        all.addAll(BoxChecker.check(board));
        return all;
    }

    public static void printResult(int[][] board) {
        List<String> errors = validate(board);
        if (errors.isEmpty()) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
            for (String e : errors) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        int[][] b = new int[9][9];
        b[0][0] = 8;
        b[0][1] = 8;
        printResult(b);
    }
}

