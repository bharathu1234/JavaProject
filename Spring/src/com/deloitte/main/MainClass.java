package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.pojo.HelloIndia;
import com.deloitte.pojo.HelloWorld;
import com.deloitte.pojo.Point;
import com.deloitte.pojo.SpellChecker;
import com.deloitte.pojo.TextEditor;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Point point1 = (Point) context.getBean("pointBean");
		System.out.println(point1);
		Point point2 = (Point) context.getBean("pointBean");
		System.out.println(point2);

		point2.setX(5);
		point2.setY(10);

		System.out.println(point1);
		System.out.println(point2);

		HelloWorld hellow = (HelloWorld) context.getBean("helloWorld");

		hellow.getMessage1();
		hellow.getMessage2();

		HelloIndia helloi = (HelloIndia) context.getBean("helloIndia");

		helloi.getMessage1();
		helloi.getMessage3();

		TextEditor texteditor1 = (TextEditor) context.getBean("textEditorCDI");
		texteditor1.spellCheck();

		TextEditor texteditor2 = (TextEditor) context.getBean("textEditorSDI");
		texteditor2.spellCheck();
		
		TextEditor txt3 = (TextEditor) context.getBean("textEditorAWbN");
		txt3.spellCheck();
		
		TextEditor txt4 = (TextEditor) context.getBean("textEditorAWbT");
		txt4.spellCheck();
		
		TextEditor txt5 = (TextEditor) context.getBean("textEditorAWbC");
		txt5.spellCheck();
		
		TextEditor txt6 = (TextEditor) context.getBean("textEditorAWbC");
		txt6.getName();

	}

}
