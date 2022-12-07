package com.istic.tn;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface InterfaceVoitureTaxi extends Remote {
	public String ajouterVoiture(VoitureTaxi voiture) throws RemoteException;
	public String verifTaxi(VoitureTaxi voiture) throws RemoteException;
	public int plusCher() throws RemoteException;
	public List<String> rechercheMarqueTaxi() throws RemoteException;

}
