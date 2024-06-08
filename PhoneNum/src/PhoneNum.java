import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

class PhoneNum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Path file = Paths.get("directory.txt");
		try{
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			String end = "ZZZ";
			System.out.println("Enter a name and phone number then enter "+end+" to stop.");
			String name = input.nextLine();
			String number = input.nextLine();
			while(!(name.equals(end))){
				writer.write(name, 0, name.length());
				writer.newLine();
				
				writer.write(number, 0, number.length());
				writer.newLine();
				
				System.out.println("Enter a name and phone number then enter "+end+" to stop.");
				name = input.next();
				number = input.nextLine();
			}
			writer.close();
			input.close();
			
		}catch(Exception e){
			System.out.println("Bad input");
		}
	}
}