package cz.vsb.austra.connector;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cz.vsb.austra.City;
import cz.vsb.austra.dto.WeatherstackDto;

public class WeatherstackConnector {
	//http://api.weatherstack.com/current?access_key=889c1e31949c940b6c51d95be14ff636&query=prague

	private static String baseUrl = "http://api.weatherstack.com/";
	private static String urlParams = "current?access_key=";
	private static String apiKey = "889c1e31949c940b6c51d95be14ff636";

	private static String url = baseUrl + urlParams + apiKey + "&query=";

	public WeatherstackDto getWeatherForCity(City cityEnum) {	
		RestTemplate template = new RestTemplate();
		URI uri = null;
		try {
			uri = new URI(url + cityEnum);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		//zde se předělává ze souboru .json string data na wSDto data
		//System.out.println(url);  
		ResponseEntity<WeatherstackDto> response=template.getForEntity(uri, WeatherstackDto.class);
		return response.getBody();
	}
}
