package Okienkowa;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class BazaOkno extends JFrame {
	 static final long serialVersionUID=0;
		int szerokosc=400;
		int wysokosc=400;
		int poczp=60;
		int szerokoscK = szerokosc/2;
		int wysokoscK = wysokosc/2;
		int szerK = szerokosc/3;
		int wysK = wysokosc/12;
		
		JButton przycisk;
		JLabel et;
		JTextField poletekstowe;
		public BazaOkno() {
			
			MouseMotionListener Listener = new MouseMotionListener() {

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					poletekstowe.setText(e.getX()+"  /  "+e.getY() );	
				}
				
			};
			
			ActionListener AL = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (e.getSource() == przycisk) poletekstowe.setText("Dzia³a");

				}
				
			};
			
			
			Font czcionka=new Font("Serif", Font.BOLD, 20);
			przycisk = new JButton("KONIEC");
			przycisk.setBounds(szerokoscK-szerK,poczp+wysK/2,szerK*2,wysK);
			przycisk.setFont(czcionka);
			przycisk.addActionListener(AL);
			
			ImageIcon obrazek = new ImageIcon("C:\\Users\\student\\Desktop\\kalkulator1.png");
			et = new JLabel(obrazek);
			et.setBounds(szerokoscK-szerK,poczp+2*wysK,szerK*2,obrazek.getIconHeight());
			et.setIcon(obrazek);
			poletekstowe = new JTextField("Witam w UMG");
			poletekstowe.setBounds(szerokoscK-szerK,poczp-wysK/2,2*szerK,wysK);
			poletekstowe.setFont(czcionka);
			
			addMouseMotionListener(Listener);
			
			
			add(przycisk);
			add(poletekstowe);
			add(et);
			
			this.setSize(szerokosc,wysokosc);
			this.setLayout(null);
			this.setVisible(true);
				}
		
		
		
		public static void main(String[] args) {
			BazaOkno a = new BazaOkno();

		}
		}