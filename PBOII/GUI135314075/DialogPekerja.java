package GUI135314075;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author 8.1 Enterprise
 */
public class DialogPekerja extends JDialog{
    
    JDialog dialog;
    JLabel namaLabel;
    JLabel tempatTanggalLahirLabel;
    JLabel golonganLabel;
    JLabel jenisKelaminLabel;
    JTextField namaField;
    JTextField tempatTanggalLahirField;
    JComboBox golongan;
    JButton cariButton;
    JButton SimpanButton;
    JRadioButton jkLaki, jkPerem;
    
    public DialogPekerja(){
        setLayout(null);
        
        namaLabel= new JLabel("Nama");
        add(namaLabel);
        namaLabel.setBounds(20, 20, 100, 20);
        
        namaField= new JTextField(15);
        add(namaField);
        namaField.setBounds(150, 25, 125, 20);
        
        cariButton= new JButton("Cari");
        add(cariButton);
        cariButton.setBounds(300, 25, 80, 20);
        
        tempatTanggalLahirLabel= new JLabel("Tempat/Tanggal Lahir");
        add(tempatTanggalLahirLabel);
        tempatTanggalLahirLabel.setBounds(20, 50, 140, 20);
        
        tempatTanggalLahirField= new JTextField(20);
        add(tempatTanggalLahirField);
        tempatTanggalLahirField.setBounds(150, 50, 175, 20);
        
        golonganLabel=new JLabel("Golongan");
        add(golonganLabel);
        golonganLabel.setBounds(20, 80, 100, 20);
        
        String labelGolongan[]= {"1", "2", "3", "4"};
        golongan= new JComboBox(labelGolongan);
        add(golongan);
        golongan.setBounds(150, 75, 100, 20);
        
        jenisKelaminLabel= new JLabel("Jenis Kelamin");
        add(jenisKelaminLabel);
        jenisKelaminLabel.setBounds(20, 110, 120, 20);
        
        ButtonGroup bg= new ButtonGroup();
        jkLaki= new JRadioButton("Laki-Laki", true);
        jkPerem= new JRadioButton("Wanita");
        bg.add(jkLaki);
        bg.add(jkPerem);
        jkLaki.setEnabled(true);
        jkPerem.setEnabled(true);
        add(jkLaki);
        add(jkPerem);
        jkLaki.setBounds(150, 110, 120, 20);
        jkPerem.setBounds(280, 110, 150, 20);
        
        SimpanButton =new JButton("Simpan");
        add(SimpanButton);
        SimpanButton.setBounds(150, 200, 100, 20);
        
        setVisible(true);
        setSize(400, 400);
        setTitle("PT XYZ");
    }
}
