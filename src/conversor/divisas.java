package conversor;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class divisas extends JPanel implements ActionListener {
	
	private JComboBox comboDe, comboA;
	private JTextField textConvertir;
	private JLabel lblTotal;
	double conversion = 0;
	double valor = 0;
	String lblCantidad = " ";
	private JButton btnConversor = new JButton("Convertir");
	

	public divisas() {
		
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
		comboDe.setModel(new DefaultComboBoxModel(new String[] {"Pesos Mexicanos", "Dolares Estadounidenses", "Euro",  "Libra Esterlina", "Yen Japones", "Won Surcoreano"}));
		comboDe.setBounds(37, 33, 217, 27);
		add(comboDe);
		
		comboA = new JComboBox();
		comboA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboA.setModel(new DefaultComboBoxModel(new String[] {"Pesos Mexicanos", "Dolares Estadounidenses", "Euro", "Libra Esterlina", "Yen Japones", "Won Surcoreano"}));
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
			if (comboDe.getSelectedItem().equals("Pesos Mexicanos")) {
				if (comboA.getSelectedItem().equals("Dolares Estadounidenses")) conversion = valor * 0.059;
				else if  (comboA.getSelectedItem().equals("Euro")) conversion = valor * 18.66;
				else if (comboA.getSelectedItem().equals("Libra Esterlina")) conversion = valor * 21.78;
				else if (comboA.getSelectedItem().equals("Yen Japones")) conversion = valor * 8.34;
				else if (comboA.getSelectedItem().equals("Won Surcoreano")) conversion = valor * 75.50;
				else if (comboA.getSelectedItem().equals("Pesos Mexicanos")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Dolares Estadounidenses")) {
				if (comboA.getSelectedItem().equals("Pesos Mexicanos")) conversion = valor * 17;
				else if  (comboA.getSelectedItem().equals("Euro")) conversion = valor * 0.90;
				else if (comboA.getSelectedItem().equals("Libra Esterlina")) conversion = valor * 0.77;
				else if (comboA.getSelectedItem().equals("Yen Japones")) conversion = valor * 141.17;
				else if (comboA.getSelectedItem().equals("Won Surcoreano")) conversion = valor * 1276.84;
				else if (comboA.getSelectedItem().equals("Dolares Estadounidenses")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Euro")) {
				if (comboA.getSelectedItem().equals("Pesos Mexicanos")) conversion = valor * 18.67;
				else if  (comboA.getSelectedItem().equals("Dolares Estadounidenses")) conversion = valor * 1.10;
				else if (comboA.getSelectedItem().equals("Libra Esterlina")) conversion = valor * 0.85;
				else if (comboA.getSelectedItem().equals("Yen Japones")) conversion = valor * 155.77;
				else if (comboA.getSelectedItem().equals("Won Surcoreano")) conversion = valor * 1409.64;
				else if (comboA.getSelectedItem().equals("Euro")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Libra Esterlina")) {
				if (comboA.getSelectedItem().equals("Pesos Mexicanos")) conversion = valor * 21.78;
				else if  (comboA.getSelectedItem().equals("Dolares Estadounidenses")) conversion = valor * 1.28;
				else if (comboA.getSelectedItem().equals("Euro")) conversion = valor * 1.16;
				else if (comboA.getSelectedItem().equals("Yen Japones")) conversion = valor * 181.75;
				else if (comboA.getSelectedItem().equals("Won Surcoreano")) conversion = valor * 1644.54;
				else if (comboA.getSelectedItem().equals("Libra Esterlina")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Yen Japones")) {
				if (comboA.getSelectedItem().equals("Pesos Mexicanos")) conversion = valor * 0.12;
				else if  (comboA.getSelectedItem().equals("Dolares Estadounidenses")) conversion = valor * 0.007;
				else if (comboA.getSelectedItem().equals("Libra Esterlina")) conversion = valor * 0.0054;
				else if (comboA.getSelectedItem().equals("Euro")) conversion = valor * 0.0064;
				else if (comboA.getSelectedItem().equals("Won Surcoreano")) conversion = valor * 9.04;
				else if (comboA.getSelectedItem().equals("Yen Japones")) conversion = valor;
			}
			if (comboDe.getSelectedItem().equals("Won Surcoreano")) {
				if (comboA.getSelectedItem().equals("Pesos Mexicanos")) conversion = valor * 0.01;
				else if  (comboA.getSelectedItem().equals("Dolares Estadounidenses")) conversion = valor * 0.0007;
				else if (comboA.getSelectedItem().equals("Euro")) conversion = valor * 0.0007;
				else if (comboA.getSelectedItem().equals("Yen Japones")) conversion = valor * 0.11;
				else if (comboA.getSelectedItem().equals("Libra Esterlina")) conversion = valor * 0.0006;
				else if (comboA.getSelectedItem().equals("Won Surcoreano")) conversion = valor;
			}
			lblTotal.setText(""+conversion);
		}
}	
}
