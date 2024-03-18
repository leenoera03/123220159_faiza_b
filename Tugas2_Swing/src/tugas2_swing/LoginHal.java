package tugas2_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class LoginHal extends JFrame implements ActionListener {
    JLabel header = new JLabel("Selamat Datang!");
    JLabel subheader = new JLabel("Silakan masuk untuk melanjutkan.");
    JLabel labelUsername = new JLabel("Username");
    JLabel labelPassword = new JLabel("Password");
    JLabel labelJenisKelamin = new JLabel("Jenis Kelamin");

    JTextField inputUsername = new JTextField();
    JTextField inputPassword = new JTextField();

    JRadioButton pilihLaki = new JRadioButton("Laki-laki");
    
    JRadioButton pilihPerempuan = new JRadioButton("Perempuan", true);

    JButton tombolLogin = new JButton("Login");

    LoginHal() {
        setVisible(true);
        setSize(500, 720);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        header.setFont(header.getFont().deriveFont(20.0f));
        header.setBounds(20, 20, 440, 24);
        
        add(subheader);
        subheader.setBounds(20, 50, 440, 12);
        
        add(labelUsername);
        labelUsername.setBounds(20, 84, 440, 12);
        
        add(labelPassword);
        labelPassword.setBounds(20, 150, 440, 12);
        
        add(labelJenisKelamin);
        labelJenisKelamin.setBounds(20, 216, 440, 12);
        
        add(inputUsername);
        inputUsername.setBounds(18, 100, 440, 32);
        
        add(inputPassword);
        inputPassword.setBounds(18, 166, 440, 32);

        add(pilihLaki);
        pilihLaki.setBounds(14, 232, 128, 32);
        
        add(pilihPerempuan);
        pilihPerempuan.setBounds(224, 232, 128, 32);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihLaki);
        pilihJenisKelamin.add(pilihPerempuan);
        
        add(tombolLogin);
        tombolLogin.setBounds(14, 280, 452, 36);
        tombolLogin.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = inputUsername.getText();
            String password = inputPassword.getText();
            
            String jenisKelamin = pilihLaki.isSelected() ? "l" : "p";
            
            if (username.isEmpty()) {
                throw new Exception("Pastikan data telah terisi semua !");
            }
            
            if (password.isEmpty()) {
                throw new Exception("Pastikan data telah terisi semua !");
            }
            
            
            new BalokHal(username, password, jenisKelamin);
            this.dispose();
        } catch (Exception error) {
            
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
