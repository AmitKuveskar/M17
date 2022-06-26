package com.tns.corejava;
import java.util.concurrent.locks.ReentrantLock;

public class Concurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLock l =new ReentrantLock();
		l.lock();
		System.out.print(l.isLocked());
		System.out.print(l.isHeldByCurrentThread());
		System.out.print(l.getQueueLength());
		l.unlock();
		System.out.print(l.getHoldCount());
		System.out.print(l.isLocked());
		
	}

}
