package class_object_pck;

import java.util.Objects;

public class Java_POJO {
	private int id;
	private String name;
	private double salary;
	
	public Java_POJO() {
	}
	
	public Java_POJO(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//Getters & Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	// ----------------------------------------//
	
	@Override
	public String toString() {
		return "Employee [id =" + id + ", name =" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Java_POJO employee = (Java_POJO) obj;
		return id == employee.id &&
				Double.compare(employee.salary, salary) == 0 &&
				Objects.equals(name, employee.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
} 
