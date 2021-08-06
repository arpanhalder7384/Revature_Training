package eg1;
import java.io.*;

public class aug_5CharacterStreamDemo {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\Users\\arpan\\Desktop\\"
					+ "Revature\\My_Java_Code\\"
					+ "Revature_Training_2_6_Aug\\java_examples\\"
					+ "aug_5\\FileIO\\eg1\\txt");
			BufferedReader br = new BufferedReader(reader);
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\arpan\\Desktop\\"  
					+ "Revature\\My_Java_Code\\"
					+ "Revature_Training_2_6_Aug\\java_examples\\"
					+ "aug_5\\FileIO\\eg1\\output.txt"));
			/*
			int character = reader.read();
			while (character != -1) {
				System.out.print((char) character);
				character = reader.read();
			}
			*/
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}
			
			br.close();			
			reader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
	}
	
	// Task 1 - Create file copy of an image.
	//          InputStream -> FileInputStream, BufferedInputStream
	//          OutputStream - FileOutputStream, BufferedOutputStream


}
