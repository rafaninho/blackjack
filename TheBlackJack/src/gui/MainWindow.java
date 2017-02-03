package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 168, 514, 15);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Dealer");
		lblNewLabel.setBounds(10, 11, 70, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setBounds(10, 186, 46, 14);
		contentPane.add(lblPlayer);
		
		JButton btnHit = new JButton("HIT");
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHit.setBounds(435, 247, 89, 23);
		contentPane.add(btnHit);
		
		JButton btnStand = new JButton("STAND");
		btnStand.setBounds(435, 302, 89, 23);
		contentPane.add(btnStand);
	}
}
