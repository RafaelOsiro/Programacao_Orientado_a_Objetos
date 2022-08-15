package ViewModel;

import java.util.Scanner;
import View.MenuView;
import ViewModel.Model.EmployeeModel;
import java.util.ArrayList;
import java.util.Calendar;

public class RetirementViewModel {
	
	@SuppressWarnings("unused")
	private MenuView menuView;
	
	public void setMenuView(MenuView menuView) {
		this.menuView = menuView;
	}
	
	Scanner scan = new Scanner(System.in);
	ArrayList<EmployeeModel> employees = new ArrayList<EmployeeModel>();
	
	public void funcCreateNewEmployee() {
		
		int register;
		int birthYear;
		int admissionYear;
		
		EmployeeModel employee = new EmployeeModel();
		System.out.println("--=Cadastrar um funcionario==-");
		System.out.println("Digite a matricula do funcionario:");
		register = scan.nextInt();
		employee.setRegister(register);
		
		System.out.println("--=Cadastrar um funcionario==-");
		System.out.println("Digite o ano de nascimento do funcionario:");
		birthYear = scan.nextInt();
		employee.setBirthYear(birthYear);
		
		System.out.println("--=Cadastrar um funcionario==-");
		System.out.println("Digite o ano de admissao do funcionario:");
		admissionYear = scan.nextInt();
		employee.setAdmissionYear(admissionYear);

		employees.add(employee);
		System.out.println("Cadastro efetuado com sucesso!\n\n");
	}
	
	public EmployeeModel funcSearchRegister() {
		
		int searchRegister = scan.nextInt();
		
		if(employees.isEmpty()) {
			System.out.println("A matricula do digitada nao existe!");
			return null;
		}	
		
		for(EmployeeModel employee: employees) {
			if (searchRegister == employee.getRegister()) {
				return employee;
			}
		}
		
		return null;
	}
	
	public void funcSearchEmployee() {
		
		System.out.println("-==Procurar um funcionario==-");
		System.out.println("Digite a matricula desejada: ");
		EmployeeModel employee = funcSearchRegister();
		
		if (employee != null) {
			System.out.println("Matricula do empregado: " + employee.getRegister());
			System.out.println("Data de nascimento: " + employee.getBirthYear());
			System.out.println("Data de admissao: " + employee.getAdmissionYear());
		} else {
			System.out.println("\nA matricula do digitada nao foi encontrada!");
		}
	}
	
	public void funcCheckRetirement() {
		
		System.out.println("-==Checar se um funcionario==-");
		System.out.println("Digite a matricula do funcionario: ");
		EmployeeModel employee = funcSearchRegister();
		int option, year = funcGetYear();
		
		if (employee != null) {
			
			if (funcIsRetired(employee.getBirthYear(), employee.getAdmissionYear())) {
				System.out.println("Idade: " + (year - employee.getBirthYear()));
				System.out.println("\nTempo de trabalho: " + (year - employee.getAdmissionYear()));
				System.out.println("\n[1] Requerer aposentadoria");
				System.out.println("\n[2] Nao requerer aposentadoria");
				
				option = scan.nextInt();
				
				if (option == 1) {
					System.out.println("Requerendo aposentadoria.");
				} else if (option == 2){
					System.out.println("Não requerer a aposentadoria");
				} else {
					System.out.println("Opcao invalida");
				}
			} else {
				System.out.println("O funcionario da matricula: " + employee.getRegister() + " nao possui os requisitos para aposentar." );
				System.out.println("Faltam: " + ((employee.getBirthYear() + 65) - year) + " anos para se aposentar por idade.");
				System.out.println("ou faltam: " + ((employee.getAdmissionYear() + 30) - year) + " anos para se aposentar por tempo de servico.");
				System.out.println("ou faltam: " + ((employee.getBirthYear() + 60) - year) + " anos de idade e " + ((employee.getAdmissionYear() + 25) - year) + " anos de servico.");
			}
		} else {
			System.out.println("A matricula do digitada nao existe!");
		}
	}
	
	private int funcGetYear( ) {
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year;
	}
	
	private boolean funcIsRetired(int birthYear, int admissionYear) {
		
		int year = funcGetYear(), age, workedTime;
		
		age = year - birthYear;
		workedTime = year - admissionYear;
		
		if (age >= 65) {
			return true;
		} else if (workedTime >= 30) {
			return true;
		} else if (age >= 60 && workedTime <= 25) {
			return true;
		} else {
			return false;
		}
	}
}
