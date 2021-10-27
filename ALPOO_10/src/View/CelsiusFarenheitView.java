package View;

import java.util.Observable;

import Model.TemperaturaModel;

public class CelsiusFarenheitView implements java.util.Observer {

	private TemperaturaModel model;
	//construtor 
	public CelsiusFarenheitView(TemperaturaModel model) {
		this.model = model;
		model.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {

		System.out.println("Celsius: " + model.getTemperaturaC());
		System.out.println("Farenheit: " + model.getTemperaturaF());
	}

}
