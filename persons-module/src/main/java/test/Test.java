package test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 4, 5 };
		int[] array2 = { 2, 4, 6, 7 };
		int m = array1.length, n = array2.length;
		List<Integer> result = new ArrayList<>(m + n);
		int i = 0;
		while (i < m + n) {
			if (array1[m - 1] < array2[n - 1]) {
				if (result.contains(array2[n - 1])) {
					n++;
				} else {
					result.add(i, array2[n - 1]);
					i++;
				}
				if (result.contains(array1[m - 1])) {
					m++;
				} else {
					result.add(i, array1[m - 1]);
					i++;
				}
			} else {
				if (result.contains(array2[n - 1])) {
					n++;
				} else {
					result.add(i, array2[n - 1]);
					i++;
				}
				if (result.contains(array1[m - 1])) {
					m++;
				} else {
					result.add(i, array1[m - 1]);
					i++;
				}
			}
			m--;
			n--;
		}

		result.forEach(System.out::println);
	}
}
