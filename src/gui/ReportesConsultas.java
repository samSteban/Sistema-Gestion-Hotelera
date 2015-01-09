package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ReportesConsultas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNumHabitacion;
	private JTextField txtCodRecepcionista;
	private JTextField txtFchIngreso;
	private JTextField txtFchSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReportesConsultas dialog = new ReportesConsultas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ReportesConsultas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elias\\Google Drive\\Documentos Cibertec\\Trabajos en Java-Eclipse\\Sistema Gestion Hotelera\\iconoHotel.png"));
		setTitle("Reportes y Consultas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setBounds(319, 40, 105, 23);
			contentPanel.add(btnBuscar);
		}
		{
			JLabel lblRecepcionista = new JLabel("Recepcionista :");
			lblRecepcionista.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblRecepcionista.setBounds(10, 15, 82, 14);
			contentPanel.add(lblRecepcionista);
		}
		{
			txtNumHabitacion = new JTextField();
			txtNumHabitacion.setBounds(149, 41, 86, 20);
			contentPanel.add(txtNumHabitacion);
			txtNumHabitacion.setColumns(10);
		}
		{
			JLabel lblNmeroDeHabitacin = new JLabel("N\u00FAmero de Habitaci\u00F3n :");
			lblNmeroDeHabitacin.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNmeroDeHabitacin.setBounds(10, 43, 129, 14);
			contentPanel.add(lblNmeroDeHabitacin);
		}
		{
			JComboBox cboOpciones = new JComboBox();
			cboOpciones.setModel(new DefaultComboBoxModel(new String[] {"Hospj. Recepcionista", "Historial Habitaci\u00F3n", "Rango Fechas", "Mnt.Total Parcial y Consumd."}));
			cboOpciones.setBounds(245, 13, 179, 20);
			contentPanel.add(cboOpciones);
		}
		{
			txtCodRecepcionista = new JTextField();
			txtCodRecepcionista.setBounds(149, 13, 86, 20);
			contentPanel.add(txtCodRecepcionista);
			txtCodRecepcionista.setColumns(10);
		}
		{
			JLabel lblFechaIngreso = new JLabel("Fecha Ingreso :");
			lblFechaIngreso.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblFechaIngreso.setBounds(10, 71, 86, 14);
			contentPanel.add(lblFechaIngreso);
		}
		{
			txtFchIngreso = new JTextField();
			txtFchIngreso.setBounds(149, 69, 86, 20);
			contentPanel.add(txtFchIngreso);
			txtFchIngreso.setColumns(10);
		}
		{
			JLabel lblFechaSalida = new JLabel("Fecha Salida :");
			lblFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblFechaSalida.setBounds(10, 98, 74, 14);
			contentPanel.add(lblFechaSalida);
		}
		{
			txtFchSalida = new JTextField();
			txtFchSalida.setBounds(149, 96, 86, 20);
			contentPanel.add(txtFchSalida);
			txtFchSalida.setColumns(10);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 125, 414, 126);
			contentPanel.add(scrollPane);
			{
				JTextArea txtS = new JTextArea();
				txtS.setEditable(false);
				scrollPane.setViewportView(txtS);
			}
		}
	}

}
