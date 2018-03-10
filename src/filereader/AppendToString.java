package filereader;

/**
 * ReadFile by String
 * 
 * @author Varit Assavavisidchai
 *
 */
public class AppendToString implements Runnable {

	private String filename;
	private String data;

	/**
	 * Create file name
	 * 
	 * @param filename
	 */
	public AppendToString(String filename) {
		this.filename = filename;
	}

	/**
	 * read file
	 */
	@Override
	public void run() {
		data = FileRead.readFileToString(filename);

	}

	/**
	 * Show description
	 */
	public String toString() {
		return String.format("Reading Alice-in-Wonderland.txt using FileReader, append to String.\nRead %d chars",
				data.length());
	}

}
