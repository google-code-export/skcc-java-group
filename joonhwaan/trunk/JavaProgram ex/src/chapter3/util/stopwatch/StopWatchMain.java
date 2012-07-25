package chapter3.util.stopwatch;

public class StopWatchMain {

	
	public static void main(String[] args) {
		
		
	
		
	
		
	
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		stopWatch.stop();
		Time time = stopWatch.getElapsedTime();
		
		System.out.println("스톱워치 나노타임:"+time.getNanoTime());
		
		System.out.println("스톱워치  초 타임:"+time.getSecondTime());
		
		
	}
}
