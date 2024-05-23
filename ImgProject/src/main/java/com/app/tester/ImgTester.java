package com.app.tester;

import org.hibernate.SessionFactory;

import com.app.dao.ImgDAo;
import com.app.dao.ImgDaoImpl;
import com.app.entities.Img;

import static com.app.utils.HibernateUtils.getFactory;

import java.io.IOException;
import java.util.Scanner;
public class ImgTester {
	public static void main(String[] args) {
		try(SessionFactory sf= getFactory();
				Scanner sc=new Scanner(System.in)){
			ImgDAo imgDao= new ImgDaoImpl();
			System.out.println("Enter Image Id");
			System.out.println(imgDao.restoreImage(sc.nextLong()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
