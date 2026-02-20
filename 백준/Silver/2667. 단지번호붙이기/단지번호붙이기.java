import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	static int[][] dirs = {
		{1, 0},
		{0, 1},
		{-1, 0},
		{0, -1}
	};

	static boolean[][] visited;
	static int[][] map;
	static int N;
	static int cnt;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(split[j]);
			}
		}
		visited = new boolean[N][N];

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] != 0 && !visited[i][j]) {
					dfs(i,j);
					result.add(cnt);
					cnt = 0;
				}
			}
		}
        Collections.sort(result);

		System.out.println(result.size());
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		cnt++;

		for (int[] dir : dirs) {
			int newX = x + dir[0];
			int newY = y + dir[1];

			if (newX < 0 || newY < 0 || newX >= N || newY >= N || visited[newX][newY]) {
				continue;
			}

			if (map[newX][newY] != 0) {
				dfs(newX, newY);
			}
		}
	}
}