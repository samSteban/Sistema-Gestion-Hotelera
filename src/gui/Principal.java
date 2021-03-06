package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmHospedaje;
	private JMenuItem mntmReportes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\elias\\Google Drive\\Documentos Cibertec\\Trabajos en Java-Eclipse\\Sistema Gestion Hotelera\\iconoHotel.png"));
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmNewMenuItem = new JMenuItem("Mantenimiento");
		menuBar.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Reservas");
		menuBar.add(mntmNewMenuItem_1);
		
		mntmHospedaje = new JMenuItem("Hospedaje");
		menuBar.add(mntmHospedaje);
		
		mntmReportes = new JMenuItem("Reportes");
		menuBar.add(mntmReportes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
