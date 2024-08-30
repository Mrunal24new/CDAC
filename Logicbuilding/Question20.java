public class Pattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= rows - i + 1; j--) {
                System.out.print(j);
                if (j > rows - i + 1) {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
