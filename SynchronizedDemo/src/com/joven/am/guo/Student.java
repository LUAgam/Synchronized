package com.joven.am.guo;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��7��12�� ����11:02:53 ��˵��
 */
public class Student {

	private String name;

	private int no;
	

	public Student() {
		super();
	}

	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		synchronized (this) {
			return "Student [name=" + name + ", no=" + no + "]";
		}
	}

}
