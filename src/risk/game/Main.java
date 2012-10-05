/**
 * 
 */
package risk.game;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;

/**
 * @author bene
 *
 */
public class Main {
	
	private static final String CONFIG_FILE = "gamedata.xml";

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		try {
			XStream xs = new XStream();
			ObjectInputStream in = xs.createObjectInputStream(new FileReader(CONFIG_FILE));
			while (true) {
				Country c = (Country) in.readObject();
			}
		} catch (FileNotFoundException err) {
			logger.info("The suggestion file could not be found. A file with sample suggestions will be created.");
			return 0;
		} catch (ClassNotFoundException err) {
			logger.error("There are errors in your suggestions.xml file. The program created a backup copy and replaced the file with a valid one.");
			return -1;
		} catch (CannotResolveClassException err) {
			logger.error("There are errors in your suggestions.xml file. The program created a backup copy and replaced the file with a valid one.");
			return -1;
		} catch (IOException err) {
			if (err.getClass().equals(EOFException.class)) {
				return 1;
			} else {
				logger.error("There are errors in your suggestions.xml file. The program created a backup copy and replaced the file with a valid one.");
			}
		}

	}*/

}
