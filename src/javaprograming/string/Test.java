package javaprograming.string;

public class Test {

	public static void main(String[] args) {

		System.out.println("Y" + "O");
		System.out.println('L' + 'O');
		checkForException();
	}

	public static final void checkForException() {

		int[] a = new int[3];

		try {
			a[0] = 1;
			a[1] = 2;
//			a[4] = 3;
			System.out.println("TryBlock");

		} catch (Exception e) {
			e.getMessage();
			e.getCause();
			e.printStackTrace();
			System.out.println("Catch block-Exception");
		}finally {
			System.out.println("fianlly block");
		}
	}
}