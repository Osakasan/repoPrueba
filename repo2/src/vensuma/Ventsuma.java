package vensuma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventsuma {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventsuma window = new Ventsuma();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventsuma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Intro Valor 1");
		label1.setBounds(24, 53, 134, 43);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Intro Valor 2");
		label2.setBounds(24, 121, 203, 43);
		frame.getContentPane().add(label2);
		
		JTextPane caja1 = new JTextPane();
		caja1.setBounds(269, 53, 79, 21);
		frame.getContentPane().add(caja1);
		
		JTextPane caja2 = new JTextPane();
		caja2.setBounds(269, 121, 86, 21);
		frame.getContentPane().add(caja2);
		
		JLabel resultado = new JLabel("");
		resultado.setBounds(278, 159, 70, 30);
		frame.getContentPane().add(resultado);
		
		JButton boton = new JButton("Sumar");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1=Integer.parseInt(caja1.getText());
				int v2=Integer.parseInt(caja2.getText());
				int s;
				s=v1+v2;
				resultado.setText(Integer.toString(s));
			}
		});
		boton.setBounds(189, 213, 117, 25);
		frame.getContentPane().add(boton);
		
		
	}
}
