package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Reserva extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblCdigo;
	private JTextField txtCodigo;
	private JLabel lblEstadoDeReserva;
	private JTextField txtEstReserva;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Reserva dialog = new Reserva();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Reserva() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elias\\Google Drive\\Documentos Cibertec\\Trabajos en Java-Eclipse\\Sistema Gestion Hotelera\\iconoHotel.png"));
		setTitle("Reserva");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JComboBox btnOpciones = new JComboBox();
			btnOpciones.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Listado", "Anulaci\u00F3n"}));
			btnOpciones.setBounds(331, 12, 93, 26);
			contentPanel.add(btnOpciones);
		}
		
		lblCdigo = new JLabel("C\u00F3digo :");
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCdigo.setBounds(10, 17, 46, 14);
		contentPanel.add(lblCdigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(140, 15, 112, 20);
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblEstadoDeReserva = new JLabel("Estado de Reserva :");
		lblEstadoDeReserva.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstadoDeReserva.setBounds(10, 56, 109, 14);
		contentPanel.add(lblEstadoDeReserva);
		
		txtEstReserva = new JTextField();
		txtEstReserva.setEditable(false);
		txtEstReserva.setBounds(140, 54, 112, 20);
		contentPanel.add(txtEstReserva);
		txtEstReserva.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 91, 414, 160);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
	}

}
