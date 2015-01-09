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

public class Hospedaje extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtEstAtencion;
	private JTextField txtEstCita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Hospedaje dialog = new Hospedaje();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Hospedaje() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elias\\Google Drive\\Documentos Cibertec\\Trabajos en Java-Eclipse\\Sistema Gestion Hotelera\\iconoHotel.png"));
		setTitle("Hospedaje");
		setBounds(100, 100, 450, 320);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JComboBox cboOpciones = new JComboBox();
			cboOpciones.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Listado"}));
			cboOpciones.setBounds(321, 12, 90, 20);
			contentPanel.add(cboOpciones);
		}
		{
			JLabel lblCdigo = new JLabel("C\u00F3digo :");
			lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCdigo.setBounds(10, 14, 46, 14);
			contentPanel.add(lblCdigo);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setEditable(false);
			txtCodigo.setBounds(140, 12, 124, 20);
			contentPanel.add(txtCodigo);
			txtCodigo.setColumns(10);
		}
		{
			JLabel lblEstadoDeAtencin = new JLabel("Estado de atenci\u00F3n :");
			lblEstadoDeAtencin.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEstadoDeAtencin.setBounds(10, 49, 114, 14);
			contentPanel.add(lblEstadoDeAtencin);
		}
		{
			txtEstAtencion = new JTextField();
			txtEstAtencion.setEditable(false);
			txtEstAtencion.setBounds(140, 47, 124, 20);
			contentPanel.add(txtEstAtencion);
			txtEstAtencion.setColumns(10);
		}
		{
			JLabel lblEstadoDeCita = new JLabel("Estado de cita :");
			lblEstadoDeCita.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEstadoDeCita.setBounds(10, 81, 86, 14);
			contentPanel.add(lblEstadoDeCita);
		}
		{
			txtEstCita = new JTextField();
			txtEstCita.setEditable(false);
			txtEstCita.setBounds(140, 79, 124, 20);
			contentPanel.add(txtEstCita);
			txtEstCita.setColumns(10);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 141, 414, 130);
			contentPanel.add(scrollPane);
			{
				JTextArea txtS = new JTextArea();
				txtS.setEditable(false);
				scrollPane.setViewportView(txtS);
			}
		}
	}

}
