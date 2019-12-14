/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Frame;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
public class Gui extends JFrame{
    String textDate = "";
    String formateDate;
    String[] simpan = new String[9];
    String[] coba = new String[3];
    public Gui(){
        
        
        JLabel judul = new JLabel("DATE FORMATER");
        judul.setBounds(180, 30, 240, 40);
        judul.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(judul);
        
        JLabel customDate = new JLabel("Custome Date");
        customDate.setBounds(10,95,180,25);
        customDate.setFont(new Font("Consolas", Font.BOLD,15));
        add(customDate);
        JTextField cstmDt = new JTextField();
        cstmDt.setBounds(10,125,500,25);
        cstmDt.setFont(new Font("Consolas",Font.BOLD,15));
        add(cstmDt);
        
        String tgl = cstmDt.getText();
//        String n = cstmDt.getText();
//        simpan = n.split("");
        
        JLabel formatDate = new JLabel("Format Date");
        formatDate.setBounds(10,155,180,25);
        formatDate.setFont(new Font("Consolas", Font.BOLD,15));
        add(formatDate);
        String date[]={"yyyy/MM/dd", "dd/MM/yyyy"};
        JComboBox dt = new JComboBox(date);
        dt.setBounds(10,185,500,25);
        add(dt);
        this.formateDate = dt.getSelectedItem().toString();
        
        JLabel result = new JLabel("Result");
        result.setBounds(10,215,180,25);
        result.setFont(new Font("Consolas", Font.BOLD,15));
        add(result);
        JTextField rslt = new JTextField();
        dt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String format1;
            if (formateDate.equals("dd/MM/yyyy")){
                format1 = tgl.substring(0, 2)+"/"+tgl.substring(2, 4)+"/"+tgl.substring(4, 8);
                System.out.println("Tanggal = "+ format1);
            }
            else if(formateDate.equals("yyyy/MM/dd")){
                format1 = tgl.substring(4, 8)+"/"+tgl.substring(2, 4)+"/"+tgl.substring(0, 2);
                System.out.println("Tanggal = "+ format1);
            }
            SimpleDateFormat sdf = new SimpleDateFormat(this.formateDate);
            java.util.Date date1 = null;
            try{
            date1 = sdf.parse(this.format1);
            }
            rslt.setText(format1);
//                if(dt.getSelectedItem().equals("dd/MM/yyyy"))
//                {
//                    for(int i=0; i<9; i++){
//                        rslt.setText("1. "+simpan[i]);
//                    }
//                    
//                }
//                else
//                {
//                    rslt.setText("tanggal, bulan, tahun");
//                }
            }
        });

//        dt.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Date date = new Date(Integer.parseInt(cstmDt.getText()));
//                SimpleDateFormat dateFormat = new SimpleDateFormat(dt.getSelectedItem().toString());
//                String dateSudahDiFormat = dateFormat.format(date);
//                System.out.println("==== >"+dateSudahDiFormat);
//            }
//        });
        rslt.setBounds(10,245,500,25);
        rslt.setFont(new Font("Consolas",Font.BOLD, 15));
        add(rslt);
               
        setTitle("Modul 4");
        setSize(520, 390);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        validate();
        repaint(); 
    }
}
