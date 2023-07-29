package conversor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla extends JFrame implements ActionListener {

	private JPanel contentPane, titulo, area, menu, pie;
	private JButton btnTemperatura = new JButton("Temperatura"),
					btnMoneda = new JButton("Moneda"),
					btnMedida = new JButton("Longitud"),
					btnSalir = new JButton("Salir");
	private divisas divisas = new divisas();
	private distancia distancia = new distancia();
	private temperatura temperatura = new temperatura();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pantalla() {
		setTitle("Conversor Challenge ONE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		titulo = new JPanel();
		FlowLayout flowLayout = (FlowLayout) titulo.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		titulo.setBackground(new Color(238, 238, 238));
		contentPane.add(titulo, BorderLayout.NORTH);
		
		JLabel lbltitulo = new JLabel("Bienvenido al Conversor");
		lbltitulo.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		titulo.add(lbltitulo);
		
		
		area = new JPanel();
		area.setBackground(new Color(238, 238, 238));
		contentPane.add(area, BorderLayout.CENTER);
		area.setLayout(new CardLayout(0, 0));
		
		
		divisas.setVisible(false);
		distancia.setVisible(false);
		temperatura.setVisible(false);

		
		
		menu = new JPanel();
		menu.setBackground(new Color(238, 238, 238));
		contentPane.add(menu, BorderLayout.WEST);
		
		
		
		JLabel lblNewLabel = new JLabel("Selecciona");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		
	
		btnSalir.addActionListener(this);
		btnSalir.setBackground(UIManager.getColor("Button.select"));
		btnSalir.setForeground(UIManager.getColor("Button.select"));
		
		
		JLabel lblNewLabel_1 = new JLabel("una opcion.");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		GroupLayout gl_menu = new GroupLayout(menu);
		gl_menu.setHorizontalGroup(
			gl_menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menu.createSequentialGroup()
					.addGroup(gl_menu.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_menu.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnMoneda, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
						.addGroup(gl_menu.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnMedida, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
						.addGroup(gl_menu.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnTemperatura))
						.addGroup(gl_menu.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_menu.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel)))
						.addGroup(gl_menu.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSalir, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
					.addContainerGap())
		);
		btnMoneda.addActionListener(this);
		btnTemperatura.addActionListener(this);
		btnMedida.addActionListener(this);
		
		gl_menu.setVerticalGroup(
			gl_menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menu.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(32)
					.addComponent(btnMoneda, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnTemperatura, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnMedida, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addComponent(btnSalir)
					.addContainerGap())
		);
		menu.setLayout(gl_menu);
		
		pie = new JPanel();
		FlowLayout fl_pie = (FlowLayout) pie.getLayout();
		fl_pie.setHgap(10);
		pie.setBackground(new Color(238, 238, 238));
		contentPane.add(pie, BorderLayout.SOUTH);
		
		JLabel lblPie = new JLabel("Desarrollado por Oscar Gonzalez Bonilla, julio 2023.");
		lblPie.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		pie.add(lblPie);
	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnMoneda) {
			divisas.setVisible(true);
			divisas.setSize(363,319);
			divisas.setLocation(0,0);
			area.removeAll();
			area.add(divisas, BorderLayout.CENTER);
			area.revalidate();
			area.repaint();
			distancia.setVisible(false);
			temperatura.setVisible(false);	
		}
		if (e.getSource() == btnTemperatura) {
			divisas.setVisible(false);
			distancia.setVisible(false);
			temperatura.setSize(363,319);
			temperatura.setLocation(0,0);
			area.removeAll();
			area.add(temperatura, BorderLayout.CENTER);
			area.revalidate();
			area.repaint();
			temperatura.setVisible(true);
		}
		if (e.getSource() == btnMedida) {
			divisas.setVisible(false);
			distancia.setVisible(true);
			distancia.setSize(363,319);
			distancia.setLocation(0,0);
			area.removeAll();
			area.add(distancia, BorderLayout.CENTER);
			area.revalidate();
			area.repaint();
			temperatura.setVisible(false);
		}if (e.getSource() == btnSalir){
			System.exit(0);
		}
		
	}
}
