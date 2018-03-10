package filereader;

/**
 * ReadFile by BufferedReader
 * 
 * @author Varit Assavavisidchai
 *
 */
public class AppendToBufferedReader implements Runnable {

	private String filename;
	private String data;

	/**
	 * Create file name.
	 * 
	 * @param filename
	 */
	public AppendToBufferedReader(String filename) {
		this.filename = filename;
	}

	/**
	 * read file.
	 */
	@Override
	public void run() {
		data = FileRead.readFileToBufferedReader(filename);
	}

	/**
	 * Show Description
	 */
	public String toString() {
		return String.format(
				"Reading Alice-in-Wonderland.txt using BufferedReader, append Line to String.\nRead %d chars",
				data.length());
	}
}