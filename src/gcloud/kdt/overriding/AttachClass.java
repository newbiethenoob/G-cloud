package gcloud.kdt.overriding;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;


public class AttachClass extends JFrame {


	JButton east;
	JButton west;
	JButton south;
	JButton north;
	JButton center;
	
	
	
	public AttachClass() {
		design();
	}
	
	public void design() {
		Container ca = this.getContentPane();
		
		east = new JButton("east"); //버튼이 클릭되면 ActionEvent가 발생됨
//		east.addActionListener(new East()); //ActionListener : 인터페이스
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			
//		};
		
		
		west = new JButton("west");
		west.addActionListener(new West());
		north = new JButton("north");
		north.addActionListener(new North());
		south = new JButton("south");
		center = new JButton("center");
		
		ca.add(north, BorderLayout.NORTH);
		ca.add(south, BorderLayout.SOUTH);
		ca.add(east, BorderLayout.EAST);
		ca.add(west, BorderLayout.WEST);
		ca.add(center, BorderLayout.CENTER);
		
	}
		

	public static void main(String[] args) {
		AttachClass sc = new AttachClass();
		sc.setBounds(500, 200, 200, 500);
		sc.setVisible(true);

	}
}
