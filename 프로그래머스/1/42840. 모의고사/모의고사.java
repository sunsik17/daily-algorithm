import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
	final int[] first = {1, 2, 3, 4, 5};
	final int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
	final int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] count = {0, 0, 0};
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == first[i % first.length]) {
				count[0]++;
			}
			if (answers[i] == second[i % second.length]) {
				count[1]++;
			}
			if (answers[i] == third[i % third.length]) {
				count[2]++;
			}
		}
		int max = Math.max(Math.max(count[0], count[1]), count[2]);
	
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			if (count[i] == max) {
				result.add(i + 1);
			}
		}
		answer = new int[result.size()];
		result.sort((o1, o2) -> o1 - o2);
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}
}
