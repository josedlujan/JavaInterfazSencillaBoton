import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Principal{

	JFrame ventana;
	JLabel texto;
	JButton boton;
	JPanel panelArriba,panelAbajo;
	
	public void crearPanelArriba(){
		panelArriba = new JPanel();
		texto = new JLabel();
		texto.setText("Bienvenido a la mejor app del mundo");
		panelArriba.setLayout(new BoxLayout(panelArriba, BoxLayout.X_AXIS));
		panelArriba.add(texto);
		
	}
	
	public void  crearPanelAbajo(){
		panelAbajo = new JPanel();
		boton = new JButton();
		boton.setText("Entrar");
		panelAbajo.setLayout(new BoxLayout(panelAbajo,BoxLayout.X_AXIS));
		panelAbajo.add(boton);
	}
	
	public void crearVentana(){
		ventana = new JFrame();
		ventana.setTitle("La mejor App del mundo");
		ventana.setSize(400,400);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.add(panelArriba);
		ventana.add(panelAbajo);
		ventana.setVisible(true);
	}
	
	public Principal(){
	
	crearPanelArriba();
	crearPanelAbajo();
	crearVentana();
	
	}
	
	
	public static void main(String[] argumentos){
		Principal ventana = new Principal();
	}
	
}
