package com.istic.tn;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServeurVoitureTaxi extends UnicastRemoteObject implements InterfaceVoitureTaxi{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<VoitureTaxi> serie = new ArrayList<VoitureTaxi>(); ; 

	protected ServeurVoitureTaxi() throws RemoteException {
		super();

	}

	@Override
	public String ajouterVoiture(VoitureTaxi voiture) throws RemoteException {
		serie.add(voiture);
		return "Vous avez ajouté "+serie.size()+" voitures" ; 
	}

	@Override
	public String verifTaxi(VoitureTaxi voiture)  throws RemoteException {
		if(voiture.getPrix()>10000 && voiture.getCouleur().equals("jaune")) {
			return "Valide";
		}
		return "Non valide";
	}

	@Override
	public int plusCher()  throws RemoteException {
		float prix = 0 ; 
		int idc = 0 ;
		for(int i = 0 ; i<serie.size() ; i++) {
			if(serie.get(i).getPrix()>prix) {
				prix = serie.get(i).getPrix();
				idc = serie.get(i).getId();
			}
		}
		return idc ; 
	}

	@Override
	public List<String> rechercheMarqueTaxi()  throws RemoteException {
		List<String> marques = new ArrayList<String>();
		for(int i=0 ; i<serie.size(); i++) {
			if(verifTaxi(serie.get(i))== "Valide") {
				marques.add(serie.get(i).getMarque()); 
			}
		}
		return marques ; 
	}
	

}
