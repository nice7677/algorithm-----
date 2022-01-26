package leetcode.dfs.medium;

/**
 * @LeetCode 200. Number of Islands
 */
public class LC200 {

    public static void main(String[] args) {
        char[][] input = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(input));
    }

    public static int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (dfs(grid, i, j)) {
                    result++;
                }
            }
        }
        return result;
    }

    public static boolean dfs(char[][] grid, int x, int y) {
        // grid[x][y] == '0' 이거 명시하고 안하고 속도차이가좀잇음
        if (x <= -1 || x >= grid.length || y <= -1 || y >= grid[x].length || grid[x][y] == '0') {
            return false;
        }
        if (grid[x][y] == '1') {
            grid[x][y] = '0';
            dfs(grid, x - 1, y);
            dfs(grid, x + 1, y);
            dfs(grid, x, y - 1);
            dfs(grid, x, y + 1);
            return true;
        }
        return false;
    }
}
