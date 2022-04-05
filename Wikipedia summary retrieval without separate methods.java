import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Jp{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Keyword To Wikipedia Search: ");
		String search = scan.nextLine();  // Scanning keyword
		search = search.replaceAll(" ", "%20");  // %20 is equivalent to space in url
		GetData get = new GetData("https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exlimit=max&explaintext&exintro&titles=" + search + "&redirects=");
		get.start();
		System.out.println("Loading...");

		/*
			How to use above wikipedia query in different ways:

			You can get wiki data in Text formats. If you need to access many title's informations, you can get all title's wiki data in a single call. Use pipe character ( | ) to separate each titles.

			Original url => http://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exlimit=max&explaintext&exintro&titles=Yahoo|Google&redirects=

			Here this api call return both Googles and Yahoos data.

			explaintext => Return extracts as plain text instead of limited HTML.

			exlimit = max (now its 20); Otherwise only one result will return.

			exintro => Return only content before the first section. If you want full data, just remove this.

			redirects= Resolve redirect issues.

		 */

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


			String raw_data = str.toString();
//			System.out.println(raw_data);
			String title, data;
			int start, end;

			// Title
			start = raw_data.indexOf("\"title\":") + 9;
			end = raw_data.indexOf("\",", start+1);
			title = raw_data.substring(start, end).replace("\\\"", "\"");

			System.out.println(title);

			// Data
			start = raw_data.indexOf("\"extract\":") + 11;
			end = raw_data.indexOf("\"}", start+1);
			data = raw_data.substring(start, end).replace("\\n", "\n").replace("\\\"", "\"");

			// If missing key occurs then data not found
			if(!raw_data.contains("missing"))
				System.out.println(data);
			else
				System.out.println("Wikipedia data not found try to type keyword correctly");

		}catch(Exception e){
			System.out.println("Check Your Internet Connection");
			e.printStackTrace();
		}

	}

}
