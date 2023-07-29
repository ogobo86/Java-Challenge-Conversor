package conversor;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class temperatura extends JPanel {
	
	private JSlider sliderValor;
	private JLabel lblValor;
	double valor = 1;
	private JLabel lblRespuesta;
	private JComboBox comboA, comboDe;
	String de = "C°", a = "C°";
	double temp = 0.0;
	
	public temperatura() {
		
		setBackground(new Color(238, 238, 238));
		setBounds(16, 18, 332, 280);
		setLayout(null);
		
		
		lblValor = new JLabel("1");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblValor.setBounds(257, 56, 69, 29);
		add(lblValor);
		
		lblRespuesta = new JLabel("1");
		lblRespuesta.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblRespuesta.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
		lblRespuesta.setBounds(26, 184, 257, 62);
		add(lblRespuesta);
		
		
		sliderValor = new JSlider();
		sliderValor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valor = sliderValor.getValue();
				lblValor.setText(""+valor);
				convertir();
			}
			
		});
		sliderValor.setPaintTicks(true);
		sliderValor.setPaintLabels(true);
		sliderValor.setValue(1);
		sliderValor.setMinimum(1);
		sliderValor.setBounds(42, 56, 217, 29);
		add(sliderValor);
		
		JLabel lblDe = new JLabel("De:");
		lblDe.setBounds(26, 123, 41, 16);
		add(lblDe);
		
		JLabel lblA = new JLabel("A:");
		lblA.setBounds(153, 123, 33, 16);
		add(lblA);
		
		
		
		comboA = new JComboBox();
		comboA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = comboA.getSelectedItem().toString(); 
				convertir();
			}
		});
		comboA.setModel(new DefaultComboBoxModel(new String[] {"C°", "F°", "K°"}));
		comboA.setBounds(190, 119, 69, 27);
		add(comboA);
		
		comboDe = new JComboBox();
		comboDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				de = comboDe.getSelectedItem().toString(); 
				convertir();
				
			}
		});
		comboDe.setModel(new DefaultComboBoxModel(new String[] {"C°", "F°", "K°"}));
		comboDe.setBounds(63, 119, 78, 27);
		add(comboDe);
		
		
		
		JLabel lblTitulo = new JLabel("Valor");
		lblTitulo.setBounds(26, 23, 61, 16);
		add(lblTitulo);
		
		
		
	}

	public void convertir(){
		switch(de){
			
		case "C°":
			
			if (a.equals("F°")) {
				temp = (valor * 9) / 5 + 32;
				
			}else if (a.equals("K°")) {
				temp =  valor + 273.15 ;
				
			}else {
				temp = valor;
			}
				
			break;
			
		case "F°":
			
			if (a.equals("C°")) {
				temp = ( 5 * (valor - 32 )) / 9 ;
				
			}else if (a.equals("K°")) {
				temp = (5 * (valor -335 )) / 9 + 273.15 ;
				
			}else {
				temp = valor;
			}
			
			break;
		case "K°":
			
			if (a.equals("F°")) {
				temp =  (((valor - 273.15) * 9) / 5) + 32;
				
			}else if (a.equals("C°")) {
				temp = valor - 273.15 ;
				
			}else {
				temp = valor;
			}
		
			break;	
		}
		lblRespuesta.setText(valor+ "" +de+" -> "+ redondear(temp) +" "+a);
	}	
	
	public double redondear (double temp) {
		return Math.round(temp*100.0)/100.0;
	}
}
