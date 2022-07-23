package imersao.alura.api.resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.net.*;

public class ClientHttp {
	
	public String searchData(String url) {

        try {
        	System.out.println(url);
            URL address = new URL(url);
            HttpURLConnection conection = (HttpURLConnection) address.openConnection();
            conection.setRequestMethod("GET");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
            String result = in.readLine();
            in.close();
            conection.disconnect();
            
            return result;

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
	
	public void saveData(String json) {

		try {

			URL url = new URL("http://localhost:8080/api-nasa/pictures");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			System.out.println(json);
			OutputStream os = conn.getOutputStream();
			os.write(json.getBytes());
			os.flush();

			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
