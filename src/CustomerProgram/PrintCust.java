package CustomerProgram;
import java.util.ArrayList;

public class PrintCust {
	public void PrintCustData(int index, ArrayList<Customer> custList) {
	      Customer printcust = custList.get(index);
	      
	      System.out.println("==========CUSTOMER INFO================");
	      System.out.println("이름 : " + printcust.getName());
	      System.out.println("성별 : " + printcust.getGender());
	      System.out.println("이메일 : " + printcust.getEmail());
	      System.out.println("출생년도 : " + printcust.getBirthYear());
	      System.out.println("=======================================");
	}
}
