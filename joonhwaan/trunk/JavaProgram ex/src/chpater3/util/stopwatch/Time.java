package chpater3.util.stopwatch;

public class Time {
	private long t;
	
	public Time(long t){
		this.t = t;
	}
	public long getMilliTime(){
		return t/1000000L;
		
	}
	public long getNanoTime(){
		return t;
	}
	
	public double getSecondTime(){
		return (double)t/(double)1000000000;
		
	}
	
}
