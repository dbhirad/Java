package Demo;

public class ShiftZeroToLeft {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 0, 7, 0, 5, 9, 0, 1 };
		int index = 0;
		int ar1[] = new int[ar.length];

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] == 0) {
				index++;
			}
		}

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] != 0) {
				ar1[index] = ar[i];
				index++;
			}
			System.out.println(ar1[i] + " ");
		}

	}

}
