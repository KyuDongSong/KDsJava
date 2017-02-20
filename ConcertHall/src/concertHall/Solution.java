package concertHall;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// 배열 탐색용 인덱스
		int i = 0;

		// k = 대기순번
		// column = 세로
		// row = 가로
		// num = 1번부터 시작될 자리의 번호
		// t = 방향제어
		// hall[][] = 공연장 좌석
		int k;
		int column;
		int row;
		int num = 1;
		int t = 1;

		// 좌석의 좌표
		int x = 0;
		int y = -1;

		// C, R, K 입력
		column = input.nextInt();
		row = input.nextInt();
		k = input.nextInt();

		int[][] hall = new int[column][row];

		if (k > column * row) {
			System.out.println("0");
		} else {
			while (0 <= column || 0 <= row) {
				for (i = 0; i < row; i++) {
					y = y + t;
					hall[x][y] = num;
					if (num == k) {
						System.out.println((x + 1) + " " + (y + 1));
						return;
					}
					num++;
				}
				column--;

				for (i = 0; i < column; i++) {
					x = x + t;
					hall[x][y] = num;
					if (num == k) {
						System.out.println((x + 1) + " " + (y + 1));
						return;
					}
					num++;
				}
				row--;

				t = t * -1;
			}
		}
		input.close();
	}
}
