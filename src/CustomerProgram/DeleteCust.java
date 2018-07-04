package CustomerProgram;
import java.util.ArrayList;

public class DeleteCust {
	public ArrayList<Customer> DeleteCustData(int index, ArrayList<Customer> custList) {
		custList.remove(index);
		
		return(custList);
	}
}
