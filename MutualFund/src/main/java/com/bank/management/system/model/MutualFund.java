package com.bank.management.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MutualFund")
public class MutualFund {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	        @Column 
	        private String name;
			public long getId() {
				return id;
			}
			public void setId(long id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public MutualFund(long id, String name) {
				super();
				this.id = id;
				this.name = name;
			}
			public MutualFund() {
				super();
				// TODO Auto-generated constructor stub
			}
			@Override
			public String toString() {
				return "MutualFund [id=" + id + ", name=" + name + "]";
			}
	        
	       
}
