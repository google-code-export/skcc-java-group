package Coaching.hw2.util;

public class ProceduralStopWatch {
	public long startTime; // �и���(1/1000��) ����
	public long stopTime; // 1/1000�� ����

	public long getElapsedTime() {
		return stopTime - startTime;
	}
}
