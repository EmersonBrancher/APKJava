package com.apk.clima;

public class WeatherDoDia {

	private String weather;
	private String main;
	private String description;
	private String icon;
	private String mainObject;
	private String temp;
	private String tempMin;
	private String tempMax;

	public WeatherDoDia() {
		super();
	}

	public String getMainObject() {
		return mainObject;
	}

	public void setMainObject(String mainObject) {
		this.mainObject = mainObject;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTempMin() {
		return tempMin;
	}

	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}

	public String getTempMax() {
		return tempMax;
	}

	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
