import java.util.*;

public class Ex1015_02 {

	public static void main(String[] args) {

		//��������
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
			System.out.println("[ ������ ���α׷� ]");
			System.out.println("1.���Է�");
			System.out.println("2.�����");
			System.out.println("3.������");
			System.out.println("4.���˻�");
			System.out.println("5.����������");
			System.out.println("0.����");
			System.out.println("----------------");
			System.out.println("���ϴ� ������ �Է��ϼ���.>>");
			choice = scan.nextInt();

			switch (choice) {
			case 1: // �������Է�
				
				while(true) {
					
					System.out.println("�̸��� �Է��ϼ���.(0.������������ �̵�)>>");
					name = scan.next();
					if(name.equals("0")) {
						System.out.println("������������ �̵��մϴ�.!");
						break;
					}
					System.out.println("Ű�� �Է��ϼ���.>>");
					height = scan.nextInt();
					System.out.println("������ �Է��ϼ���.>>");
					weight = scan.nextDouble();
					System.out.println("������ �Է��ϼ���.>>");
					gender = scan.next().charAt(0);
					System.out.println("��ȥ���θ� �Է��ϼ���.(1.��ȥ  0.��ȥ>>");
					if (scan.nextInt() == 0) {
						married = false;
					} else {
						married = true;
					}

					list.add(new Person(name,height,weight,gender,married)); // ArrayList�� 1�� Person��ü ����
					
				}
				break;

			case 2:
				System.out.println("[ ������ ��� ]");
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
			case 3: //������
				System.out.println("���̸��� �Է��ϼ���.>>");
				search_name = scan.next(); 
								
				loop2: for(int i=0;i<list.size();i++) {
					Person p = (Person)list.get(i);
					if(search_name.equals(p.name)) {
						System.out.println("[ �����׸� ]");
						System.out.println("1.Ű");
						System.out.println("2.������");
						System.out.println("3.����");
						System.out.println("4.��ȥ����");
						System.out.println("0.���������� �̵�");
						System.out.println("------------");
						System.out.println("�����Ϸ��� ������ �Է��ϼ���.>>");
						choice = scan.nextInt();
						switch(choice) {
						case 1:
							System.out.println("���� Ű :"+p.height);
							System.out.println("�����Ϸ��� Ű�� �Է��ϼ���.>>");
							p.height = scan.nextInt();
							list.set(i,p);
							
							break;
						case 2:
							System.out.println("���� ������ :"+p.weight);
							System.out.println("�����Ϸ��� �����Ը� �Է��ϼ���.>>");
							p.weight = scan.nextDouble();
							list.set(i,p);
							break;
						case 3:
							System.out.println("���� ���� :"+p.gender);
							System.out.println("�����Ϸ��� ������ �Է��ϼ���.>>");
							p.gender = scan.next().charAt(0);
							list.set(i,p);
							break;
						case 4:
							System.out.println("���� ��ȥ���� :"+p.married);
							System.out.println("�����Ϸ��� ������ �Է��ϼ���.>>");
							if (scan.nextInt() == 0) {
								married = false;
							} else {
								married = true;
							}
							list.set(i,p);
							break;
						case 0:
							System.out.println("������������ �̵��մϴ�.!");
							break loop2;
						}
						count++; //
						break;
					}//if
					
				}//for
				if(count==0) {
					System.out.println("ã�� �����Ͱ� �����ϴ�. �ٽ� �Է����ּ���.");
				}
				count=0;

				break;
				
			case 4: //���˻� -> ArrayList
				System.out.println("���̸��� �Է��ϼ���.>>");
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
					System.out.println("ã�� �����Ͱ� �����ϴ�. �ٽ� �Է����ּ���.");
				}
				count=0;
				break;
				
			case 5: //����������
				System.out.println("���̸��� �Է��ϼ���.>>");
				search_name = scan.next(); 
				for(int i=0;i<list.size();i++) {
					Person p = (Person)list.get(i);
					if(search_name.equals(p.name)) {
						System.out.println(p.name+" �����͸� �����Ͻðڽ��ϱ�?(1.Yes 0.No");
						choice = scan.nextInt();
						if(choice==1) {
							list.remove(i);
							System.out.println("�����Ǿ����ϴ�.");
						}
						count++;
						break;
					}
				}//for
				if(count==0) {
					System.out.println("ã�� �����Ͱ� �����ϴ�. �ٽ� �Է����ּ���.");
				}
				count=0;
				break;
				
			case 0:
				System.out.println("���α׷��� �����մϴ�.!");
				break loop1;

			}

		} // while

	}// main

}// class
