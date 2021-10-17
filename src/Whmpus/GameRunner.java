package Whmpus;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			World whmpusWorld = new World();

			Agent agent = new Agent(whmpusWorld);
		
			agent.moveAgent();
			
	
			Desktop d = Desktop.getDesktop();
			try {
				//File gameUI = new File("http://127.0.0.1/ww/Wumpus.html");
				URI u = new URI("http://127.0.0.1/ww/Wumpus.html");
				d.browse(u);
				
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
