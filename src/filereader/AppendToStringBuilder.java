package filereader;

/**
 * ReadFile by StringBuilder
 * 
 * @author Varit Assavavisidchai
 *
 */
public class AppendToStringBuilder implements Runnable {

	private String filename;
	private String data;

	/**
	 * Create file name
	 * 
	 * @param filename
	 */
	public AppendToStringBuilder(String filename) {
		this.filename = filename;
	}

	/**
	 * read file
	 */
	@Override
	public void run() {
		data = FileRead.readFileToStringBuilder(filename);

	}

	/**
	 * Show description
	 */
	public String toString() {
		return String.format(
				"Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.\nRead %d chars",
				data.length());
	}
}