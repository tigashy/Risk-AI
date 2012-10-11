/**
 * 
 */
package risk.game;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.log4j.Logger;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;

/**
 * @author bene
 * 
 */
public class Main {

	private static final Logger logger = Logger.getLogger(Main.class);
	private static final String CONFIG_FILE = "gamedata.xml";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		loadCountries();

	}

	private static int loadCountries() {
		try {
			XStream xs = new XStream();
			xs.alias("country", Country.class);
			ObjectInputStream in = xs.createObjectInputStream(new FileReader(
					CONFIG_FILE));
			while (true) {
				Country c = (Country) in.readObject();
			}
		} catch (FileNotFoundException err) {
			logger.info("The gamedta.xml file could not be found.");
			return 0;
		} catch (ClassNotFoundException err) {
			logger.error("There are errors in the gamedata.xml file.");
			return -1;
		} catch (CannotResolveClassException err) {
			logger.error("There are errors in the gamedata.xml file.");
			return -1;
		} catch (IOException err) {
			if (err.getClass().equals(EOFException.class)) {
				return 1;
			} else {
				logger.error("There are errors in the gamedata.xml file.");
				return -1;
			}
		}
	}

}
