import java.util.Scanner;
import ViewModel.ViewModel;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int hour;
		float salary;
		
		Scanner scan = new Scanner(System.in);
		ViewModel viewModel = new ViewModel();
		
		System.out.println("Digite a quantidade de horas total trabalhadas: ");
		hour = scan.nextInt();
		
		System.out.println("Digite o valor da hora trabalhada: ");
		salary = scan.nextFloat();
		
		System.out.println("O salario é: R$" + viewModel.funcCalculateSalary(hour, salary));
	}

}
