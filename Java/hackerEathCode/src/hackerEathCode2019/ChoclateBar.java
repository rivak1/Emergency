package hackerEathCode2019;

import java.util.Scanner;

public class ChoclateBar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 5;
		int count = 0;
		while (T > 0) { 
			String bar = sc.nextLine();
			count = 0;
			int box[] = new int[bar.length()];
			for (int i = 2; i < bar.length(); i++) {
				if (!(bar.charAt(i) == bar.charAt(i - 1) && bar.charAt(i - 1) == bar.charAt(i - 2))) {
					box[i] = 3;
					if (i > 3)
						box[i] += box[i - 3];
				}
			}                                         
			int max = Integer.MIN_VALUE;
			for (int i1 = 0; i1 < box.length; i1++) {
				if (box[i1] > max)
					max = box[i1];
			}

			System.out.println(bar.length() - max);

		}
		T = T - 1;
	}

}
