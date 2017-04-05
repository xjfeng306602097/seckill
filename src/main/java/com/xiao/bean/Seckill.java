/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class Seckill implements Serializable {

	private static final long serialVersionUID = 446734780507330194L;

	private long seckillId;

	private String name;

	private int number;

	private Date startTime;

	private Date endTime;

	private Date createTime;

	private String description;

	private String picture;

	/**
	 * @return the seckillId
	 */
	public long getSeckillId() {
		return seckillId;
	}

	/**
	 * @param seckillId
	 *            the seckillId to set
	 */
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Seckill [seckillId=" + seckillId + ", name=" + name + ", number=" + number + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", createTime=" + createTime + ", description=" + description + ", picture="
				+ picture + "]";
	}

}
