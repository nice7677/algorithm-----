package leetcode.dfs.medium;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] input = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(input) == 1);
    }

    public static int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && dfs(i, j, grid)) {
                    result++;
                }
            }
        }
        return result;
    }

    public static boolean dfs(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return false;
        }
        grid[i][j] = '0';
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);
        dfs(i + 1, j , grid);
        dfs(i - 1, j , grid);
        return true;
    }

}
