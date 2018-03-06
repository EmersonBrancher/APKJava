package com.apk.clima;

public class WeatherForecast {

	private String list;

	private String main;
	private String temp;
	private String tempMin;
	private String tempMax;

	private String weather;
	private String icon;

	private String dttxt;

	public WeatherForecast() {
		super();
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
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

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDttxt() {
		return dttxt;
	}

	public void setDttxt(String dttxt) {
		this.dttxt = dttxt;
	}

}
