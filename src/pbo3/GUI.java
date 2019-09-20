/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
class GUI extends JFrame {

    public GUI() {
        //judul frame
        setTitle("INPUTAN DATA MAHASISWA");
        setDefaultCloseOperation(3);
        setSize(800, 500); //size frame
        setLocationRelativeTo(null);
        setResizable(false);
        ButtonGroup group = new ButtonGroup();
        
        //JUDUL APLIKASI
        JLabel label = new JLabel("DATA MAHASISWA");
        add(label);
        label.setBounds(350, 20, 150, 20);

        setLayout(null);
        //nim
        JLabel lnim = new JLabel("NIM ");
        lnim.setBounds(50, 70, 150, 20);
        add(lnim);
        JLabel titikDua = new JLabel(" : ");
        add(titikDua);
        titikDua.setBounds(185, 70, 150, 20);
        JTextField fnim = new JTextField(10);
        fnim.setBounds(200, 70, 280, 20);
        add(fnim);
        
        //nama
        JLabel lnama = new JLabel(" Nama Lengkap ");
        lnama.setBounds(50, 100, 150, 20);
        add(lnama);
        JLabel titikDuaA = new JLabel(" : ");
        add(titikDuaA);
        titikDuaA.setBounds(185, 100, 150, 20);
        JTextField fnama = new JTextField(10);
        fnama.setBounds(200, 100, 280, 20);
        add(fnama);
        
        //jenis kelamin
        JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
        ljeniskelamin.setBounds(50, 130, 150, 20);
        add(ljeniskelamin);
        JLabel titikDuaB = new JLabel(" : ");
        add(titikDuaB);
        titikDuaB.setBounds(185, 130, 150, 20);
        JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
        rbPria.setBounds(200, 130, 580, 20);
        add(rbPria);
        group.add(rbPria);
        JRadioButton rbWanita = new JRadioButton("Perempuan ");
        rbWanita.setBounds(300, 130, 580, 20);
        add(rbWanita);
        group.add(rbWanita);
        
        //agama
        JLabel lagama = new JLabel(" Agama ");
        String[] namaAgama
                = {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};

        lagama.setBounds(50, 160, 150, 20);
        add(lagama);
        JLabel titikDuaC = new JLabel(" : ");
        add(titikDuaC);
        titikDuaC.setBounds(185, 160, 150, 20);
        JComboBox cmbAgama = new JComboBox(namaAgama);
        cmbAgama.setBounds(200, 160, 280, 20);
        add(cmbAgama);
        
        //hobby
        JLabel lhobby = new JLabel(" Hobby ");
        lhobby.setBounds(50, 190, 150, 20);
        add(lhobby);
        JLabel titikDuaD = new JLabel(" : ");
        add(titikDuaD);
        titikDuaD.setBounds(185, 190, 150, 20);
        JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
        cbSepakbola.setBounds(200, 190, 280, 20);
        add(cbSepakbola);
        JCheckBox cbBasket = new JCheckBox(" Basket ");
        cbBasket.setBounds(300, 190, 280, 20);
        add(cbBasket);

        setVisible(true);
        
        //btnsimpan
        JButton simpan = new JButton("Simpan");
        add(simpan);
        simpan.setBounds(50, 360, 80, 30);
        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = fnim.getText();
                String nama = fnama.getText();
                String jenkel = "";
                if (rbPria.isSelected()) {
                    jenkel = "Laki-Laki";
                } else if (rbWanita.isSelected()) {
                    jenkel = "Perempuan";
                }
                String agama = cmbAgama.getSelectedItem().toString();
                String hobi = "";
                if (cbSepakbola.isSelected()){
                hobi = "Sepakbola";
                } 
                else if (cbBasket.isSelected()){
                    hobi = "Basket";
                }
                Outputan out = new Outputan(nim, nama, jenkel, agama, hobi );
                dispose();
            }
        });
    }

}
