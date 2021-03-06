package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class DropEscolasFutebolBetterDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(EscolasFutebolBetterPersistentManager.instance());
				EscolasFutebolBetterPersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
