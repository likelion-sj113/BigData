package CustomerProgram;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {

   //고객 정보를 저장할 자료구조 선언
   static ArrayList<Customer> custList = new ArrayList<>();
   //static ArrayList<Customer> searchCustList = new ArrayList<>();

   //리스트 정보를 조회하기 위해 인덱스를 필요로 함
   static int index = -1;
   static int count = 0;//custList.size()

   //기본 입력장치로부터 데이터를 입력받기 위해 Scanner객체 생성
   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
	   
	  InsertCust insert = new InsertCust();
	  UpdateCust update = new UpdateCust();
	  DeleteCust delete = new DeleteCust();
	  SearchCust search = new SearchCust();
	  PrintCust print = new PrintCust();
	  
      while(true) {
         count = custList.size();
         System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
         System.out.println("메뉴를 입력하세요.");
         System.out.println("(I)nsert, (P)revious, (N)ext, " + "(C)urrent, (U)pdate, (D)elete, (S)earch, (V)ip, (Q)uit");// search 기능 추가
         System.out.print("메뉴 입력: ");
         String menu = scan.next();
         menu = menu.toLowerCase();   //입력한 문자열을 모두소문자로 변환
         
         switch(menu.charAt(0)) {
         case 'i':
            System.out.println("고객정보 입력을 시작합니다.");
            custList.add(insert.InsertCustData());
            System.out.println("고객정보를 입력했습니다.");
            break;
            
         case 'p' :
            System.out.println("이전 데이터를 출력합니다.");
            if(index <= 0) {
               System.out.println("이전 데이터가 존재하지 않습니다.");
            }
            else {
               index--;
               print.PrintCustData(index, custList);
            }
            break;
            
         case 'n' :
            System.out.println("다음 데이터를 출력합니다.");
            if(index >= count-1) {
               System.out.println("다음 데이터가 존재하지 않습니다.");
            }
            else {
               index++;
               print.PrintCustData(index, custList);
            }
            break;
            
         case 'c' :
            System.out.println("현재 데이터를 출력합니다.");
            if( (index >= 0) && (index < count)) {
            	print.PrintCustData(index, custList);
            }
            else {
               System.out.println("출력할 데이터가 선택되지 않았습니다.");
            }
            break;
            
         case 'v' :
        	 System.out.println("Vip 데이터를 출력합니다.");
             if( (index >= 0) && (index < count)) {
              //  print.printCustData(index, custList);
             }
             else {
                System.out.println("출력할 데이터가 선택되지 않았습니다.");
             }
             break;
             
         case 'u' :
            System.out.println("데이터를 수정합니다.");
            if( (index >= 0) && (index < count)) {
               System.out.println(index + "번째 데이터를 수정합니다.");
               update.UpdateCustData(index, custList);
            }
            else {
               System.out.println("수정할 데이터가 선택되지 않았습니다.");
            }
            break;
            
         case 'd' :
            System.out.println("데이터를 삭제합니다.");
            if( (index >= 0) && (index < count)) {
               System.out.println(index + "번째 데이터를 삭제합니다.");
               delete.DeleteCustData(index, custList);
            }
            else {
               System.out.println("삭제할 데이터가 선택되지 않았습니다.");
            }
            break;
            
         case 's' :
        	System.out.println("데이터를 검색합니다.");
            System.out.println("Menu : [1]이름, [2]성별, [3]출생년도");
            System.out.print("찾고자하는 정보의 번호를 입력하세요 : ");
            
            search.SearchCustData(custList);
            break;
            
         case 'q' :
            System.out.println("프로그램을 종료합니다.");
            scan.close();   //Scanner 객체를 닫아준다.
            System.exit(0);   //프로그램을 종료시킨다.
            break;   
          
         default : 
            System.out.println("메뉴를 잘 못 입력했습니다.");   
         }//end switch
      }//end while
   }//end main
   
 //고객데이터 출력
   public static void printVipCustomerData(int index) {
      Customer vcust = custList.get(index);
      System.out.println("==========CUSTOMER INFO================");
      System.out.println("이름 : " + vcust.getName());
      System.out.println("성별 : " + vcust.getGender());
      System.out.println("이메일 : " + vcust.getEmail());
      System.out.println("출생년도 : " + vcust.getBirthYear());
      
      System.out.println("=======================================");
   }
		
}//end class