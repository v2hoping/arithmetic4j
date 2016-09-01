package demo;

import java.util.*;

/*
 * ����
 * 30*20�������������һλȡ��
 * �����ʣ�1%
 * 20100503
 */
public class Variation {
	public static final double Variation = 0.01;// ������
	public static final int VariableLength = 20;// ��Ԫ����Ԫ�ĳ���,Ҳ���ǻ���ĳ���
	
	public int[][] variation(int[][] geneticgene) {
		Random ran = new Random();
		int total = geneticgene[0].length * geneticgene.length;//��������
		//����
		for (int i = 0; i < total * Variation; i++) {
			int element = ran.nextInt(total);// �����������֮�ڵ����ֵ
			//System.out.println(element);
			geneticgene[element / VariableLength][element % VariableLength] = 1^geneticgene[element / VariableLength][element % VariableLength];// ��λȡ��
		}
		return geneticgene;
	}

	/*
	 * test
	 * ë�������� ��զզ��
	 */

}