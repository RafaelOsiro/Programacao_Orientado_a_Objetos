package ViewModel;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.HeartRatesModel;

public class HeartRatesViewModel {

	private ArrayList<HeartRatesModel> patients = new ArrayList<HeartRatesModel>();
	private Scanner scanner = new Scanner(System.in);

	public void funcAddPatient() {

		HeartRatesModel heartRatesModel = new HeartRatesModel();

		funcAddFirstName(heartRatesModel);
		funcAddLastName(heartRatesModel);
		funcAddBirthday(heartRatesModel);

		patients.add(heartRatesModel);
	}

	public void funcSearchPatient() {

		HeartRatesModel patient = funcSearchPerson();
		int age, maximumHeartRate, heartRateTarget;
		
		if (patient == null) {
			System.out.println("NÃO FOI ENCONTRADO O PACIENTE.");
			return;
		}

		age = funcCalculateAge(patient);
		maximumHeartRate = funcChecMaximumHeartRate(age);
		
		System.out.println("IDADE DO PACIENTE: " + age);		
		System.out.println("FREQUENCIA CARDIACA MAXIMA POR MINUTO: " + maximumHeartRate);
		
		funcCheckHeartRateTarget(maximumHeartRate);
	}

	private void funcAddFirstName(HeartRatesModel patient) {

		boolean isValid = false;
		String firstName;

		do {

			System.out.println("DIGITE O PRIMEIRO NOME: ");
			firstName = scanner.nextLine();

			if (firstName.isBlank() || firstName.isEmpty()) {
				System.out.println("O CAMPO 'PRIMEIRO NOME' NAO PODE ESTAR EM BRANCO OU VAZIO.");
				isValid = false;
			} else {
				isValid = true;
			}

		} while (isValid == false);

		patient.setFirstName(firstName);
	}

	private void funcAddLastName(HeartRatesModel patient) {

		boolean isValid = false;
		String lastName;

		do {

			System.out.println("DIGITE O SOBRENOME: ");
			lastName = scanner.nextLine();

			if (lastName.isBlank() || lastName.isEmpty()) {
				System.out.println("O CAMPO 'SOBRENOME' NAO PODE ESTAR EM BRANCO OU VAZIO.");
				isValid = false;
			} else {
				isValid = true;
			}

		} while (isValid == false);


		patient.setLastName(lastName);
	}

	private void funcAddBirthday(HeartRatesModel patient) {

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

		patient.setBirthday(birthday);
	}

	private HeartRatesModel funcSearchPerson() {

		String nameSearch;

		System.out.println("DIGITE O NOME DO PACIENTE: ");
		nameSearch = scanner.nextLine();

		for (HeartRatesModel patient : patients) {
			if (patient.getFirstName().equals(nameSearch)) {
				return patient;
			}
		}
		return null;
	}

	private int funcCalculateAge(HeartRatesModel patient) {

		ZonedDateTime zoneDateTime = ZonedDateTime.now();

		LocalDate dateNow = LocalDate.of(zoneDateTime.getYear(), zoneDateTime.getMonth(), zoneDateTime.getDayOfMonth());

		Period getAge = Period.between(patient.getBirthday(), dateNow);
		
		return getAge.getYears();
	}

	private int funcChecMaximumHeartRate(int age) {

		int maximumHeartRate;
		maximumHeartRate = 220 - age;
		
		return maximumHeartRate;
	}
	
	private void funcCheckHeartRateTarget(int maximumHeartRate) {
		System.out.println("MINIMO: " + (maximumHeartRate * 0.50));
		System.out.println("MAXIMO: " + (maximumHeartRate * 0.85));
	}
}
