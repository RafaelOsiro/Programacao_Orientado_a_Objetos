package ViewModel;

public class ViewModel {
	
	int hours;
	float salary;
	float payment;
	
	/**
	 * Use this function to calculate salary from worker. 
	 * If hour quantity is higher than 40 hours, it will increase 50% of salary.
	 * Otherwise the it will calculate normal salary, multiplying quantity of hour and quantity of salary
	 * 
	 * @param hour int
	 * @param salary float
	 * @return calculatedSalary float
	 */
	public float funcCalculateSalary(int hour, float salary) {
		
		float calculatedSalary = 0;
		
		if(hour > 40) {
			calculatedSalary = funcCalculateOverTime(hour, salary);
		} else {
			calculatedSalary = funcCalculateNormalSalary(hour, salary);
		}
		
		return calculatedSalary;
	}
	
	/**
	 * Use this function to calculate overtime salary.
	 * 
	 * 
	 * @param hour
	 * @param salary
	 * @return normalSalary + overTimeSalary
	 */
	private float funcCalculateOverTime(int hour, float salary) {
		
		float overTimeSalary, normalSalary;
		int overTime;
		
		
		
		overTime = hour - 40;				
		overTimeSalary = overTime * (salary + (salary * 0.5F));
		
		normalSalary = salary * 40;
		
		
		return (normalSalary + overTimeSalary);
	}
	
	/**
	 * Use this function to clculate normal salary of a person.
	 * 
	 * @param hour int
	 * @param salary float
	 * @return normalSalary float
	 */
	private float funcCalculateNormalSalary(int hour, float salary) {
		
		float normalSalary;
		
		normalSalary = hour * salary;
		
		return normalSalary;
	}
	
}
