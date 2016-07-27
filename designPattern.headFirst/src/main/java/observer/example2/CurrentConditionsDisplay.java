package observer.example2;

import java.util.Observable;
import java.util.Observer;

import observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable;

	private float temperature;

	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void display() {
		System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(Observable observable, Object arg) {

		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;

			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
