package filereader;

/**
 * Main class for output result for reading file.
 * 
 * @author Varit Assavavisidchai
 *
 */
public class Main {

	public static void main(String[] args) {
		String file = "Alice-in-Wonderland.txt";
		TaskTimer tt = new TaskTimer();

		tt.measureAndPrint(new AppendToString(file));
		tt.measureAndPrint(new AppendToStringBuilder(file));
		tt.measureAndPrint(new AppendToBufferedReader(file));
	}
}