package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener ,WindowListener ,KeyListener {

	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private TextField text3 = new TextField("",10);
	private Button button1 = new Button("�����Z");
	
	//M/M/1�p
	private TextField m1 = new TextField("",5);
	private TextField m2 = new TextField("",5);
	private TextField m3 = new TextField("",5);
	private Button bm = new Button("M/M/1");
	
	//M/M/S�p
	private TextField ms1 = new TextField("",5);
	private TextField ms2 = new TextField("",5);
	private TextField ms3 = new TextField("",5);
	private TextField s = new TextField("",5);
	private Button bs = new Button("M/M/S");

	
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setBounds(5,5,655,455);//window�̈ʒu�ƃT�C�Y�ݒ�
		setVisible(true);//window�̉���
		setTitle("FrameSystem");//window�̖��O
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("����"));
		add(text3);
		add(new Label("��"));
		add(m1);
		add(new Label("��"));
		add(m2);
		add(new Label("���όn���l��"));
		add(bm);
		add(m3);
		add(new Label("��"));
		add(ms1);
		add(new Label("��"));
		add(ms2);
		add(new Label("s"));
		add(s);
		add(new Label("���όn���l��"));
		add(bs);
		add(ms3);
		bm.addActionListener(this);
		button1.addActionListener(this);//�����t�����actionPerformed���Ăяo�����
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub �{�^���������ꂽ��actionPerformed���Ăяo�����
		
		if(e.getSource() == button1){//���̃{�^���������ꂽ�����ʂ���
			int val1 = Integer.parseInt(text1.getText());
			int val2 = Integer.parseInt(text2.getText());
			//text3.setText(String.valueOf(val1 + val2));
			Calculation_lib clib = new Calculation_lib(val1,val2);
			text3.setText(String.valueOf(clib.getPlus()));
		}else if(e.getSource() == bm){
			double mu = Double.parseDouble(m1.getText());
			double lam = Double.parseDouble(m2.getText());
			MM1_lib mlib = new MM1_lib(lam,mu);
			m3.setText(String.valueOf(mlib.getLength()));
		}else if(e.getSource() == bs){
			double mu = Double.parseDouble(ms1.getText());
			double lam = Double.parseDouble(ms2.getText());
			int s1 = Integer.parseInt(s.getText());
			MMS_lib mslib = new MMS_lib(lam,mu,s1);
			ms3.setText(String.valueOf(mslib.getTl()));
		}
	}

	
}
