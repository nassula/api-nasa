package imersao.alura.api.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import imersao.alura.api.model.Picture;

public class NasaExtractor {
	
	//public List<Picture> extractInfo(String json) {
	public String extractInfo(String json) {

        //var parser = new JsonParser();
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listPictures = parser.parse(json);

        List<Picture> pictures = new ArrayList<>();
        

        //fill the list of pictures
        for (Map<String, String> infos : listPictures) {
            
        	/*
        	 * Table fields
        	id
        	autor
        	description
        	hdUrl
        	title
        	*/
        	
        	String jsonPost = "{\"autor\":\""+infos.get("copyright")+"\",\"description\":\""+infos.get("explanation")+"\",\"hdUrl\":\""+infos.get("hdurl")+"\",\"title\":\""+infos.get("title").replace(":", "-")+"\"}";
        	
        	ClientHttp http = new ClientHttp();
    		
        	http.saveData(jsonPost);
        	
        }
        return "1";
    }

}
