package lib;

public class Calculation_lib {
	
	//�t�B�[���h�̒�`�F�N���X�̒����ɒ�`�����ϐ�
	private int m,n;

	public Calculation_lib(int m, int n) {
		//int m, int n�̓��[�J���ϐ�
		this.m = m;//this.m�̓t�B�[���h
		this.n = n;//this.n�̓t�B�[���h
					//���[�J���ϐ��̂��t�B�[���h���D�悳���
					//�Ȃ̂ŋ�ʂ��邽�߂�this.������
	}
	
	public int getPlus(){
		return m+n;
	}
	
	public int getMinus(){
		return m-n;
	}
	
	public int getMultiple(){
		return m*n;
	}
	
	public int getDivide(){
		return m/n;
	}
	
}
