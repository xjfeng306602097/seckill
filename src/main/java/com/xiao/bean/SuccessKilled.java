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
public class SuccessKilled implements Serializable{

	private long seckillId;

	private long userPhone;

	private short state;

	private Date createTime;

	// 多对一
	private Seckill seckill;

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
	 * @return the userPhone
	 */
	public long getUserPhone() {
		return userPhone;
	}

	/**
	 * @param userPhone
	 *            the userPhone to set
	 */
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * @return the state
	 */
	public short getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(short state) {
		this.state = state;
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

	/**
	 * @return the seckill
	 */
	public Seckill getSeckill() {
		return seckill;
	}

	/**
	 * @param seckill
	 *            the seckill to set
	 */
	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}

	@Override
	public String toString() {
		return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
				+ ", createTime=" + createTime + ", seckill=" + seckill + "]";
	}

}
