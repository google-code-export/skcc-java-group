package hw2.util;

public class ProceduralStopWatch {
	public long startTime; // 밀리초(1/1000초) 단위
	public long stopTime; // 1/1000초 단위

	public long getElapsedTime() {
		return stopTime - startTime;
	}
}
