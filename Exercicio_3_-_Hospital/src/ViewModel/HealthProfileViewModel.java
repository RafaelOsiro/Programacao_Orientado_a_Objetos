package ViewModel;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Model.HealthProfileModel;
import Model.Sex;

public class HealthProfileViewModel {

	private Scanner scanner = new Scanner(System.in);
	
	private HealthProfileModel profile = new HealthProfileModel();
	
	public HealthProfileModel getProfile() {
		return profile;
	}
	
	public void setProfile(HealthProfileModel profile) {
		this.profile = profile;
	}

	public void funcAddNewProfile(HealthProfileModel profile) {

		funcAddname(profile);
		funcAddSex(profile);
		funcAddBirthday(profile);
		funcAddTall(profile);
		funcAddWeight(profile);
	}
	
	public void funcShowProfile(HealthProfileModel profile) {
		
		Sex sex = profile.getSex();
		int age;
		double bmi;
		
		
		System.out.println("NOME COMPLETO: " + profile.getFirstName() + " " + profile.getLastName());

		if (sex == Sex.HOMEM) {
			System.out.println("SEXO: HOMEM");

		} else if (sex == Sex.MULHER) {
			System.out.println("SEXO: MULHER");
		}
		
		age = funcCalculateAge(profile);
		System.out.println("IDADE: " + age + " ANOS");
		System.out.println("ALTURA: " + profile.getTall());
		System.out.println("PESO: " + profile.getWeight());
		
		bmi = funcCalculateBMI(profile);
		
		System.out.println("IMC: " + bmi);
	}

	private void funcAddname(HealthProfileModel profile) {
		
		boolean isValid = false;
		String firstName, lastName;
		
		do {
			
			System.out.println("DIGITE O PRIMEIRO NOME DO PACIENTE: ");
			firstName = scanner.nextLine();
			
			if (firstName.isBlank() || firstName.isEmpty()) {
				isValid = false; 
				System.out.println("O CAMPO 'PRIMEIRO NOME' ESTA EM BRANCO.");
			} else {
				isValid = true;
			}
			
		} while (isValid == false);

		profile.setFirstName(firstName);
		
		do {
			
			System.out.println("DIGITE O SOBRENOME DO PACIENTE: ");
			lastName = scanner.nextLine();
			
			if (lastName.isBlank() || lastName.isEmpty()) {
				isValid = false; 
				System.out.println("O CAMPO 'SOBRENOME' ESTA EM BRANCO.");
			} else {
				isValid = true;
			}
			
		} while (isValid == false);
		
		profile.setLastName(lastName);
	}

	private void funcAddSex(HealthProfileModel profile) {
		
		boolean isValid = false;
		int option;
		Sex sex = null;
		
		do {
			
			System.out.println("ESCOLHA O SEXO DO PACIENTE: ");
			System.out.println("1 - HOMEM");
			System.out.println("2 - MULHER");
			
			option = scanner.nextInt();
			
			if (option == 1) {
				sex = Sex.HOMEM;
				isValid = true;

			} else if (option == 2) {
				sex = Sex.MULHER;
				isValid = true;

			} else {
				isValid = false;
				System.out.println("O CAMPO 'SEXO' E INVALIDO.");
			}
			
		} while (isValid == false);

		profile.setSex(sex);
	}

	private void funcAddBirthday(HealthProfileModel profile) {

		boolean isValid = false;
		String getBirthday;

		LocalDate birthday = null;
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		do {

			System.out.println("DIGITE A DATA DO ANIVERSARIO: MES/DIA/ANO");
			System.out.println("UTILIZE A BARRA '/' PARA SEPARAR OS MESES, DIAS E ANOS");
			getBirthday = scanner.next();

			try {
				birthday = LocalDate.parse(getBirthday, dateTimeFormatter);
				isValid = true;
			} catch (DateTimeParseException error) {
				System.out.println("O CAMPO 'DATA' E INVALIDO.");
				isValid = false;
			}

		} while (isValid == false);

		profile.setBirthday(birthday);
	}

	private void funcAddTall(HealthProfileModel profile) {
		
		boolean isValid = false;
		double tall;
		
		do {
			
			System.out.println("DIGITE A ALTURA DO PACIENTE: ");
			tall = scanner.nextDouble();
			
			if (tall >= 0.1 && tall <= 3) {
				isValid = true;
			} else {
				System.out.println("O CAMPO 'ALTURA' NAO E VALIDO. DIGITE NOVAMENTE");
				isValid = false;
			}
			
		} while (isValid == false);

		profile.setTall(tall);
	}

	private void funcAddWeight(HealthProfileModel profile) {
		
		boolean isValid = false;
		double weight;
		
		do {
			
			System.out.println("DIGITE O PESO DO PACIENTE: ");
			weight = scanner.nextDouble();
			
			if (weight >= 1 && weight <= 220) {
				isValid = true;
			} else {
				System.out.println("O CAMPO 'PESO' NAO E VALIDO. DIGITE NOVAMENTE");
				isValid = false;
			}
			
		} while (isValid == false);

		profile.setWeight(weight);
	}
	
	private int funcCalculateAge(HealthProfileModel profile) {

		ZonedDateTime zoneDateTime = ZonedDateTime.now();

		LocalDate dateNow = LocalDate.of(zoneDateTime.getYear(), zoneDateTime.getMonth(), zoneDateTime.getDayOfMonth());

		Period getAge = Period.between(profile.getBirthday(), dateNow);
		
		return getAge.getYears();
	}
	
	private double funcCalculateBMI(HealthProfileModel profile) {
		
		double tall, weight, bmi;
		
		tall = profile.getTall();
		weight = profile.getWeight();
		
		bmi = weight / (tall * tall);
		
		return bmi;
	}
}
