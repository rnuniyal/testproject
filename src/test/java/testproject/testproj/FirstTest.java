package testproject.testproj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void firstTest() throws IOException {
		ProcessBuilder pb = new ProcessBuilder("./resources/first.sh","test1");
		Process p = pb.start();
		BufferedReader reader  = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}
		
	}

}
