package array;

import java.util.Scanner;

class Employee{
	private String name;
	private String address;
	private int salary;
	private String number;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	public int getSalary() { return salary; }
	public void setSalary(int salary) { this.salary = salary; }
	public String getNumber() { return number; }
	public void setNumber(String number) { this.number = number; }
}

public class EmployeeTest {
	public static void main(String args[]) {
		int member;
		Scanner input = new Scanner(System.in);
		System.out.print("직원 수 : ");
		member = input.nextInt();
		Employee[] emp = new Employee[member];
		
		for(int i = 0; i < member; i++) {
			emp[i] = new Employee();
			
			emp[i].setName(input.next());
			emp[i].setAddress(input.next());
			emp[i].setSalary(input.nextInt());
			emp[i].setNumber(input.nextLine());
		}
		
		for(Employee value : emp) {
			System.out.println("이름 : " + value.getName() + " 주소 : " + value.getAddress() + " 연봉 : " + value.getSalary() + " 전화 번호 : " + value.getNumber());
		}
	}
}