import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int somaIdade = 0;
		int divisor = 0;
		double media = 0.0;

		if (idade < 0) {
			System.out.println("Impossível calcular");
		} else {
			while (idade >= 0) {
				divisor += 1;
				somaIdade += idade;
				media = (double) somaIdade / divisor;
				idade = sc.nextInt();
			}

			System.out.printf("%.2f%n", media);
			sc.close();
		}
	}

}
