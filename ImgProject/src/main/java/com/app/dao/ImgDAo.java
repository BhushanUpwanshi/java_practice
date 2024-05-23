package com.app.dao;

import java.io.IOException;

import com.app.entities.Img;

public interface ImgDAo {
	String storeImage(Img im,String imagePath)throws IOException;
	String restoreImage(Long ImgId)throws IOException;
}
