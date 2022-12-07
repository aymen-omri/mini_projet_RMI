package com.istic.tn;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurVoitureTaxiMain {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			ServeurVoitureTaxi vt=new ServeurVoitureTaxi();
			Naming.rebind("VoitureTaxi",vt);
			} catch (Exception e) {
			e.printStackTrace();
			}
	}

}
