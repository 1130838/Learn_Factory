package myapp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A "global" (singleton) class with the application settings.
 *
 * @author Paulo Gandra Sousa
 */
public final class MyAppManagerSettings {

	private final Properties applicationProperties = new Properties();
	private static MyAppManagerSettings theInstance;
	//private final static String PROPERTIES_FILENAME = "./res/eapli/myapp/myapp.properties";
	private final static String PROPERTIES_RESOURCE = "myapp.properties";
	private final static String REPOSITORY_FACTORY_KEY = "myapp.persistence.repositoryFactory";

	public static MyAppManagerSettings instance() {
		if (theInstance == null) {
			theInstance = new MyAppManagerSettings();
		}
		return theInstance;
	}

	private MyAppManagerSettings() {
		loadProperties();
	}

	public Properties getApplicationProperties() {
		return applicationProperties;
	}

	private void loadProperties() {
		InputStream propertiesStream = null;
		try {
			System.out.println(MyAppManagerSettings.class.
				getProtectionDomain().getCodeSource().getLocation().getPath());
			//propertiesStream = new FileInputStream(PROPERTIES_FILENAME);
			propertiesStream = MyAppManagerSettings.class.getClassLoader().getResourceAsStream(PROPERTIES_RESOURCE);
			if (propertiesStream != null) {
				applicationProperties.load(propertiesStream);
			} else {
				throw new FileNotFoundException("property file '"
					+ PROPERTIES_RESOURCE + "' not found in the classpath");
			}
		} catch (IOException exio) {
			setDefaultProperties();

			Logger.getLogger(MyAppManagerSettings.class.getName()).log(
				Level.SEVERE, null, exio);
		} finally {
			if (propertiesStream != null) {
				try {
					propertiesStream.close();
				} catch (IOException ex) {
					Logger.getLogger(MyAppManagerSettings.class.getName())
						.log(Level.SEVERE, null, ex);
				}
			}
		}
	}

	private void setDefaultProperties() {
		applicationProperties.setProperty(REPOSITORY_FACTORY_KEY,
										  "myapp.persistence.jpa.JpaRepositoryFactory");
	}

	public String getRepositoryFactory() {
        String res = applicationProperties.getProperty(REPOSITORY_FACTORY_KEY);
		return res;
	}
}
