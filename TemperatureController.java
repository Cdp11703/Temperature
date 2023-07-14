import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TemperatureController {
	
	private Temperature tempM;
    private TemperatureView tempV;

	public TemperatureController(Temperature tempM, TemperatureView tempV) {
		this.tempM = tempM;
		this.tempV = tempV;

		this.tempV.setConvertBtnListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});


	}

	public void main(){
		
	}
		
		
		
}