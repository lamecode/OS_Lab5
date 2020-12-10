public class Main {
    public static void main(String[] args) {
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
    }
}
