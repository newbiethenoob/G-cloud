package gcloud.kdt.overriding;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SelfControl extends JFrame implements ActionListener {	
	JButton east;
	JButton west;
	JButton north;
	JButton south;	
	JButton center;
	
	public SelfControl() {
		design();
	}
	
	public void design() {
		Container ca=this.getContentPane();
		
		east = new JButton("��");//��ư�� Ŭ���Ǹ� ActionEvent�� �߻���
		east.addActionListener(this);
		west = new JButton("��");
		west.addActionListener(this);
		north = new JButton("��");
		north.addActionListener(this);
		south = new JButton("��");
		south.addActionListener(this);
		center = new JButton("��");
		center.addActionListener(this);
		
		ca.add(north, BorderLayout.NORTH);
		ca.add(south, BorderLayout.SOUTH);
		ca.add(east, BorderLayout.EAST);
		ca.add(west, BorderLayout.WEST);
		ca.add(center, BorderLayout.CENTER);		
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==east) {
			System.out.println("����");
	    }else {
	    	System.out.println("����");
	    }
		
	}

	public static void main(String[] args) {
		SelfControl sc = new SelfControl();	
		sc.setBounds(500, 200, 500, 500);
		sc.setVisible(true);
	}

}
