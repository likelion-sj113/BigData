package CustomerProgram;
import java.util.ArrayList;
import java.util.Scanner;
import CustomerProgram.PrintCust;

public class SearchCust {
	static ArrayList<Customer> searchCustList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int sindex = 0;
	
	public void SearchCustData(ArrayList<Customer> custList) {
		PrintCust sprint = new PrintCust();
		String num = scan.next(); //번호입
		
		switch(num){ 
    		case "1" : 
    		   System.out.print("찾고자하는 이름 : ");
	           String namedata = scan.next(); //이름입력
	           for(int  i = 0; i < custList.size(); i++ ) {
	               if(custList.get(i).getName().contains(namedata)) {
	            	   searchCustList.add(custList.get(i));
	               }
	           }
	           break;
	           
	        case "2" :
	          System.out.print("찾고자하는 성별(M/F) : ");
	           String FMdata = scan.next();
	           char FMNdata = FMdata.charAt(0);
	           for(int  i = 0; i < custList.size(); i++ ) {
	               if(custList.get(i).getGender() == FMNdata) {
	            	   searchCustList.add(custList.get(i));
	               }
	         }
	           break;
	        
	        case "3" :
	           System.out.print("찾고자하는 출생년도(YYYY) : ");
	           int borndata = scan.nextInt();
	           for(int  i = 0; i < custList.size(); i++ ) {
	               if(custList.get(i).getBirthYear() == borndata) {
	            	   searchCustList.add(custList.get(i));
	               }
	            }
	           break;
	           
	        default : 
	           System.out.println("입력이 잘못되었습니다. 처음부터 다시 해주시기바랍니다.");
	    }
		if( (sindex >= 0) && (sindex < searchCustList.size())) {
            System.out.println("찾고자하는 정보를 출력합니다.");
            while(sindex < searchCustList.size()) {
            	sprint.PrintCustData(sindex, searchCustList);
            	sindex++;
            }
         }
         else {
            System.out.println("찾는 정보가 존재하지 않습니다.");
         }
		System.out.println("검색이 완료되었습니다.");
	}
}
