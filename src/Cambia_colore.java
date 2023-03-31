import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Cambia_colore extends JFrame implements ActionListener{
	JButton b=new JButton("Blu");
    JButton r=new JButton("Rosso");
    JButton v=new JButton("Verde");
	public Cambia_colore() {
		super("Calcolo Area Rettangolo");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(b);
        b.addActionListener(e -> CambiaBlu());
        c.add(r);
        r.addActionListener(e -> CambiaRosso());
        c.add(v);
        v.addActionListener(e -> CambiaVerde());
        setVisible(true);
        setResizable(true);
	}

	public void CambiaBlu() 
	{
		this.getContentPane().setBackground(Color.BLUE);
	}
	
	public void CambiaRosso() 
	{
		this.getContentPane().setBackground(Color.RED);
	}
	
	public void CambiaVerde() 
	{
		this.getContentPane().setBackground(Color.GREEN);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
            CambiaBlu();
		}
		if(e.getSource()==r){
            CambiaRosso();
		}
		if(e.getSource()==v){
            CambiaVerde();
		}
		
	}

}
