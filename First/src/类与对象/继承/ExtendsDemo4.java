package 类与对象.继承;

class A {
	/*
	public Fu() {
		System.out.println("Fu()");
	}
	*/

	public A(String name) {
		System.out.println("hello");
	}
}

class B extends A {
	public B() {
		// super(null);
		super("aaa");
		//this("aaa");
		System.out.println("zi()");
	}

	public B(String name) {
		// super();
		super(name);
		//this();
		System.out.println("world");
	}
}

class ExtendsDemo4 {
	public static void main(String[] args) {
		//创建子类对象
		B b = new B();
		System.out.println("-------------");
		B b2 = new B("java");
	}
}
