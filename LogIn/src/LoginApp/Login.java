import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtLogin;
	private JTextField txtClose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 235);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(144, 11, 95, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(43, 70, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(44, 109, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(123, 67, 176, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 106, 176, 20);
		contentPane.add(passwordField);
		
		txtLogin = new JTextField();
		txtLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				
				if(username.equals("Hendry")&& password.equals("1234")) {
				JOptionPane.showMessageDialog(null, username+", You are now Logged In!","Logged In",JOptionPane.INFORMATION_MESSAGE);
				
				}else if(username!="Hendry" && password.equals("1234")){
					JOptionPane.showMessageDialog(null, username+" is Not Registered","User name Not Found",JOptionPane.INFORMATION_MESSAGE);
				}else if(username.equals("Hendry") && password!="1234"){
					JOptionPane.showMessageDialog(null, " Password is Invalid","Incorrect Password",JOptionPane.WARNING_MESSAGE);

				}else if(username.equals("") && password!="1234"){
					JOptionPane.showMessageDialog(null, " Username cannot be empty","Username Check",JOptionPane.WARNING_MESSAGE);

				}else if(username.equals("Hendry") && password==""){
					JOptionPane.showMessageDialog(null, " Password cannot be empty","Password Check",JOptionPane.WARNING_MESSAGE);

				
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect Login details, TRY AGAIN!","Error",JOptionPane.ERROR_MESSAGE);

				}
				
			}
		});
		txtLogin.setForeground(new Color(255, 255, 255));
		txtLogin.setBackground(new Color(60, 179, 113));
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setText("LOGIN");
		txtLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLogin.setEditable(false);
		txtLogin.setBounds(66, 155, 89, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtClose = new JTextField();
		txtClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				if(JOptionPane.showConfirmDialog(null, "Do you want to Quit?","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					
					System.exit(0);
				
				}
			}
		});
		txtClose.setForeground(new Color(255, 255, 255));
		txtClose.setBackground(new Color(255, 128, 128));
		txtClose.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtClose.setText("CLOSE");
		txtClose.setHorizontalAlignment(SwingConstants.CENTER);
		txtClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtClose.setEditable(false);
		txtClose.setColumns(10);
		txtClose.setBounds(210, 155, 89, 20);
		contentPane.add(txtClose);
		
		JLabel lblNewLabel_3 = new JLabel("x");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Do you want to Quit?","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					
					System.exit(0);
				
				}
				
			}
		});
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(345, 0, 35, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(10, 11, 370, 213);
		ImageIcon icon =new ImageIcon(this.getClass().getResource("/back.png"));
		lblNewLabel_4.setIcon(icon);
		contentPane.add(lblNewLabel_4);
	}
}
