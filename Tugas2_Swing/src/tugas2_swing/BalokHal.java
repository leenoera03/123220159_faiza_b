package tugas2_swing;

import BangunDatar.Square;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author DELL
 */
public class BalokHal extends JFrame implements ActionListener {
    JLabel header = new JLabel();
    JLabel subheader = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    
    JLabel labelPanjang = new JLabel("Panjang");
    JLabel labelLebar = new JLabel("Lebar");
    JLabel labelTinggi = new JLabel("Tinggi");

    JLabel labelHasil = new JLabel("Hasil");
    
    JLabel labelLuas = new JLabel("Luas Persegi");
    JLabel labelHasilLuas = new JLabel("[Hasil berupa angka]");
    
    JLabel labelKeliling = new JLabel("Keliling Persegi");
    JLabel labelHasilKeliling = new JLabel("[Hasil berupa angka]");
    
    JLabel labelVolume = new JLabel("Volume Balok");
    JLabel labelHasilVolume = new JLabel("[Hasil berupa angka]");
    
    JLabel labelLuasPermukaan = new JLabel("Luas Permukaan Balok");
    JLabel labelHasilLuasPermukaan = new JLabel("[Hasil berupa angka]");

    JTextField inputPanjang = new JTextField();
    JTextField inputLebar = new JTextField();
    JTextField inputTinggi = new JTextField();

    JButton tombolHasil = new JButton("Hitung");
    JButton tombolReset = new JButton("Reset");

    BalokHal(String username, String jenisKelamin, String jenisKelamin1) {
        String panggilan = (jenisKelamin == "l") ? "Mr. " : "Mrs. ";

        setVisible(true);
        setSize(500, 720);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        add(header);
        header.setText("Welcome, " + panggilan + username);
        header.setFont(header.getFont().deriveFont(20.0f));
        header.setBounds(20, 20, 440, 24);
        
        add(subheader);
        subheader.setBounds(20, 50, 440, 16);

        add(labelPanjang);
        labelPanjang.setBounds(20, 84, 84, 32);
        
        add(labelLebar);
        labelLebar.setBounds(20, 120, 84, 32);
        
        add(labelTinggi);
        labelTinggi.setBounds(20, 156, 84, 32);
        
        add(inputTinggi);
        inputTinggi.setBounds(150, 156, 310, 32);
        
        add(inputPanjang);
        inputPanjang.setBounds(150, 84, 310, 32);
        
        add(inputLebar);
        inputLebar.setBounds(150, 120, 310, 32);

        add(labelHasil);
        labelHasil.setHorizontalAlignment(SwingConstants.CENTER);
        labelHasil.setBounds(20, 290, 440, 16);
        
        add(labelLuas);
        labelLuas.setBounds(20, 320, 150, 16);
        
        add(labelKeliling);
        labelKeliling.setBounds(20, 350, 150, 16);
        
        add(labelVolume);
        labelVolume.setBounds(20, 380, 150, 16);
        
        add(labelLuasPermukaan);
        labelLuasPermukaan.setBounds(20, 410, 150, 16);

        add(labelHasilLuas);
        labelHasilLuas.setBounds(200, 320, 280, 16);
        
        add(labelHasilKeliling);
        labelHasilKeliling.setBounds(200, 350, 280, 16);
        
        add(labelHasilVolume);
        labelHasilVolume.setBounds(200, 380, 280, 16);
        
        add(labelHasilLuasPermukaan);
        labelHasilLuasPermukaan.setBounds(200, 410, 280, 16);

        add(tombolHasil);
        tombolHasil.setBounds(14, 200, 452, 36);
        tombolHasil.addActionListener(this);
        
        add(tombolReset);
        tombolReset.setBounds(14, 240, 452, 36);
        tombolReset.addActionListener(this);

}

      @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == tombolHasil) {
        try {
            double panjang = Double.parseDouble(inputPanjang.getText());
            double lebar = Double.parseDouble(inputLebar.getText());
            double tinggi = Double.parseDouble(inputTinggi.getText());

            Square bangun1 = new Square(panjang, lebar, tinggi);

            String hasilLuas = String.valueOf(bangun1.Luas());
            String hasilKeliling = String.valueOf(bangun1.Keliling());
            String hasilVolume = String.valueOf(bangun1.Volume());
            String hasilLuasPermukaan = String.valueOf(bangun1.LuasPermukaan());

            labelHasilLuas.setText(hasilLuas);
            labelHasilKeliling.setText(hasilKeliling);
            labelHasilVolume.setText(hasilVolume);
            labelHasilLuasPermukaan.setText(hasilLuasPermukaan);
            
            this.dispose();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    } else if (e.getSource() == tombolReset) {
        inputPanjang.setText("");
        inputLebar.setText("");
        inputTinggi.setText("");
        labelHasilLuas.setText("[Hasil berupa angka]");
        labelHasilKeliling.setText("[Hasil berupa angka]");
        labelHasilVolume.setText("[Hasil berupa angka]");
        labelHasilLuasPermukaan.setText("[Hasil berupa angka]");
    }
}

}


