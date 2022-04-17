package 类与对象.继承;

class Fu {
	private int num = 100;
	public int num2 = 200;

	private void show() {
		System.out.println("show");
	}

	public void show2() {
		System.out.println("show2");
	}
}

class Zi extends Fu {
}

class ExtendsDemo2 {
	public static void main(String[] args) {
		//创建子类对象
		Zi z = new Zi();
		//System.out.println(z.num);
		System.out.println(z.num2);
		//z.show();
		z.show2();

		//看Fu行不行
		//Fu f = new Fu();
		//System.out.println(f.num);
		//System.out.println(f.num2);
    }
}
