package CustomerProgram;

public class CustomerVip extends Customer {
	private String address;
	private String job;
	private int income;

	public CustomerVip(String address, String job, int income) {
		super();
		this.address = address;
		this.job = job;
		this.income = income;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	public static void printVipCustomerData() {
	//	   System.out.println("주소 : " + getAddress());
	//	   System.out.println("직업 : " + getJob());
	//	   System.out.println("수입 : " + vcust.getIncome());
	}
	   
	@Override
	public String toString() {
		return "VipCustomer [address=" + address + ", job=" + job + ", income=" + income + "]";
	}
}
