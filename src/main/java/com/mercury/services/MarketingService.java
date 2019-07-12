package com.mercury.services;

import com.mercury.daos.RoomDao;
import com.mercury.daos.UserDao;

public class MarketingService {
	
	private UserDao ud;
	private RoomDao rd;
	
	public MarketingService(UserDao ud, RoomDao rd) {
		super();
		this.ud = ud;
		this.rd = rd;
	}

	public UserDao getUd() {
		return ud;
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
	public RoomDao getRd() {
		return rd;
	}

	public void setRd(RoomDao rd) {
		this.rd = rd;
	}

	public MarketingService() {
		super();
		System.out.println("this is marketting services");
	}

}
