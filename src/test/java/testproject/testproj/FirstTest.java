package testproject.testproj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void firstTest() throws IOException {
	//	ProcessBuilder pb = new ProcessBuilder("/Users/e002275/Documents/SORAA/App/05June/Soraa_Common/apps/helia-ios/firmwares/serve.py");
		
	//	Runtime r = Runtime.getRuntime();
	//	Process p = r.exec("./resources/first.sh","testing");
		//Process p = r.exec("cd /Users/e002275/Documents/SORAA/App/05June/Soraa_Common/apps/helia-ios/firmwares/");
		
	//	BufferedReader reader  = new BufferedReader(new InputStreamReader(p.getInputStream()));
//		String line = null;
//		while((line=reader.readLine())!=null)
//		{
//			System.out.println(line);
//		}
		
		String texttowrite = "test123";
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("./testing.txt"), "utf-8"))) {
			
	   writer.write(texttowrite);
	   writer.newLine();
	   writer.write("1234");
	   writer.newLine();
	   writer.write("456");
	   
	  
	}
		
	}

}
