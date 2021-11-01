package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/2362
 * 탈출
 */
public class BJ2362 {

    static class DoorLocation {

        Integer X;
        Integer Y;

        public Integer getX() {
            return X;
        }

        public Integer getY() {
            return Y;
        }

        public DoorLocation(Integer x, Integer y) {
            X = x;
            Y = y;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndK = br.readLine().split(" ");
        Integer n = Integer.valueOf(nAndK[0]); // 벽
        Integer k = Integer.valueOf(nAndK[1]); // 간수 수

        String[][] room = new String[n][n];


        List<DoorLocation> doorLocationList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] roomValue = br.readLine().split("");
            for (int j = 0; j < roomValue.length; j++) {
                room[i][j] = roomValue[j];
                if (roomValue[j].equals("O")) {
                    DoorLocation doorLocation = new DoorLocation(i, j);
                    doorLocationList.add(doorLocation);
                }
            }
        }

        for (int i = 0; i < doorLocationList.size(); i++) {
            Integer x = doorLocationList.get(i).getX();
            Integer y = doorLocationList.get(i).getY();
            if (x == 0 && y == 0) {
                // 아래로 x + 1 오른쪽으로 y + 1
            } else if (x == n && y == 0) {
                // 위로 x -1 오른쪽으로 y + 1
            } else if (x == 0 && y == n) {
                // 아래로 x + 1 왼쪽으로 y - 1
            } else if (x == n && y == n) {
                // 위로 x -1 왼쪽으로 y - 1
            } else if (x == 0 || x == n) {
                if (x == n) {
                    // 좌우 y - 1, y + 1 위로 x - 1
                } else {
                    // 좌우 y - 1 , y + 1 아래로 x + 1
                }
            } else if (y == 0) {
                if (y == n) {
                    // 위아래 x - 1 , x + 1 왼쪽으로 y - 1
                } else {
                    // 위아래 x - 1, x + 1 오른쪽으로 y + 1
                }
            } else {
                // 위아래 좌우 + 1 , - 1
            }

            // 이제 위아래로 검색 하고 빈틈 찾고 간수로 막는다.
        }


    }

}
