package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import hereditario.Filho;
import hereditario.Pessoa;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewHeredit {

	private JFrame frame;
	private JTextField textField;
	private Pessoa joao= new Filho(null,"Joao");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewHeredit window = new viewHeredit();
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
	public viewHeredit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFamiliares = new JLabel("Familiares:");
		lblFamiliares.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFamiliares.setBounds(32, 48, 88, 13);
		frame.getContentPane().add(lblFamiliares);
		
		JLabel lblFilhos = new JLabel("Filho:");
		lblFilhos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFilhos.setBounds(260, 48, 88, 13);
		frame.getContentPane().add(lblFilhos);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(103, 46, 147, 21);
		comboBox.addItem(joao.getNome());
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(300, 47, 116, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		ButtonGroup grupodoSexo = new ButtonGroup();
		
		JRadioButton rdbtnSexo = new JRadioButton("Masculino");
		rdbtnSexo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnSexo.setBounds(103, 103, 116, 21);
		frame.getContentPane().add(rdbtnSexo);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnFemenino.setBounds(221, 103, 116, 21);
		frame.getContentPane().add(rdbtnFemenino);
		
		grupodoSexo.add(rdbtnFemenino);
		grupodoSexo.add(rdbtnSexo);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			Pessoa pai = null;
			Pessoa novoFilho = null;
			public void actionPerformed(ActionEvent e) {
				String nomedoFilho = textField.getText();
				pai = joao.buscarPessoa((String)comboBox.getSelectedItem());
				try {
					if(rdbtnSexo.isSelected()) {
					novoFilho = pai.cadastrarFilhos(nomedoFilho, 'm'); 
					}
					if(rdbtnFemenino.isSelected()) {
						novoFilho =pai.cadastrarFilhos(nomedoFilho, 'f'); 		
					}
				}catch(Exception e1){
					System.out.println(e1.toString());
					return;
				}
				comboBox.addItem(novoFilho.getNome());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(159, 140, 102, 21);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(31, 189, 385, 87);
		frame.getContentPane().add(textPane);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String nome =(String)comboBox.getSelectedItem();
				Pessoa pessoa = joao.buscarPessoa(nome);
				
			}
		});
		
	}
}
