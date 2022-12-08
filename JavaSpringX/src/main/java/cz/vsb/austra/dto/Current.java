package cz.vsb.austra.dto;

import java.util.ArrayList;

public class Current {
	private String observation_time;
	 private float temperature;
	 private float weather_code;
	 ArrayList < Object > weather_icons = new ArrayList < Object > ();
	 public ArrayList<Object> getWeather_icons() {
		return weather_icons;
	}

	public void setWeather_icons(ArrayList<Object> weather_icons) {
		this.weather_icons = weather_icons;
	}

	public ArrayList<Object> getWeather_descriptions() {
		return weather_descriptions;
	}

	public void setWeather_descriptions(ArrayList<Object> weather_descriptions) {
		this.weather_descriptions = weather_descriptions;
	}

	ArrayList < Object > weather_descriptions = new ArrayList < Object > ();
	 private float wind_speed;
	 private float wind_degree;
	 private String wind_dir;
	 private float pressure;
	 private float precip;
	 private float humidity;
	 private float cloudcover;
	 private float feelslike;
	 private float uv_index;
	 private float visibility;
	 private String is_day;


	 // Getter Methods 

	 public String getObservation_time() {
	  return observation_time;
	 }

	 public float getTemperature() {
	  return temperature;
	 }

	 public float getWeather_code() {
	  return weather_code;
	 }

	 public float getWind_speed() {
	  return wind_speed;
	 }

	 public float getWind_degree() {
	  return wind_degree;
	 }

	 public String getWind_dir() {
	  return wind_dir;
	 }

	 public float getPressure() {
	  return pressure;
	 }

	 public float getPrecip() {
	  return precip;
	 }

	 public float getHumidity() {
	  return humidity;
	 }

	 public float getCloudcover() {
	  return cloudcover;
	 }

	 public float getFeelslike() {
	  return feelslike;
	 }

	 public float getUv_index() {
	  return uv_index;
	 }

	 public float getVisibility() {
	  return visibility;
	 }

	 public String getIs_day() {
	  return is_day;
	 }

	 // Setter Methods 

	 public void setObservation_time(String observation_time) {
	  this.observation_time = observation_time;
	 }

	 public void setTemperature(float temperature) {
	  this.temperature = temperature;
	 }

	 public void setWeather_code(float weather_code) {
	  this.weather_code = weather_code;
	 }

	 public void setWind_speed(float wind_speed) {
	  this.wind_speed = wind_speed;
	 }

	 public void setWind_degree(float wind_degree) {
	  this.wind_degree = wind_degree;
	 }

	 public void setWind_dir(String wind_dir) {
	  this.wind_dir = wind_dir;
	 }

	 public void setPressure(float pressure) {
	  this.pressure = pressure;
	 }

	 public void setPrecip(float precip) {
	  this.precip = precip;
	 }

	 public void setHumidity(float humidity) {
	  this.humidity = humidity;
	 }

	 public void setCloudcover(float cloudcover) {
	  this.cloudcover = cloudcover;
	 }

	 public void setFeelslike(float feelslike) {
	  this.feelslike = feelslike;
	 }

	 public void setUv_index(float uv_index) {
	  this.uv_index = uv_index;
	 }

	 public void setVisibility(float visibility) {
	  this.visibility = visibility;
	 }

	 public void setIs_day(String is_day) {
	  this.is_day = is_day;
	 }
	
}
