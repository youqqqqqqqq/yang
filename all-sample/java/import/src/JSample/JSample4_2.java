package JSample;
import java.util.Scanner;

public class JSample4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�L�[�{�[�h���琔�l����͂��Ă��������B");

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		scan.close();

		switch (num) {
		case 1 -> System.out.println("���ɕs��");
		case 2 -> System.out.println("�����s��");
		case 3 -> System.out.println("�ǂ���Ƃ������Ȃ�");
		case 4 -> System.out.println("��������");
		case 5 -> System.out.println("��ϖ���");
		}
	}

}