package exercicioJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class somaJava extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					somaJava frame = new somaJava();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static Double calcular(JTextField[] txts) {
		Double soma=0.0;
		for (int i = 0; i < txts.length; i++) {
			if(!txts[i].getText().isBlank()) {
				soma=soma+Double.valueOf(txts[i].getText());
			}else {
				JOptionPane.showMessageDialog(null, "Valor vazio");
				soma=0.0;
				break;
			}
		}
		return soma;
	}
	
	/**
	 * Create the frame.
	 */
	public somaJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(53, 46, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(159, 46, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(266, 46, 86, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBounds(53, 78, 86, 20);
		contentPane.add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBounds(159, 77, 86, 20);
		contentPane.add(txt5);
		txt5.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setBounds(266, 77, 86, 20);
		contentPane.add(txt6);
		txt6.setColumns(10);
		
		JTextField[] txts = {txt1, txt2, txt3, txt4, txt5, txt6};
		
		JButton btnSoma = new JButton("SOMAR!");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnSoma, "Soma: "+calcular(txts));
			}
		});
		btnSoma.setBounds(159, 157, 89, 23);
		contentPane.add(btnSoma);
	}
}
