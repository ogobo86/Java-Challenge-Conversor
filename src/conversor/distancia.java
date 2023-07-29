package conversor;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;

public class distancia extends JPanel implements ActionListener {
	
	
	private JComboBox comboDe, comboA;
	private JTextField textConvertir;
	private JLabel lblTotal;
	double conversion = 0;
	double valor = 0;
	String lblCantidad = " ";
	private JButton btnConversor = new JButton("Convertir");
	

	public distancia() {
		
		setBackground(new Color(238, 238, 238));
		setBounds(16, 18, 332, 280);
		setLayout(null);
	
		
		lblTotal = new JLabel(" ");
		lblTotal.setBounds(113, 234, 82, 16);
		add(lblTotal);

		
		textConvertir = new JTextField();
		textConvertir.setBounds(173, 111, 130, 26);
		add(textConvertir);
		textConvertir.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad a Convertir");
		lblCantidad.setBounds(16, 116, 129, 16);
		add(lblCantidad);
		
		JLabel lblResultado = new JLabel("El total es:");
		lblResultado.setBounds(37, 234, 82, 16);
		add(lblResultado);
		
		
		btnConversor.setBounds(101, 167, 110, 29);
		add(btnConversor);
		btnConversor.addActionListener(this);
		
		comboDe = new JComboBox();
		comboDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboDe.setModel(new DefaultComboBoxModel(new String[] {"Kilometro", "Metro", "Milla",  "Pulgada", "Pie", "Yarda"}));
		comboDe.setBounds(37, 33, 217, 27);
		add(comboDe);
		
		comboA = new JComboBox();
		comboA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboA.setModel(new DefaultComboBoxModel(new String[] {"Kilometro", "Metro", "Milla",  "Pulgada", "Pie", "Yarda"}));
		comboA.setBounds(37, 65, 217, 27);
		add(comboA);
		
		JLabel lblNewLabel = new JLabel("De : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 37, 45, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A : ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(16, 69, 31, 16);
		add(lblNewLabel_1);
		
		
		
	
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConversor ) {
			valor = Double.parseDouble(textConvertir.getText());
			if (comboDe.getSelectedItem().equals("Kilometro")) {
				if (comboA.getSelectedItem().equals("Metro")) conversion = valor * 1000;
				else if  (comboA.getSelectedItem().equals("Milla")) conversion = valor * 0.62;
				else if (comboA.getSelectedItem().equals("Pulgada")) conversion = valor * 39370.08;
				else if (comboA.getSelectedItem().equals("Pie")) conversion = valor * 3280.84;
				else if (comboA.getSelectedItem().equals("Yarda")) conversion = valor * 1093.61;
				else if (comboA.getSelectedItem().equals("Kilometro")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Metro")) {
				if (comboA.getSelectedItem().equals("Kilometro")) conversion = valor * 0.001;
				else if  (comboA.getSelectedItem().equals("Milla")) conversion = valor * 0.000621371;
				else if (comboA.getSelectedItem().equals("Pulgada")) conversion = valor * 39.3701;
				else if (comboA.getSelectedItem().equals("Pie")) conversion = valor * 3.28084;
				else if (comboA.getSelectedItem().equals("Yarda")) conversion = valor * 1.09361;
				else if (comboA.getSelectedItem().equals("Metro")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Milla")) {
				if (comboA.getSelectedItem().equals("Kilometro")) conversion = valor * 1.60934;
				else if  (comboA.getSelectedItem().equals("Metro")) conversion = valor * 1609.34;
				else if (comboA.getSelectedItem().equals("Pulgada")) conversion = valor * 63360;
				else if (comboA.getSelectedItem().equals("Pie")) conversion = valor * 5280;
				else if (comboA.getSelectedItem().equals("Yarda")) conversion = valor * 1760;
				else if (comboA.getSelectedItem().equals("Milla")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Pulgada")) {
				if (comboA.getSelectedItem().equals("Kilometro")) conversion = valor * 0.0000254;
				else if  (comboA.getSelectedItem().equals("Metro")) conversion = valor * 0.0254;
				else if (comboA.getSelectedItem().equals("Milla")) conversion = valor * 0.0000157828;
				else if (comboA.getSelectedItem().equals("Pie")) conversion = valor * 0.0833333;
				else if (comboA.getSelectedItem().equals("Yarda")) conversion = valor * 0.0277778;
				else if (comboA.getSelectedItem().equals("Pulgada")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Pie")) {
				if (comboA.getSelectedItem().equals("Kilometro")) conversion = valor * 0.0003048;
				else if  (comboA.getSelectedItem().equals("Metro")) conversion = valor * 0.3048;
				else if (comboA.getSelectedItem().equals("Milla")) conversion = valor * 0.000189394;
				else if (comboA.getSelectedItem().equals("Pulgada")) conversion = valor * 12;
				else if (comboA.getSelectedItem().equals("Yarda")) conversion = valor * 0.333333;
				else if (comboA.getSelectedItem().equals("Pie")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Yarda")) {
				if (comboA.getSelectedItem().equals("Kilometro")) conversion = valor * 0.0009144;
				else if  (comboA.getSelectedItem().equals("Metro")) conversion = valor *0.9144;
				else if (comboA.getSelectedItem().equals("Milla")) conversion = valor * 0.000568182;
				else if (comboA.getSelectedItem().equals("Pulgada")) conversion = valor * 36;
				else if (comboA.getSelectedItem().equals("Pie")) conversion = valor * 3;
				else if (comboA.getSelectedItem().equals("Yarda")) conversion = valor;
			}
			lblTotal.setText(""+conversion);
		}
	}
}
