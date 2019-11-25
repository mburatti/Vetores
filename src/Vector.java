
public class Vector {

	public static void main(String[] args) {
		int vec[] = new int[5];
		vec[0]=5;
		vec[1]=7;
		vec[2]=1;
		
		System.out.print("Vector: ");
		for(int x : vec) {
			System.out.print(x+"; ");
		}
		
		System.out.println("\n"+vec.length+" é o tamanho de vec");
		

	}

}
