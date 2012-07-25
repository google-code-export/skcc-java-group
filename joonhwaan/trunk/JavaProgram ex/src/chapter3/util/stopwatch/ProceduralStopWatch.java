package chapter3.util.stopwatch;

public class ProceduralStopWatch {

	
	public long startTime;
	public long stopTime;
	
	public long startNanoTime;
	public long stopNanoTime;
	
	
	public long getElapsedTime(){
		return stopTime -startTime;
		
	}
	public long getElapsedNanoTime(){
		return stopNanoTime -startNanoTime;
		
	}
}
