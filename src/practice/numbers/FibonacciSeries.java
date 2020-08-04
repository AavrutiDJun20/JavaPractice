package practice.numbers;

public class FibonacciSeries {
	
	void getFibonacciSeries(int endNum) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		System.out.print("Fibonacci series --> ");
		while(count<endNum) {
			System.out.print(num2 + " ");
			num2 = num1 + num2;
			num1 = num2 - num1;
			count++;
		}
	}

	public static void main(String[] args) {
		int num = 8;
		new FibonacciSeries().getFibonacciSeries(num);
		System.out.println();
		num = 10;
		new FibonacciSeries().getFibonacciSeries(num);
	}
}
