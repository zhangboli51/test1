package com.mercury.services;

import com.mercury.daos.RoomDao;
import com.mercury.daos.UserDao;

public class TrainingService {
	private UserDao ud;
	private RoomDao rd;
	
	

	public TrainingService(int x) {
		System.out.println("creating training service ");
	}
	
	public TrainingService(int x, int y) {
		System.out.println("creating training service " + (x*y));
	}
	

	
}
