public class Main {
    public static void main(String[] args) {
        //before optimization
        long start = System.nanoTime();
        int[][] MB = new int[10][10];
        int res = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MB[j][i]++;
            }
        }
        long end = System.nanoTime();
        System.out.println("Program execution time - " + (double) (end - start) / Math.pow(10, 9));
        //after optimization
        long start1 = System.nanoTime();
        int[][] MB1 = new int[10][10];
        int[] row;
        for (int i = 0; i < 10; i++) {
            row = MB[i];
            for (int j = 0; j < row.length; j++) {
                row[j]++;
            }
        }
        long end1 = System.nanoTime();
        System.out.println("Program execution time - " + (double) (end1 - start1) / Math.pow(10, 9));
    }
}
