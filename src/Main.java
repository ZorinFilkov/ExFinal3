public class Main {
	
	public static void task3() {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
		}

		int max = a[0];
		int min = a[1];
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0 && max < a[i]) {
				max = a[i];
			}
			if (i % 2 == 1 && min > a[i]) {
				min = a[i];
			}
		}

		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {
		//task1();
		//task2();
		task3();
	}
}