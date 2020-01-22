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
@Table(name="state")
public class State {
	@Id
	@Column
	//@GeneratedValue//when uncomment this then problem in deleting 
	 private int stateid;
	 private String statename ;
	
	 //@Lob
	 //@Column(name="image")
	 private String image;
	 
	 @OneToMany(mappedBy="stateobject", fetch=FetchType.LAZY,cascade=CascadeType.ALL) //FK--fieldname
		private List<Packagem>packagelist;
	 
	 public State() {
		
	}
	public State(int stateid, String statename, String image) {
		
		this.stateid = stateid;
		this.statename = statename;
		this.image = image;
		
	}
	
	public List<Packagem> getPackagelist() {
		return packagelist;
	}
	public void setPackagelist(List<Packagem> packagelist) {
		this.packagelist = packagelist;
	}
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return String.format("StateDao [stateid=%s, statename=%s, image=%s]", stateid, statename, image);
	}
	
	
}
