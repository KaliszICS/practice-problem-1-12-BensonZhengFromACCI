import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String int1 = input.nextLine();
		System.out.println(Integer.parseInt(int1)+3);
		input.close();


	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String int1 = input.nextLine();
		System.out.println(Double.parseDouble(int1 + 4)+2);
		input.close();

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a radius: ");
		String int1 = input.nextLine();
		Double rad1 = Double.parseDouble(int1);
		System.out.println(rad1 * rad1 * 3.14);
		input.close();

	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String int1 = input.nextLine();
		Double num1 = Double.parseDouble(int1);
		System.out.println(Math.floor(num1 * 12));
		input.close();



	}

}
