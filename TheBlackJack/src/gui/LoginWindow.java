package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.DBConn;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private static LoginWindow frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginWindow();
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
	public LoginWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 33);
		contentPane.add(panel);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("Welcome to BlackJack");
		lblNewLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JLabel lblEnterYourName = new JLabel("Enter your name:");
		lblEnterYourName.setBounds(35, 133, 98, 14);
		contentPane.add(lblEnterYourName);
		
		txtName = new JTextField();
		txtName.setBounds(147, 130, 145, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JButton btnPlay = new JButton("PLAY!");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DBConn conn = new DBConn();
				
				if(conn.checkName(txtName.getText())){
					
					JOptionPane.showMessageDialog(null, "Welcome Back");
					MainWindow mamica = new MainWindow();
					mamica.setVisible(true);
					frame.dispose();
				}else{
					
					JOptionPane.showMessageDialog(null, "Welcome!");
					conn.insertNewUser(txtName.getText());
				}
				
				
			}
		});
		btnPlay.setBounds(147, 183, 89, 23);
		contentPane.add(btnPlay);
		
		JButton btnScoreboard = new JButton("Scoreboard");
		btnScoreboard.setBounds(335, 227, 89, 23);
		contentPane.add(btnScoreboard);
	}
}
