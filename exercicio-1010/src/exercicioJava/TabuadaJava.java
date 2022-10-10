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

public class TabuadaJava extends JFrame {

	private JPanel contentPane;
	private JTextField txtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabuadaJava frame = new TabuadaJava();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static Integer[] calcular(Integer num) {
		Integer[] tab = {num*2, num*3, num*4, num*5, num*6, num*7, num*8, num*9, num*10};
		return tab;
	}
	/**
	 * Create the frame.
	 */
	public TabuadaJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtn = new JTextField();
		txtn.setBounds(87, 11, 46, 14);
		contentPane.add(txtn);
		txtn.setColumns(10);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(87, 36, 46, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(87, 61, 46, 14);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setBounds(87, 86, 46, 14);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setBounds(87, 111, 46, 14);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setBounds(87, 136, 46, 14);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setBounds(87, 161, 46, 14);
		contentPane.add(lbl6);
		
		JLabel lbl7 = new JLabel("");
		lbl7.setBounds(87, 186, 46, 14);
		contentPane.add(lbl7);
		
		JLabel lbl8 = new JLabel("");
		lbl8.setBounds(87, 211, 46, 14);
		contentPane.add(lbl8);
		
		JLabel lbl9 = new JLabel("");
		lbl9.setBounds(87, 236, 46, 14);
		contentPane.add(lbl9);
		
		JLabel[] lbls = {lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl9};
		
		JLabel lblNewLabel_9 = new JLabel("x1");
		lblNewLabel_9.setBounds(31, 11, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("x2");
		lblNewLabel_10.setBounds(31, 36, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("x3");
		lblNewLabel_11.setBounds(31, 61, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("x4");
		lblNewLabel_12.setBounds(31, 86, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("x5");
		lblNewLabel_13.setBounds(31, 111, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("x6");
		lblNewLabel_14.setBounds(31, 136, 46, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("x7");
		lblNewLabel_15.setBounds(31, 161, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("x8");
		lblNewLabel_16.setBounds(31, 186, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("x9");
		lblNewLabel_17.setBounds(31, 211, 46, 14);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("x10");
		lblNewLabel_18.setBounds(31, 236, 46, 14);
		contentPane.add(lblNewLabel_18);
		
		JButton btnCalcular = new JButton("CALCULAR!");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtn.getText().isEmpty()) {
					Integer num = Integer.valueOf(txtn.getText());
					Integer[] tab = calcular(num);
					for (int i = 0; i < lbls.length; i++) {
						lbls[i].setText(String.valueOf(tab[i]));					
					}
				}else {
					JOptionPane.showMessageDialog(null, "Valor vazio");
				}
			}
		});
		btnCalcular.setBounds(234, 116, 110, 39);
		contentPane.add(btnCalcular);
	}
}
