package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.sun.javafx.scene.input.InputEventUtils;

public class FileTasks {

	public static String readFile1(String filename) throws IOException {
		
		String data = "";
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			
			int c;
			try {
				while((c = reader.read()) >= 0) {
					data = data + (char)c;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		if(in != null)
		
		return data;
		return data; 
	}
}
