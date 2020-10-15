import java.util.*;

public class Ex1015_02 {

	public static void main(String[] args) {

		//변수선언
		ArrayList list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int choice = 0;

		String name="";
		int height=0;
		double weight=0;
		char gender=' ';
		boolean married=false;
		String search_name="";
		int count=0;

		loop1: while (true) {
			System.out.println("[ 고객정보 프로그램 ]");
			System.out.println("1.고객입력");
			System.out.println("2.고객출력");
			System.out.println("3.고객수정");
			System.out.println("4.고객검색");
			System.out.println("5.고객정보삭제");
			System.out.println("0.종료");
			System.out.println("----------------");
			System.out.println("원하는 정보를 입력하세요.>>");
			choice = scan.nextInt();

			switch (choice) {
			case 1: // 고객정보입력
				
				while(true) {
					
					System.out.println("이름을 입력하세요.(0.이전페이지로 이동)>>");
					name = scan.next();
					if(name.equals("0")) {
						System.out.println("이전페이지로 이동합니다.!");
						break;
					}
					System.out.println("키를 입력하세요.>>");
					height = scan.nextInt();
					System.out.println("몸무게 입력하세요.>>");
					weight = scan.nextDouble();
					System.out.println("성별을 입력하세요.>>");
					gender = scan.next().charAt(0);
					System.out.println("결혼여부를 입력하세요.(1.기혼  0.미혼>>");
					if (scan.nextInt() == 0) {
						married = false;
					} else {
						married = true;
					}

					list.add(new Person(name,height,weight,gender,married)); // ArrayList에 1개 Person객체 저장
					
				}
				break;

			case 2:
				System.out.println("[ 고객정보 출력 ]");
				for(int i=0;i<list.size();i++) {
					Person p = (Person) list.get(i);
					System.out.print(p.name+"\t");
					System.out.print(p.height+"\t");
					System.out.print(p.weight+"\t");
					System.out.print(p.gender+"\t");
					System.out.print(p.married+"\t");
					System.out.println();
				}
				break;
			case 3: //고객수정
				System.out.println("고객이름을 입력하세요.>>");
				search_name = scan.next(); 
								
				loop2: for(int i=0;i<list.size();i++) {
					Person p = (Person)list.get(i);
					if(search_name.equals(p.name)) {
						System.out.println("[ 수정항목 ]");
						System.out.println("1.키");
						System.out.println("2.몸무게");
						System.out.println("3.성별");
						System.out.println("4.결혼여부");
						System.out.println("0.이전페이지 이동");
						System.out.println("------------");
						System.out.println("수정하려는 정보를 입력하세요.>>");
						choice = scan.nextInt();
						switch(choice) {
						case 1:
							System.out.println("현재 키 :"+p.height);
							System.out.println("변경하려는 키를 입력하세요.>>");
							p.height = scan.nextInt();
							list.set(i,p);
							
							break;
						case 2:
							System.out.println("현재 몸무게 :"+p.weight);
							System.out.println("변경하려는 몸무게를 입력하세요.>>");
							p.weight = scan.nextDouble();
							list.set(i,p);
							break;
						case 3:
							System.out.println("현재 성별 :"+p.gender);
							System.out.println("변경하려는 성별을 입력하세요.>>");
							p.gender = scan.next().charAt(0);
							list.set(i,p);
							break;
						case 4:
							System.out.println("현재 결혼여부 :"+p.married);
							System.out.println("변경하려는 성별을 입력하세요.>>");
							if (scan.nextInt() == 0) {
								married = false;
							} else {
								married = true;
							}
							list.set(i,p);
							break;
						case 0:
							System.out.println("이전페이지로 이동합니다.!");
							break loop2;
						}
						count++; //
						break;
					}//if
					
				}//for
				if(count==0) {
					System.out.println("찾는 데이터가 없습니다. 다시 입력해주세요.");
				}
				count=0;

				break;
				
			case 4: //고객검색 -> ArrayList
				System.out.println("고객이름을 입력하세요.>>");
				search_name = scan.next(); 
				for(int i=0;i<list.size();i++) {
					Person p = (Person)list.get(i);
					if(search_name.equals(p.name)) {
						System.out.print(p.name+"\t");
						System.out.print(p.height+"\t");
						System.out.print(p.weight+"\t");
						System.out.print(p.gender+"\t");
						System.out.print(p.married+"\t");
						System.out.println();
						count++;
						break;
					}
				}//for
				if(count==0) {
					System.out.println("찾는 데이터가 없습니다. 다시 입력해주세요.");
				}
				count=0;
				break;
				
			case 5: //고객정보삭제
				System.out.println("고객이름을 입력하세요.>>");
				search_name = scan.next(); 
				for(int i=0;i<list.size();i++) {
					Person p = (Person)list.get(i);
					if(search_name.equals(p.name)) {
						System.out.println(p.name+" 데이터를 삭제하시겠습니까?(1.Yes 0.No");
						choice = scan.nextInt();
						if(choice==1) {
							list.remove(i);
							System.out.println("삭제되었습니다.");
						}
						count++;
						break;
					}
				}//for
				if(count==0) {
					System.out.println("찾는 데이터가 없습니다. 다시 입력해주세요.");
				}
				count=0;
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;

			}

		} // while

	}// main

}// class
