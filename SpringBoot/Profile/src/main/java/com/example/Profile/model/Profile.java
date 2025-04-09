package com.example.Profile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile {
		@Id
	    private Long id;
	    private String name;
	    private String gender;
	    private String color;
	    private int fontSize;
	    
	    public Profile(Long id, String name, String gender, String color, int fontSize) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.color = color;
			this.fontSize = fontSize;
		}
	    
	    
		public Profile() {
			super();
		}


		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getFontSize() {
			return fontSize;
		}
		public void setFontSize(int fontSize) {
			this.fontSize = fontSize;
		}
		
}


