package assignment029;

public class EmployeeManage {
public static void main(String[] args) {
		
		FixedSalaryEmployee abstractEmployee=new FixedSalaryEmployee("Md. ", "5697485", 12000);
		System.out.println(abstractEmployee.calculateSalary());
		
		HourlySalaryEmployee hourlysal=new HourlySalaryEmployee("sd. ", "5697485", 12000,200);
		System.out.println(hourlysal.calculateSalary());
		
		CommissionSalaryEmployee comission=new CommissionSalaryEmployee("fd. ", "5697485", 12000);
		System.out.println(comission.calculateSalary());
	}

}
