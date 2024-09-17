package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Jframe es el marco de la app que es una clase que hereda nuestro formulario
public class FrmSwing_1 extends JFrame {

	//Se borra el atributo estatico
	//private static final long serialVersionUID = 1L;
	
	//Jpanel es el panel donde se ponen los elementos
	private JPanel panel;
	//A veces cuando ponemos un objeto en la ventana en el entorno visual, nos lo añade del tiron
	private JLabel lblNombre;
	private JTextField textNombre;
	private JButton btnAceptar;
	private JLabel lblSaludo;
	
	//Si no queremos que la aplicacion se lance desde esta clase , borramos el public static void main
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSwing_1 frame = new frmSwing_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	 /**
	 * Create the frame.
	 */
	public FrmSwing_1() {
		
		//Esta propiedad determina el titulo de la app
		setTitle("Hola mundo");
		
		//Permite que cuando se haga clic en la X del formulario, lo cierra y lo saca de la memoria
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Esta propiedad es la que determina las dimensiones del formulario
		//el formulario esta en las coordenadas 100 , 100 y mide 655x270
		setBounds(100, 100, 655, 270);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(panel);
		panel.setLayout(null);
		
		//Instanciamos objetos que estan dentro de la ventana, para no rellenar mucho el constructor
		definirVentana();
		
		definirEventos();
		
		
		//Añadimos esta propiedad porque sino no seria visible
		this.setVisible(true);
	}

	private void definirEventos() {
		// TODO Auto-generated method stub
		//Escucha eventos
		btnAceptar.addActionListener(new ActionListener() {
			//En el entorno grafico hacemos clic derecho en el boton, a añadir evento, accion y accion performed
			public void actionPerformed(ActionEvent e) {
				//Aqui se escribira la accion que hara el programa despues de pulsar el boton
				String nombre=textNombre.getText();
				lblSaludo.setText("Hola "+nombre+", bienvenido.");
			}
		});
		
	}

	private void definirVentana() {
		// TODO Auto-generated method stub
		//Instancia etiqueta de texto
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 24, 58, 14);
		lblNombre.setBackground(new Color(240, 240, 240));
		panel.add(lblNombre);
		
		//Instancia cuadro de texto
		textNombre = new JTextField();
		textNombre.setBounds(104, 21, 106, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		//Instancia boton
		btnAceptar = new JButton("Aceptar");
		
		//Esta parte de codigo nos la genera el mismo programa, pero nosotros gestionaremos los eventos en otra funcion a parte
		/*btnAceptar.addActionListener(new ActionListener() {
			//En el entorno grafico hacemos clic derecho en el boton, a añadir evento, accion y accion performed
			public void actionPerformed(ActionEvent e) {
				//Aqui se escribira la accion que hara el programa despues de pulsar el boton
			
			}
		});*/
		btnAceptar.setBounds(231, 20, 100, 23);
		panel.add(btnAceptar);
		
		//Instancia otra etiqueta
		lblSaludo = new JLabel("");
		lblSaludo.setBounds(137, 96, 232, 56);
		panel.add(lblSaludo);
		
	}
}
