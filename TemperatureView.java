import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureView {

    private JFrame frame;
	private JLabel celciusLabel, fahrenheitLabel;
	private JTextField celciusText, fahrenheitText, infoText;
	private JButton convertBtn;

    public TemperatureView(){
        this.frame = new JFrame("Converter");

		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.frame.setSize(250, 400);

        this.frame.setVisible(true);
    }

    public void setConvertBtnListener(ActionListener actn) {
        this.convertBtn.addActionListener(actn);
    }

    public String getCelcius(){
        return this.celciusText.getText();
    }

    public String getFahrenheit(){
        return this.fahrenheitText.getText();
    }

    public void setInfo(String text){
        this.infoText.setText(text);
    }

    public void clearTextFields() {
		this.celciusText.setText("");
		this.fahrenheitText.setText("");
	}




}