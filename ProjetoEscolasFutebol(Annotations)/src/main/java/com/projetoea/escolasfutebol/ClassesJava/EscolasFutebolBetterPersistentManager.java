/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
package com.projetoea.escolasfutebol.classesjava;

import org.orm.*;
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;
import org.hibernate.cfg.*;

public class EscolasFutebolBetterPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "EscolasFutebolBetter";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private EscolasFutebolBetterPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.AUTO);
	}
	
	@Override
	public Configuration createConfiguration() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Campo.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Escolas.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Equipa.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Jogador.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Campeonato.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Jogo.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Arbitro.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Utilizador.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Eventojogo.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.EventojogoPK.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Associacao.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Torneio.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Fase.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Rondatorneio.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Rondacampeonato.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Partcipantetorneio.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Grupo.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Participantecampeonato.class);
		configuration.addAnnotatedClass(com.projetoea.escolasfutebol.classesjava.Tipoutilizador.class);
		configuration.buildMappings();
		return configuration;
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new EscolasFutebolBetterPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
