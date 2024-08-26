package untitled.src;

public class MaxPathSum {
    public static int getMaxSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] newGrid = new int[rows][cols];

        newGrid[0][0] = grid[0][0];

        for (int j = 1; j < cols; j++) {
            newGrid[0][j] = newGrid[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < rows; i++) {
            newGrid[i][0] = newGrid[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                newGrid[i][j] = Math.max(newGrid[i - 1][j], newGrid[i][j - 1]) + grid[i][j];
            }
        }
        return newGrid[rows - 1][cols - 1];
/*
        newGrid[1][1] = Math.max(newGrid[0][1], newGrid[1][0]) + grid[1][1] = Math.max(1, 7) + 1 = 8
        newGrid[1][2] = Math.max(newGrid[0][2], newGrid[1][1]) + grid[1][2] = Math.max(3, 8) + 7 = 15
        newGrid[1][3] = Math.max(newGrid[0][3], newGrid[1][2]) + grid[1][3] = Math.max(9, 15) + 5 = 20
        newGrid[1][4] = Math.max(newGrid[0][4], newGrid[1][3]) + grid[1][4] = Math.max(10, 20) - 3 = 17

        newGrid[2][1] = Math.max(newGrid[1][1], newGrid[2][0]) + grid[2][1] = Math.max(8, 8) + 6 = 14
        newGrid[2][2] = Math.max(newGrid[1][2], newGrid[2][1]) + grid[2][2] = Math.max(15, 14) + 3 = 18
        newGrid[2][3] = Math.max(newGrid[1][3], newGrid[2][2]) + grid[2][3] = Math.max(20, 18) + 4 = 24
        newGrid[2][4] = Math.max(newGrid[1][4], newGrid[2][3]) + grid[2][4] = Math.max(17, 24) + 2 = 26

        newGrid[3][1] = Math.max(newGrid[2][1], newGrid[3][0]) + grid[3][1] = Math.max(14, 12) + 3 = 17
        newGrid[3][2] = Math.max(newGrid[2][2], newGrid[3][1]) + grid[3][2] = Math.max(18, 17) + 8 = 26
        newGrid[3][3] = Math.max(newGrid[2][3], newGrid[3][2]) + grid[3][3] = Math.max(24, 26) + 4 = 30
        newGrid[3][4] = Math.max(newGrid[2][4], newGrid[3][3]) + grid[3][4] = Math.max(26, 30) + 8 = 38

        newGrid[4][1] = Math.max(newGrid[3][1], newGrid[4][0]) + grid[4][1] = Math.max(17, 19) + 9 = 28
        newGrid[4][2] = Math.max(newGrid[3][2], newGrid[4][1]) + grid[4][2] = Math.max(26, 28) + 6 = 34*/
//        newGrid[4][3] = Math.max(newGrid[3][3], newGrid[4][2]) + grid[4][3] = Math.max(30, 34) - 1 = 33 newGrid[4][4] = Math.max(newGrid[3][4], newGrid[4][3]) + grid[4][4] = Math.max(38, 33) + 3 = 41
}}
