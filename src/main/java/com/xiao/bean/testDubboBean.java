/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.bean;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
//作为服务提供方传输的bean必须实现Serializable实现序列化
public class testDubboBean implements Serializable{
	private String name;

	private String description;
	
	private int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "testDubboBean [name=" + name + ", description=" + description + ", age=" + age + "]";
	}

	
}
