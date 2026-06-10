import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventCatch implements ActionListener {
    // 1. Deklarasikan komponen di tingkat class agar bisa diakses oleh actionPerformed
    static JTextField t1;
    static JButton b1, b2, b3, b4;

    public static void main(String[] args) {
        JFrame f = new JFrame("Belajar Event");
        f.setSize(400, 400);
        
        // Menggunakan instance dari EventCatch untuk listener
        EventCatch listener = new EventCatch();

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout()); // Set layout agar textfield memenuhi panel
        
        // Jangan tulis ulang tipe datanya (JButton/JTextField) agar tidak membuat variabel baru
        t1 = new JTextField(""); 
        p1.add(t1, BorderLayout.CENTER);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 2, 5, 5));
        
        // Inisialisasi tombol global
        b1 = new JButton("0");
        b2 = new JButton("1");
        b3 = new JButton("2");
        b4 = new JButton("3");

        // 2. Daftarkan ActionListener ke setiap tombol
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        // Menggunakan BorderLayout pada frame utama agar tampilan rapi atas-tengah
        f.setLayout(new BorderLayout());
        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.CENTER);
        
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 3. setVisible diletakkan paling akhir
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ambil teks yang sudah ada di JTextField saat ini
        String teksSekarang = t1.getText();
        
        // 4. Cek tombol mana yang diklik, lalu gabungkan teksnya sesuai label tombol
        if (e.getSource() == b1) {
            t1.setText(teksSekarang + "0");
        } 
        else if (e.getSource() == b2) {
            t1.setText(teksSekarang + "1");
        } 
        else if (e.getSource() == b3) {
            t1.setText(teksSekarang + "2");
        } 
        else if (e.getSource() == b4) {
            t1.setText(teksSekarang + "3");
        }
    }   
}