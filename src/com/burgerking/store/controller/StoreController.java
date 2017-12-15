package com.burgerking.store.controller;

import java.lang.reflect.Array;
import java.security.Provider.Service;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import com.burgerking.store.pool.Value;
import com.burgerking.store.service.StoreService;
import com.burgerking.store.serviceimple.StoreServiceImpl;

public class StoreController {

	public static void main(String[] args) {
		StoreService service = new StoreServiceImpl();
		
		while (true) {
			switch (JOptionPane.showInputDialog(Value.MENU)) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");

				return;
			case "1":
				String[] dummy = { "햄버거/5500", "콜라/1000", "감자칩/1000", "커피/900" };
				service.redayMenu(dummy);
				break;
			case "2" :
				String a = JOptionPane.showInputDialog("햄버거,콜라,감자칩,커피/갯수");
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
				break;
				}
			}
		}
	}


