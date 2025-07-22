package entityclassassignment2;

public class ProductClass {

	private String Name;
	private String Dept;
	private String city;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "ProductClass [Name=" + Name + ", Dept=" + Dept + ", city=" + city + "]";
	}

}
