package lesson_6;

public class Application {

	public static void main(String[] args) {

		int loop = 0;

		while (true) {

			System.out.printf("Looping: %d \n", loop);

			if (loop == 5) {
				break;
			}

			loop++;
			System.out.println("Loop running.");

		}

	}

}
