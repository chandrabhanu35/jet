import java.io.File;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String Filename;
		Filename = sc.nextLine();
		
		File file = new File(Filename);
		
		if(file.delete()) {
			System.out.println("file deleated");
			
		}else {
			System.out.println("Error in deleation");
		}
		sc.close();

	}

}
