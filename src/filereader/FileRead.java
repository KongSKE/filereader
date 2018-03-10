package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * FileRead class contain method that have different way to read file.
 * 
 * @author Varit Assavavisidchai
 *
 */
public class FileRead {

	private static FileInputStream in;
	private static FileReader fr;
	private static BufferedReader br;

	/**
	 * Opens and reads a file one character at a time. Append the characters to
	 * a String and return the String.
	 * 
	 * @param filename
	 * @return data
	 */
	public static String readFileToString(String filename) {
		String data = "";
		// open file
		try {
			in = new FileInputStream(filename);

			// read as characters
			InputStreamReader reader = new InputStreamReader(in);
			int c;

			while (true) { // while((c = reader.read()) >= 0)
				c = reader.read();
				if (c < 0)
					break;
				data = data + (char) c;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return data + " ";
	}

	/**
	 * Read the file one character at a time and append to a StringBuilder
	 * object.
	 * 
	 * @param filename
	 * @return a description of that object from toString() in AppenToStringBuilder
	 */
	public static String readFileToStringBuilder(String filename) {
		StringBuilder sb = null;
		try {
			in = new FileInputStream(filename);
			sb = new StringBuilder();
			InputStreamReader reader = new InputStreamReader(in);

			int c;
			while (true) { // while((c = reader.read()) >= 0)
				c = reader.read();
				if (c < 0)
					break;
				sb = sb.append((char) c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return sb.toString() + '\n';
	}

	/**
	 * Read the file as text one line at a time using a BufferedReader, and
	 * append the result to a String.
	 * 
	 * @param filename
	 * @return data 
	 */
	public static String readFileToBufferedReader(String filename) {
		String data = "";
		try {
			String line = "";
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				data = data + line + '\n';
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return data;
	}
}