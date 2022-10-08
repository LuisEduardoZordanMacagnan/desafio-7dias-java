package exercicioJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class contadorParesImpares extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contadorParesImpares frame = new contadorParesImpares();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static int mostrarPares(String[] txts) {
		int pares=0;
		for (int i = 0; i < txts.length; i++) {
			if(!txts[i].isEmpty()) {
				if(Double.valueOf(txts[i])%2==0){
					pares++;
				}
			}
		}
		return pares;
	}
	public static int mostrarImpares(String[] txts) {
		int impares=0;
		for (int i = 0; i < txts.length; i++) {
			if(!txts[i].isEmpty()) {
				if(Double.valueOf(txts[i])%2!=0){
					impares++;
				}
			}
		}
		return impares;
	}
	/**
	 * Create the frame.
	 */
	public contadorParesImpares() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 11, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(10, 42, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(10, 73, 86, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBounds(10, 104, 86, 20);
		contentPane.add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBounds(10, 135, 86, 20);
		contentPane.add(txt5);
		txt5.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setBounds(10, 166, 86, 20);
		contentPane.add(txt6);
		txt6.setColumns(10);
		
		txt7 = new JTextField();
		txt7.setBounds(10, 197, 86, 20);
		contentPane.add(txt7);
		txt7.setColumns(10);
		
		txt8 = new JTextField();
		txt8.setBounds(10, 228, 86, 20);
		contentPane.add(txt8);
		txt8.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pares:");
		lblNewLabel.setBounds(178, 76, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbPar = new JLabel("");
		lbPar.setBounds(234, 76, 46, 14);
		contentPane.add(lbPar);
		
		JLabel lblNewLabel_2 = new JLabel("Impares:");
		lblNewLabel_2.setBounds(178, 107, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lbImpar = new JLabel("");
		lbImpar.setBounds(234, 107, 46, 14);
		contentPane.add(lbImpar);
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txts[] = new String[8];
				txts[0] = txt1.getText();
				txts[1] = txt2.getText();
				txts[2] = txt3.getText();
				txts[3] = txt4.getText();
				txts[4] = txt5.getText();
				txts[5] = txt6.getText();
				txts[6] = txt7.getText();
				txts[7] = txt8.getText();
				lbPar.setText(String.valueOf(mostrarPares(txts)));
				lbImpar.setText(String.valueOf(mostrarImpares(txts)));
			}
		});
		btnContar.setBounds(178, 165, 89, 23);
		contentPane.add(btnContar);
		
	}
}
