import java.io.*;
import java.nio.file.*;
//change input to output and writer to reader
class PhoneDir{
	public static void main(String[] args) {
		Path file = Paths.get("directory.txt");
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			String name = reader.readLine();
			
			while(name != null){
				System.out.println(name);
				name = reader.readLine();
			}
			reader.close();
		}catch(Exception e){
			System.out.println("Bad input");
		}
	}
}