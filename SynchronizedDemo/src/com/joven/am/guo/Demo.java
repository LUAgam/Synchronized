package com.joven.am.guo;

import org.junit.Test;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version ����ʱ�䣺2017��7��12�� ����11:01:27 ��˵��
 */
public class Demo {

	@Test
	public void demo_1() {

		new Thread(new MyThread(), "A").start();
		new Thread(new MyThread(), "B").start();

	}

	class MyThread implements Runnable {

		@Override
		public void run() {
			Student stu = new Student();
			for (int i = 0; i < 3; i++) {
				stu = new Student(String.valueOf(i), i);
				stu.toString();
			}
		}

	}
}
