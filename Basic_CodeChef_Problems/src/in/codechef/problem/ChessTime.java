package in.codechef.problem;

import java.util.Scanner;

public class ChessTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			System.out.println((x*60)/20);
		}
		sc.close();
	}

}