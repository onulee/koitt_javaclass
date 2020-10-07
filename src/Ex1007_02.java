
public class Ex1007_02 {

	public static void main(String[] args) {
		System.out.print("일련번호\t 제품명\t 특징\n");
		Product note20 = new Product("노트20",1);
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
		sample.p_name="샘플폰";
		System.out.print(sample.serialNo+"\t");
		System.out.print(sample.p_name+"\t");
		
		
		
		
	}

}
