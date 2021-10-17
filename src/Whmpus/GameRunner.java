package Whmpus;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			World whmpusWorld = new World().generateRandomWorld();

			Agent agent = new Agent(whmpusWorld);
		
			agent.moveAgent();
			
	
			Desktop d = Desktop.getDesktop();
			try {
				//File gameUI = new File("D:\\xampp\\htdocs\\Wumpus.html");
				URI u = new URI("http://127.0.0.1/ww/Wumpus.html");
				d.browse(u);
				
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
