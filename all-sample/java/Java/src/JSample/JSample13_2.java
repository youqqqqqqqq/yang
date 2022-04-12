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
	public String ps1 = "親クラスのメンバ変数が参照されました。";

	public Parent132() {
		System.out.println("親クラスのコンストラクタ（引数なし）が呼ばれました。");
	}

	public void pm() {
		System.out.println("親クラスのメソッドが呼ばれました。");
	}
}

class Child132 extends Parent132 {
	public String cs1 = "子クラスのメンバ変数が参照されました。";

	public Child132() {
		super();
		System.out.println("子クラスのコンストラクタ（引数なし）が呼ばれました。");
	}

	public void cm() {
		System.out.println("子クラスのメソッドが呼ばれました。");
	}

}