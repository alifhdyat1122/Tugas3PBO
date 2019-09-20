/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author acer
 */
public class Outputan extends JFrame {

    public Outputan(String nim, String nama, String jenkel, String agama, String hobi) {
        //Output Frame
        JFrame frame2 = new JFrame();
        frame2.setTitle("TAMPILAN DATA MAHASISWA");
        frame2.setSize(800, 500);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setResizable(false);
        frame2.setVisible(true);
        frame2.setLayout(null);
        
        //JUDUL FRAME
        JLabel label = new JLabel("DATA MAHASISWA");
        frame2.add(label);
        label.setBounds(350, 20, 150, 20);

        //OUTPUT NIM
        JLabel lnim = new JLabel("NIM");
        frame2.add(lnim);
        lnim.setBounds(50, 70, 150, 20);
        JLabel titikDua = new JLabel(" : ");
        frame2.add(titikDua);
        titikDua.setBounds(185, 70, 150, 20);
        JLabel hasilnim = new JLabel(nim);
        frame2.add(hasilnim);
        hasilnim.setBounds(200, 70, 280, 20);

        //OUTPUT NAMA
        JLabel lnama = new JLabel("Nama");
        frame2.add(lnama);
        lnama.setBounds(50, 100, 150, 20);
        JLabel titikDuaA = new JLabel(" : ");
        frame2.add(titikDuaA);
        titikDuaA.setBounds(185, 100, 150, 20);
        JLabel hasilnama = new JLabel(nama);
        frame2.add(hasilnama);
        hasilnama.setBounds(200, 100, 280, 20);

        //OUTPUT JENIS KELAMIN
        JLabel ljenkel = new JLabel("Jenis Kelamin");
        frame2.add(ljenkel);
        ljenkel.setBounds(50, 130, 150, 20);
        JLabel titikDuaB = new JLabel(" : ");
        frame2.add(titikDuaB);
        titikDuaB.setBounds(185, 130, 150, 20);
        JLabel hasiljenkel = new JLabel(jenkel);
        frame2.add(hasiljenkel);
        hasiljenkel.setBounds(200, 130, 580, 20);

        //OUTPUT AGAMA
        JLabel lagama = new JLabel("Agama");
        frame2.add(lagama);
        lagama.setBounds(50, 160, 150, 20);
        JLabel titikDuaC = new JLabel(" : ");
        frame2.add(titikDuaC);
        titikDuaC.setBounds(185, 160, 150, 20);
        JLabel hasilagama = new JLabel(agama);
        frame2.add(hasilagama);
        hasilagama.setBounds(200, 160, 280, 20);

        //OUTPUT HOBI
        JLabel lhobi = new JLabel("Hobi");
        frame2.add(lhobi);
        lhobi.setBounds(50, 190, 150, 20);
        JLabel titikDuaD = new JLabel(" : ");
        frame2.add(titikDuaD);
        titikDuaD.setBounds(200, 190, 280, 20);
        JLabel hasilhobi = new JLabel(hobi);
        frame2.add(hasilhobi);
        hasilhobi.setBounds(300, 190, 280, 20);

    }

}
