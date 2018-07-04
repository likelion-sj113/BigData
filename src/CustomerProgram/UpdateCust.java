package CustomerProgram;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateCust {
	static Scanner scan = new Scanner(System.in);
	
	public ArrayList<Customer> UpdateCustData(int index, ArrayList<Customer> custList){
		Customer updatecust = custList.get(index);
	    
	    System.out.println("---------UPDATE CUSTOMER INFO----------");
	    System.out.print("이름(" + updatecust.getName() + ") :");
	    updatecust.setName(scan.next());
	
	    System.out.print("성별(" + updatecust.getGender() + ") :");
	    updatecust.setGender(scan.next().charAt(0));
	
	    System.out.print("이메일(" + updatecust.getEmail() + ") :");
	    updatecust.setEmail(scan.next());
	
	    System.out.print("출생년도(" + updatecust.getBirthYear() + ") :");
	    updatecust.setBirthYear(scan.nextInt());
	    
	    return(custList);
	}
}
