import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class MyFrame extends JFrame implements ActionListener 
{
	JTextArea Nome=new JTextArea();
    JTextArea Cognome= new JTextArea();
    JTextArea Indirizzo= new JTextArea();
    JButton Registra=new JButton("Registra");
    JButton Stampa=new JButton("Stampa");
    JLabel n=new JLabel("Inserisci nome: ");
    JLabel cog=new JLabel("Inserisci cognome: ");
    JLabel i=new JLabel("Inserisci indirizzo: ");
    JTextArea risultato= new JTextArea();
    JLabel ris=new JLabel("Dati persona: ");
    ArrayList a= new ArrayList ();
	public MyFrame() 
	{
		super("Calcolo Area Rettangolo");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(n);
        c.add(Nome);
        Nome.setPreferredSize(new Dimension(200,20));
        c.add(cog);
        c.add(Cognome);
        Cognome.setPreferredSize(new Dimension(200,20));
        c.add(i);
        c.add(Indirizzo);
        Indirizzo.setPreferredSize(new Dimension(200,20));
        c.add(Registra);
        Registra.addActionListener(e -> Registrazione());
        setSize(400, 400);
        c.add(Stampa);
        Stampa.addActionListener(e -> Stampa());
        setVisible(true);
        this.a=a;
	}
	
	

	public void Registrazione() 
	{
		a.add(Nome.getText());
		a.add(Cognome.getText());
		a.add(Indirizzo.getText());
	}
	
	public void Stampa() 
	{
		for(int i=0; i<a.size(); i++) 
		{
			if(i%3==0)
			{
				System.out.println(" ");
			}
			System.out.println(a.get(i));
		}
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==Registra){
            Registrazione();
		}
            
        if(e.getSource()==Stampa){
            Stampa();
	}
}
}
