package com.projetoea.escolasfutebol.classesjava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class CreateEscolasFutebolBetterDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(EscolasFutebolBetterPersistentManager.instance());
			EscolasFutebolBetterPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
