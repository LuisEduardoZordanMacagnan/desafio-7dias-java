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

public class MaiorMenorJava extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaiorMenorJava frame = new MaiorMenorJava();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static Float maiorNumero(JTextField[] txts) {
		Float maior=null;
		for (int i = 0; i < txts.length; i++) {
			if(!txts[i].getText().isBlank()) {
				if(maior==null || Float.valueOf(txts[i].getText())>maior ) {
					maior=Float.valueOf(txts[i].getText());
				}
			}else{
				JOptionPane.showMessageDialog(null, "Valor vazio");
				maior=null;
				break;
			}
		}
		return maior;
	}
	public static Float menorNumero(JTextField[] txts) {
		Float menor=null;
		for (int i = 0; i < txts.length; i++) {
				if(menor==null || Float.valueOf(txts[i].getText())<menor ) {
					menor=Float.valueOf(txts[i].getText());
				}
		}
		return menor;
	}
	public static Float media(JTextField[] txts) {
		Float soma=0F;
		for (int i = 0; i < txts.length; i++) {
			soma=soma+Float.valueOf(txts[i].getText());
		}
		return soma/txts.length;
	}
	
	/**
	 * Create the frame.
	 */
	public MaiorMenorJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(33, 66, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(175, 66, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(308, 66, 86, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		JTextField[] txts = {txt1, txt2, txt3}; 
		
		JButton btnCalcular = new JButton("CALCULAR!");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(maiorNumero(txts)!=null) {
					JOptionPane.showMessageDialog(btnCalcular, "Maior número: "+maiorNumero(txts)+". Menor número: "+menorNumero(txts)+". Média: "+media(txts));
				}
			}
		});
		btnCalcular.setBounds(146, 162, 143, 23);
		contentPane.add(btnCalcular);
	}
}