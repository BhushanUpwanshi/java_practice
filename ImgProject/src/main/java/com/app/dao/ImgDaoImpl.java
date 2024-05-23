package com.app.dao;

import org.apache.commons.io.FileUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Img;

import java.io.File;
import java.io.IOException;

import static com.app.utils.HibernateUtils.getFactory;


public class ImgDaoImpl implements ImgDAo {

	@Override
	public String storeImage(Img img,String imagePath) throws IOException {
		String message = "Could not save Image";
		Session session= getFactory().getCurrentSession();
		Transaction tx= session.beginTransaction();
		try {
			session.persist(img);
			File fref= new File(imagePath);
			img.setImg(FileUtils.readFileToByteArray(fref));
			tx.commit();
			message="Image saved successsfully";
		}catch(RuntimeException e) {
			tx.rollback();
			throw e;
		}
		return message;
	}

	@Override
	public String restoreImage(Long ImgId) throws IOException {
		String message, jpql="select i from Image_data i where id=:imgId";
		Session session= getFactory().getCurrentSession();
		Transaction tx= session.beginTransaction();
		try {
			Img img=session.createQuery(jpql,Img.class)
					.setParameter("imgId", ImgId)
					.getSingleResult();
			
			FileUtils.writeByteArrayToFile(new File("a"), img.getImg());
			tx.commit();
		}catch(RuntimeException e) {
			tx.rollback();
			throw e;
		}
		return null;
	}

}
