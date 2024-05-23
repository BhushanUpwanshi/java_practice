package com.app.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Image_data")
public class Img {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Image_name")
	private String ImgName;
	@Lob
	private byte[] img;
	
	
	public Img() {
	}
	
	public Img(String imgName) {
		ImgName = imgName;
	}
	
	public Img(String imgName, byte[] img) {
		super();
		ImgName = imgName;
		this.img = img;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImgName() {
		return ImgName;
	}
	public void setImgName(String imgName) {
		ImgName = imgName;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	
	@Override
	public String toString() {
		return "Img [id=" + id + ", ImgName=" + ImgName + ", img=" + Arrays.toString(img) + "]";
	}
}
