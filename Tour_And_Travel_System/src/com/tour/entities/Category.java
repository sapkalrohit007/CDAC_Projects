package com.tour.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
		  @Id
		  @Column
		//@GeneratedValue//when uncomment this then problem in deleting 
		  private int categoryid;
		  @Column
		  private String categoryname;
		  @Column
		  private String image;
		@OneToMany(mappedBy="catobject", fetch=FetchType.LAZY,cascade=CascadeType.ALL) //FK--fieldname
		  private List<Packagem>packagelist;
		  
		  
		  public Category() {
			// TODO Auto-generated constructor stub
		}
		  public Category(int categoryid, String categoryname,String image) {
				
				this.categoryid = categoryid;
				this.categoryname = categoryname;
				this.image=image;
			}
		
		public int getCategoryid() {
			return categoryid;
		}
		
		
		public void setCategoryid(int categoryid) {
			this.categoryid = categoryid;
		}
		
		
		public String getCategoryname() {
			return categoryname;
		}
		
		
		public void setCategoryname(String categoryname) {
			this.categoryname = categoryname;
		}
		
		
		public List<Packagem> getPackagelist() {
			return packagelist;
		}
		
		
		public void setPackagelist(List<Packagem> packagelist) {
			this.packagelist = packagelist;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		@Override
		public String toString() {
			return String.format("Category [categoryid=%s, categoryname=%s]", categoryid, categoryname);
		}
		
}
