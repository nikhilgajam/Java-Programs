import java.net.*;
import java.io.*;

public class Jp{

	public static void main(String[] args){

		GetData get = new GetData("https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exlimit=max&explaintext&exintro&titles=Google&redirects=");
		// instead of the above url we can place any other url like https://google.com
		get.start();
		System.out.println("Loading...");

	}

}

class GetData extends Thread{
	// This class gets the data from internet it takes some time that's why we are using thread

	String link;

	public GetData(String link){
		// link variable holds the link to request
		this.link = link;
	}

	public void run(){

		try{

			// Used in loop to make a string
			StringBuilder str = new StringBuilder();

			// Establishing a connection
			URL url = new URL(link);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			// Creating an object to the data
			InputStream stream = connection.getInputStream();

			int ch;
			// Reading the data from the connection through inputstream object
			while((ch = stream.read()) != -1){
				str.append((char)ch);
			}


			// Outputs data to the screen
			System.out.println(str.toString());

		}catch(Exception e){
			System.out.println("Check Your Internet Connection");
		}

	}

}
