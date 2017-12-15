package com.burgerking.store.serviceimple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.burgerking.store.service.StoreService;

public class StoreServiceImpl implements StoreService{
	private Map<String,String> menuMap;
	private Map<String,String> orderMap;
	
	public StoreServiceImpl () {
		menuMap = new HashMap<>();
		orderMap = new HashMap<>();

	}

	@Override
	public void redayMenu(String[] dummy) {
		for(String s : dummy) {
			System.out.println("t : "+s);
			String[] impo = s.split("/");
			menuMap.put(dummy[0], impo[1]);
		}
		System.out.println("t" + menuMap);
		System.out.println(menuMap.get("햄버거"));	
	}

	//@Override
	public void takeOrder(String[] compl) {
		
		
	}

	@Override
	public void takeOrder(String a) {
		
	}
		
	}

