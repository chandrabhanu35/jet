import java.io.File;
import java.io.IOException;

public class Create {

	public static void main(String[] args) throws IOException {
File file = new File("Sample.txt");
		
		file.createNewFile();
		System.out.println("File is created");
		

	}


	}


