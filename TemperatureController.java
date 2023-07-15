import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureController {
	
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
		
				try {
					if (celcius != null && fahrenheit == null) {
						double Celsius = Double.parseDouble(celcius);
						double Fahrenheit = (Celsius * (9 / 5)) + 32.0;
		
						tempV.setInfo(Celsius + " Celsius " + " to " + Fahrenheit + " Fahrenheit");
					} else if (celcius == null && fahrenheit != null) {
						double Fahrenheit = Double.parseDouble(fahrenheit);
						double Celsius = (Fahrenheit - 32.0) * (5 / 9);
		
						tempV.setInfo(Fahrenheit + " Fahrenheit " + " to " + Celsius + " Celcius");
					} else {
						tempV.setInfo("Please input either temperature");
					}
				} catch (NumberFormatException x) {
					tempV.setInfo("Please input either temperature");
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
