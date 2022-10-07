package exercicioJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MediaNota extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MediaNota frame = new MediaNota();
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
	public MediaNota() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(208, 11, 86, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(208, 42, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(208, 73, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nota 1:");
		lblNewLabel.setBounds(152, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2:");
		lblNewLabel_1.setBounds(152, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 3:");
		lblNewLabel_2.setBounds(152, 76, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel mostrarMedia = new JLabel("");
		mostrarMedia.setBounds(230, 104, 46, 14);
		contentPane.add(mostrarMedia);
		
		JLabel lblNewLabel_4 = new JLabel("Media:");
		lblNewLabel_4.setBounds(152, 104, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnMedia = new JButton("Calcular Média");
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNota1.getText().isEmpty() || txtNota2.getText().isEmpty() || txtNota3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Campos vazios");
				}else {
					Double nota1 = Double.valueOf(txtNota1.getText());
					Double nota2 = Double.valueOf(txtNota2.getText());
					Double nota3 = Double.valueOf(txtNota3.getText());
					mostrarMedia.setText(String.valueOf((nota1+nota2+nota3)/3));
				}
			}
		});
		btnMedia.setBounds(152, 167, 142, 23);
		contentPane.add(btnMedia);
	}
}
