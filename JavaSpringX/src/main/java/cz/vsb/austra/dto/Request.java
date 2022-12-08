package cz.vsb.austra.dto;

public class Request {
	private String type;
	 private String query;
	 private String language;
	 private String unit;


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 public String getQuery() {
	  return query;
	 }

	 public String getLanguage() {
	  return language;
	 }

	 public String getUnit() {
	  return unit;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setQuery(String query) {
	  this.query = query;
	 }

	 public void setLanguage(String language) {
	  this.language = language;
	 }

	 public void setUnit(String unit) {
	  this.unit = unit;
	 }
}
