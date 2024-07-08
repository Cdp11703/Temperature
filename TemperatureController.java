import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureController {
	// The Controller
	private Temperature tempM;
    private TemperatureView tempV;

	public TemperatureController(Temperature tempM, TemperatureView tempV) {
		this.tempM = tempM;
		this.tempV = tempV;

		this.tempV.setConvertBtnListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String celcius = tempV.getCelcius();
				String fahrenheit = tempV.getFahrenheit();

				try{
					if (!celcius.isEmpty() && fahrenheit.isEmpty()) {
						Double Celcius = Double.parseDouble(celcius);
						Double Fahrenheit = (Celcius * 9/5) + 32.0;

						tempM.setCelcius(Celcius);
						tempM.setFahrenheit(Fahrenheit);

						tempV.setInfo(Celcius + " Celsius to " + Fahrenheit + " Fahrenheit");

					} else if (celcius.isEmpty() && !fahrenheit.isEmpty()) {
						Double Fahrenheit = Double.parseDouble(fahrenheit);
						Double Celcius = (Fahrenheit - 32.0) * 5/9;

						tempM.setCelcius(Celcius);
						tempM.setFahrenheit(Fahrenheit);

						tempV.setInfo(Fahrenheit + " Fahrenheit to " + Celcius + " Celsius");

					} else {
						tempV.setInfo("Please input either temperature");
					}

					tempV.clearTextFields();

				} catch (Exception ex) { // if the user
					tempV.setInfo("Please input either temperature");
					tempV.clearTextFields();
				}
			}
		});
	}

	public static void main(String args[]){
		Temperature TempModel = new Temperature();
		TemperatureView  TempView = new TemperatureView();
		TemperatureController TempController = new TemperatureController(TempModel, TempView);
	}
}
