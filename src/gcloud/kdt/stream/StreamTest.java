package gcloud.kdt.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamTest {
	
	int temp;
	public void test() {
		FileReader fi = null;
		try {
			//FileInputStream fi = new FileInputStream("c:/human/a.txt");
			fi =new FileReader("c:/human/a.txt");
			while((temp = fi.read()) != -1) {
				System.out.print((char)temp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fi.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void test1() {
		FileReader fi = null;
		FileWriter fw = null;
		try {
			//FileInputStream fi = new FileInputStream("c:/human/a.txt");
			fi =new FileReader("c:/human/a.txt");
			fw = new FileWriter("c:/human/b.txt");
			while((temp = fi.read()) != -1) {
				fw.write(temp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				fw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	//3. BufferedReader, BufferedWriter 사용
	public void test2() {
		String tempStr;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("c:/human/a.txt"));
			bw = new BufferedWriter(new FileWriter("c:/human/test.txt"));
			while((tempStr=br.readLine()) != null) {
				System.out.println(tempStr);
				bw.write(tempStr+"\r\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//최종
//	public void test3() throws Exception {
//		String tempStr;
//		BufferedReader br = new BufferedReader(new FileReader("c:/human/a.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("c:/human/test4.txt"));
//		
//		try(br;bw) {
//			while((tempStr=br.readLine()) != null) {
//				System.out.println(tempStr);
//				bw.write(tempStr+"\r\n");
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

	
	public static void main(String[] args) throws Exception {
		StreamTest st = new StreamTest();
		st.test();
	}
	
}
