package vista;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FrmTablasMultiplicar extends JFrame {

	private JPanel panel;
	private List<JLabel>listaEtiquetas;
	private List<JTextField>listaTextos;
	private List<JButton>listaBotones;
	private JLabel lblTabla1;
	private JLabel lblTabla2;
	private JLabel lblTabla3;
	private JLabel lblTabla4;
	private JLabel lblTabla5;
	private JLabel lblTabla6;
	private JLabel lblTabla7;
	private JLabel lblTabla8;
	private JLabel lblTabla9;
	private JLabel lblTabla10;
	private JTextField textMul1;
	private JTextField textMul2;
	private JTextField textMul3;
	private JTextField textMul4;
	private JTextField textMul5;
	private JTextField textMul6;
	private JTextField textMul7;
	private JTextField textMul8;
	private JTextField textMul9;
	private JTextField textMul10;
	private JButton btnCorregir;
	private int tabla;
	private JButton boton;

	/**
	 * Create the frame.
	 */
	public FrmTablasMultiplicar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 481);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}

	private void definirEventos() {
		// TODO Auto-generated method stub
		for(JButton boton1:listaBotones)
		//boton1.addActionListener(this);
			boton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					tabla=Integer.parseInt(e.getActionCommand());
					pintarTabla(tabla);
					
				}
			});
			
		btnCorregir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				String prod;
				String res;
				for(int x=0;x<listaEtiquetas.size();x++) { 
					cont++;
					prod=String.valueOf(tabla*cont);
					res=(listaTextos.get(x)).getText();
					if(prod.equals(res)) {
						listaTextos.get(x).setBackground(Color.GREEN);
					}
					else {
						listaTextos.get(x).setBackground(Color.RED);
					}
						
				}
			}
		});
		
		
	}

	private void definirVentana() {
		// TODO Auto-generated method stub
		
		//Instanciamos las listas de etiquetas y cuadro de textos
		listaEtiquetas=new ArrayList<JLabel>();
		listaTextos=new ArrayList<JTextField>();
		
		//Instanciamos cada objeto como etiquetas y cuadros de texto para añadirlos al panel y a la lista correspondiente
		lblTabla1 = new JLabel();
		lblTabla1.setBounds(45, 40, 70, 14);
		panel.add(lblTabla1);
		listaEtiquetas.add(lblTabla1);
		
		lblTabla2 = new JLabel();
		lblTabla2.setBounds(45, 80, 70, 14);
		panel.add(lblTabla2);
		listaEtiquetas.add(lblTabla2);
		
		lblTabla3 = new JLabel();
		lblTabla3.setBounds(45, 121, 70, 14);
		panel.add(lblTabla3);
		listaEtiquetas.add(lblTabla3);
		
		lblTabla4 = new JLabel();
		lblTabla4.setBounds(45, 160, 70, 14);
		panel.add(lblTabla4);
		listaEtiquetas.add(lblTabla4);
		
		lblTabla5 = new JLabel();
		lblTabla5.setBounds(45, 200, 70, 14);
		panel.add(lblTabla5);
		listaEtiquetas.add(lblTabla5);
		
		lblTabla6 = new JLabel();
		lblTabla6.setBounds(45, 240, 70, 14);
		panel.add(lblTabla6);
		listaEtiquetas.add(lblTabla6);
		
		lblTabla7 = new JLabel();
		lblTabla7.setBounds(45, 280, 70, 14);
		panel.add(lblTabla7);
		listaEtiquetas.add(lblTabla7);
		
		lblTabla8 = new JLabel();
		lblTabla8.setBounds(45, 319, 70, 14);
		panel.add(lblTabla8);
		listaEtiquetas.add(lblTabla8);
		
		lblTabla9 = new JLabel();
		lblTabla9.setBounds(45, 359, 70, 14);
		panel.add(lblTabla9);
		listaEtiquetas.add(lblTabla9);
		
		lblTabla10 = new JLabel();
		lblTabla10.setBounds(45, 401, 70, 14);
		panel.add(lblTabla10);
		listaEtiquetas.add(lblTabla10);
		
		textMul1 = new JTextField();
		textMul1.setBounds(155, 37, 106, 20);
		panel.add(textMul1);
		textMul1.setColumns(10);
		listaTextos.add(textMul1);
		
		textMul2 = new JTextField();
		textMul2.setBounds(155, 77, 106, 20);
		panel.add(textMul2);
		textMul2.setColumns(10);
		listaTextos.add(textMul2);
		
		textMul3 = new JTextField();
		textMul3.setBounds(155, 118, 106, 20);
		panel.add(textMul3);
		textMul3.setColumns(10);
		listaTextos.add(textMul3);
		
		textMul4 = new JTextField();
		textMul4.setBounds(155, 157, 106, 20);
		panel.add(textMul4);
		textMul4.setColumns(10);
		listaTextos.add(textMul4);
		
		textMul5 = new JTextField();
		textMul5.setBounds(155, 197, 106, 20);
		panel.add(textMul5);
		textMul5.setColumns(10);
		listaTextos.add(textMul5);
		
		textMul6 = new JTextField();
		textMul6.setBounds(155, 237, 106, 20);
		panel.add(textMul6);
		textMul6.setColumns(10);
		listaTextos.add(textMul6);
		
		textMul7 = new JTextField();
		textMul7.setBounds(155, 277, 106, 20);
		panel.add(textMul7);
		textMul7.setColumns(10);
		listaTextos.add(textMul7);
		
		textMul8 = new JTextField();
		textMul8.setBounds(155, 316, 106, 20);
		panel.add(textMul8);
		textMul8.setColumns(10);
		listaTextos.add(textMul8);
		
		textMul9 = new JTextField();
		textMul9.setBounds(155, 356, 106, 20);
		panel.add(textMul9);
		textMul9.setColumns(10);
		listaTextos.add(textMul9);
		
		textMul10 = new JTextField();
		textMul10.setBounds(155, 398, 106, 20);
		panel.add(textMul10);
		textMul10.setColumns(10);
		listaTextos.add(textMul10);
		
		btnCorregir = new JButton("Corregir");
		btnCorregir.setBounds(363, 96, 124, 43);
		panel.add(btnCorregir);
		
		
		tabla=(int)(Math.random()*(10-1+1)+1);
		pintarTabla(tabla);
		
		int cx=525,cy=90;
		listaBotones=new ArrayList<JButton>();
		for(int x=1;x<11;x++) {
		boton = new JButton(String.valueOf(x));
		boton.setBounds(cx, cy, 45, 45);
		boton.setActionCommand(String.valueOf(x));
		//boton.addActionListener(this);
		panel.add(boton);
		listaBotones.add(boton);
		if(x==5) {
			cy+=45;
			cx=525;
		}
		else {
			cx+=45;
		}
		
		}
		
	}

	private void pintarTabla(int tabla) {
		// TODO Auto-generated method stub
		int cont=0;
		String tabla1=String.valueOf(tabla);		
		for(JLabel label:listaEtiquetas) {
			cont++;
			String cont1=String.valueOf(cont);
			label.setText(tabla1+" x "+cont1);
		}
		
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tabla=Integer.parseInt(e.getActionCommand());
		pintarTabla(tabla);
	}*/

	

	

	
}
