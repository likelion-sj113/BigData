package CustomerProgram;
import java.util.Scanner;

public class InsertCust{
	static Scanner scan = new Scanner(System.in);
	 
	public Customer InsertCustData(){
		  System.out.print("이름 : ");
	      String name = scan.next();
	      
	      System.out.print("성별(M/F) : ");
	      char gender = scan.next().charAt(0); 
	      
	      System.out.print("이메일 : ");
	      String email = scan.next();  
	      
	      System.out.print("탄생년도(YYYY) : " );
	      int birthYear = scan.nextInt();
	      
	      //입력받은 데이터로 고객 객체를 생성
	      Customer cust = new Customer(name, gender, email, birthYear);
	  
	      return(cust); 
	}
}