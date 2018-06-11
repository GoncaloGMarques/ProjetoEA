package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class CreateEscolasFutebolDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(EscolasFutebolPersistentManager.instance());
			EscolasFutebolPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
