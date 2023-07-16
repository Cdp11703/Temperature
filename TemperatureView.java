import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureView {

    private JFrame frame;
    private JLabel celciusLabel, fahrenheitLabel;
    private JTextField celciusText, fahrenheitText, infoText;
    private JButton convertBtn;

    public TemperatureView() {
        this.frame = new JFrame("Converter");

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(new GridLayout(4,2));
        this.frame.setResizable(false);
        this.frame.setSize(400, 250);

        this.celciusLabel    = new JLabel(" Celcius:  ", JLabel.RIGHT);
        this.fahrenheitLabel = new JLabel(" Fahrenheit:  ", JLabel.RIGHT);

        this.celciusText = new JTextField();
        this.celciusText.setColumns(10);
        this.fahrenheitText = new JTextField();
        this.fahrenheitText.setColumns(10);

        this.convertBtn = new JButton("Convert");
        this.convertBtn.setPreferredSize(new Dimension(220, 30));

        this.infoText = new JTextField();
        this.infoText.setEditable(false);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1,2));
        panel1.add(this.celciusLabel);
        panel1.add(this.celciusText);
        panel1.setPreferredSize(new Dimension(220, 30));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,2));
        panel2.add(this.fahrenheitLabel);
        panel2.add(this.fahrenheitText);
        panel1.setPreferredSize(new Dimension(220, 30));

        this.frame.add(panel1);
        this.frame.add(panel2);
        this.frame.add(this.convertBtn);
        this.frame.add(this.infoText);

        this.frame.setVisible(true);
    }

    public void setConvertBtnListener(ActionListener actn) {
        this.convertBtn.addActionListener(actn);
    }

    public String getCelcius() {
        return this.celciusText.getText();
    }

    public String getFahrenheit() {
        return this.fahrenheitText.getText();
    }

    public void setInfo(String text) {
        this.infoText.setText(text);
    }

    public void clearTextFields() {
        this.celciusText.setText("");
        this.fahrenheitText.setText("");
    }
}
