
public class Ex1007_02 {

	public static void main(String[] args) {
		System.out.print("�Ϸù�ȣ\t ��ǰ��\t Ư¡\n");
		Product note20 = new Product("��Ʈ20",1);
		System.out.print(note20.serialNo+"\t");
		System.out.print(note20.p_name+"\t");
		System.out.println(note20.bar);
		Product s20 = new Product("S20",true);
		System.out.print(s20.serialNo+"\t");
		System.out.print(s20.p_name+"\t");
		System.out.println(s20.s_lens);
		Product sFolder = new Product("sFolder",1,true);
		System.out.print(sFolder.serialNo+"\t");
		System.out.print(sFolder.p_name+"\t");
		System.out.print(sFolder.bar+"\t");
		System.out.println(sFolder.s_lens);
		Product sample = new Product();
		sample.p_name="������";
		System.out.print(sample.serialNo+"\t");
		System.out.print(sample.p_name+"\t");
		
		
		
		
	}

}
