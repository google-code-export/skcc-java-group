package chapter3.util.stopwatch;

public class StopWatchMain {

	
	public static void main(String[] args) {
		
		
	
		
	
		
	
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		stopWatch.stop();
		Time time = stopWatch.getElapsedTime();
		
		System.out.println("�����ġ ����Ÿ��:"+time.getNanoTime());
		
		System.out.println("�����ġ  �� Ÿ��:"+time.getSecondTime());
		
		
	}
}
