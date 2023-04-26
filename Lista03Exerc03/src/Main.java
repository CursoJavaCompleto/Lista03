import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool, gasolina, diesel;
		alcool = gasolina = diesel = 0;
		int cod = sc.nextInt();

		while (cod != 4) {
			if (cod == 1) {
				alcool += 1;
			} else if (cod == 2) {
				gasolina += 1;
			} else if (cod == 3) {
				diesel += 1;
			}
			cod = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();

	}

}
