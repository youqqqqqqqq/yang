package JSample;

public class JSample13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child132 child = new Child132();

		System.out.println(child.ps1);
		System.out.println(child.cs1);

		child.pm();
		child.cm();

	}

}

class Parent132 {
	public String ps1 = "�e�N���X�̃����o�ϐ����Q�Ƃ���܂����B";

	public Parent132() {
		System.out.println("�e�N���X�̃R���X�g���N�^�i�����Ȃ��j���Ă΂�܂����B");
	}

	public void pm() {
		System.out.println("�e�N���X�̃��\�b�h���Ă΂�܂����B");
	}
}

class Child132 extends Parent132 {
	public String cs1 = "�q�N���X�̃����o�ϐ����Q�Ƃ���܂����B";

	public Child132() {
		super();
		System.out.println("�q�N���X�̃R���X�g���N�^�i�����Ȃ��j���Ă΂�܂����B");
	}

	public void cm() {
		System.out.println("�q�N���X�̃��\�b�h���Ă΂�܂����B");
	}

}