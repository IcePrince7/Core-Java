import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bdr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a	String ");
		String ip = bdr.readLine();
		bdr.close();
		
		System.out.println(ip);
		 
	}
}
