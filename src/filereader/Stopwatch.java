package filereader;

/**
 * A stopwatch tell elapsed time between start time and stop time.
 * 
 * @author Varit Assavavisidchai 
 * 
 */

public class Stopwatch {
	private double elapsed;
	private boolean running = false;
	private static final double NANOSECONDS = 1.0E-9;
	private long start;
	private long stop;

	/**
	 * Return the elapsed in second with decimal.
	 * 
	 * @return the values of elapsed.
	 */
	public double getElapsed() {

		if (!running) {
			elapsed = NANOSECONDS * (stop - start);
		} else {
			elapsed = NANOSECONDS * (System.nanoTime() - start);
		}
		return elapsed;

	}

	/**
	 * check boolean in start method and stop method.
	 * 
	 * @return true or false in start method and stop method.
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Count time if stopwatch is start or running.
	 */
	public void start() {
		if (!isRunning()) {
			start = System.nanoTime();
			running = true;
		}

	}

	/**
	 * Finished count time if stopwatch is stopped.
	 */
	public void stop() {
		if (isRunning()) {
			stop = System.nanoTime();
			running = false;
		}
	}
}