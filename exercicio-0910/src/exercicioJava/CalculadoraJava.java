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

public class CalculadoraJava extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraJava frame = new CalculadoraJava();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static Double calcular(String[] n, int calc) {
		Double resp=null;
		Double[] num = new Double[n.length];
		for (int i = 0; i < n.length; i++) {
			if(!n[i].isEmpty()){
				num[i]=Double.valueOf(n[i]);
				if((i+1)==n.length) {
					switch(calc) {
					case 1:
						resp=num[0]+num[1];
						break;
					case 2:
						resp=num[0]-num[1];
						break;
					case 3:
						resp=num[0]*num[1];
						break;
					case 4:
						resp=num[0]/num[1];
						break;
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "Valor vazio");
				break;
			}
		}
		return resp;
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(90, 115, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(245, 115, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(204, 121, 46, 14);
		contentPane.add(lblResultado);
		
		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] n = {txt1.getText(), txt2.getText()};
				int calc = 1;
				lblResultado.setText(String.valueOf(calcular(n, calc)));
			}
		});
		btnMais.setBounds(21, 173, 89, 23);
		contentPane.add(btnMais);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] n = {txt1.getText(), txt2.getText()};
				int calc = 2;
				lblResultado.setText(String.valueOf(calcular(n, calc)));
			}
		});
		btnMenos.setBounds(120, 173, 89, 23);
		contentPane.add(btnMenos);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] n = {txt1.getText(), txt2.getText()};
				int calc = 3;
				lblResultado.setText(String.valueOf(calcular(n, calc)));
			}
		});
		btnMultiplicacao.setBounds(225, 173, 89, 23);
		contentPane.add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] n = {txt1.getText(), txt2.getText()};
				int calc = 4;
				lblResultado.setText(String.valueOf(calcular(n, calc)));
			}
		});
		btnDivisao.setBounds(324, 173, 89, 23);
		contentPane.add(btnDivisao);
	}
}
