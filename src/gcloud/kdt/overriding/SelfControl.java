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
		
		east = new JButton("동");//버튼이 클릭되면 ActionEvent가 발생됨
		east.addActionListener(this);
		west = new JButton("서");
		west.addActionListener(this);
		north = new JButton("남");
		north.addActionListener(this);
		south = new JButton("북");
		south.addActionListener(this);
		center = new JButton("중");
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
			System.out.println("동쪽");
	    }else {
	    	System.out.println("서쪽");
	    }
		
	}

	public static void main(String[] args) {
		SelfControl sc = new SelfControl();	
		sc.setBounds(500, 200, 500, 500);
		sc.setVisible(true);
	}

}
