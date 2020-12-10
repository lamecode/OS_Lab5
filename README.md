# Memory optimization
Source code in Java:
int[][] MB = new int[10][10];
        int res = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MB[j][i]++;
            }
        }
