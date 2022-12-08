package cz.vsb.austra.service;

import cz.vsb.austra.City;
import cz.vsb.austra.connector.WeatherstackConnector;
import cz.vsb.austra.dto.WeatherDto;
import cz.vsb.austra.dto.WeatherstackDto;


/*{
" lokalita " :  " Ostrava " ,
" timestamp ":  " 2022-04-13 11:54 " ,
" temp_celsius ":  15 ,
" relativní_vlhkost ":  41 ,
" rychlost větru_m_per_s ":  0 ,
" wind_direction ":  " WNW " ,
" popis počasí ":  [
" slunečno "
]
}
*/
public class WeatherService {
	

//nyní se bude volat zde:
	//@Service
	
	//WeatherstackDto je output
	//WeatherDto je input
	
	public WeatherDto getWeatherForCity(City cityEnum){   
		WeatherstackConnector connector = new WeatherstackConnector();
		WeatherstackDto weatherStackDto = connector.getWeatherForCity(cityEnum);	
		return transformDto(weatherStackDto);
}
	private WeatherDto transformDto(WeatherstackDto weatherStackDto){
		WeatherDto wDto = new WeatherDto();
		wDto.setLocation(weatherStackDto.getLocation().getName());
		wDto.setRelative_humidity(weatherStackDto.getCurrent().getHumidity());
		wDto.setTemp_celsius(weatherStackDto.getCurrent().getTemperature());
		wDto.setTimestamp(weatherStackDto.getLocation().getLocaltime());   //metoda je předělaná, aby se vypsal aktuální čas
		wDto.setWeather_description(weatherStackDto.getCurrent().getWeather_descriptions().get(0).toString());//první prvek z pole a převeden z objektu do stringu
		wDto.setWind_direction(weatherStackDto.getCurrent().getWind_dir());
		wDto.setWind_speed_m_per_s(weatherStackDto.getCurrent().getWind_speed());
		
		return wDto;   
}
}