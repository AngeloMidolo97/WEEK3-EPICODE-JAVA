package it.epicode.dao;

import it.epicode.utils.JpaUtil;

public class PrestitoDAO {
	public static void addElement(Object o) {
		try {
			JpaUtil.t.begin();
			JpaUtil.em.persist(o);
			JpaUtil.t.commit();

			System.out.println("Prestito aggiunto correttamente!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Impossibile aggiungere! " + e);
		}
	}
}
