package cz.vsb.austra.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.vsb.austra.City;
import cz.vsb.austra.dto.WeatherDto;
import cz.vsb.austra.service.WeatherService;

@RestController
public class WeatherController {
	private WeatherService weatherService;
	
	public WeatherController() {
		super();
		this.weatherService= new WeatherService();
	}

	// /weather
	//vraci text "pocasi pro vsechna mesta"
	@RequestMapping("/weather")
	public Collection<WeatherDto> getWeather() {
		//weatherService = new WeatherService();   //zde už nemusíme vytvářet protože je vytvořená datová složka
		List<WeatherDto> weatherList = new ArrayList<WeatherDto>();
//		WeatherDto weatherDto = new WeatherDto();
//		weatherDto.setLocation("abc");
//		weatherList.add(weatherDto);
//		return weatherList;
		for(City city: City.values()) {
			WeatherDto wDto=weatherService.getWeatherForCity(city);
			weatherList.add(wDto);
		}
		return weatherList;
	}
	
	//volání pro jedno město:
	//přímé volání:
//	@RequestMapping("weather/{city}")
//	public WeatherDto getWeatherForCity(@PathVariable String city){   
//		WeatherDto wDto = new WeatherDto();
//		City cityEnum = City.valueOf(city.toUpperCase());
//		WeatherstackConnector connector = new WeatherstackConnector();
//		wDto.setLocation(connector.getWeatherForCity(cityEnum));
//		//return connector.getWeatherForCity(cityEnum);
//		return wDto;
//	}

//nahradíme přímé volání -  nyní se bude volat pomocí třídy WeatherService:
	@CrossOrigin     
	@RequestMapping("weather/{city}")
	public WeatherDto getWeatherForCity(@PathVariable String city){	
		City cityEnum = City.valueOf(city.toUpperCase()); 
		//WeatherService weatherService = new WeatherService();     //zde už nemusíme vytvářet protože je vytvořená datová složka
		return weatherService.getWeatherForCity(cityEnum);
	}
}