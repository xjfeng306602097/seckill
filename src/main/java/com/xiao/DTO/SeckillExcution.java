/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.DTO;

import com.xiao.bean.SuccessKilled;

/**
 * @author Administrator
 *
 */
public class SeckillExcution {

	private long seckillId;

	private int state;

	private String stateInfo;

	private SuccessKilled successKilled;

	public SeckillExcution(long seckillId, int state, String stateInfo, SuccessKilled successKilled) {
		super();
		this.seckillId = seckillId;
		this.state = state;
		this.stateInfo = stateInfo;
		this.successKilled = successKilled;
	}

	public SeckillExcution(long seckillId, int state, String stateInfo) {
		super();
		this.seckillId = seckillId;
		this.state = state;
		this.stateInfo = stateInfo;
	}

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
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return the stateInfo
	 */
	public String getStateInfo() {
		return stateInfo;
	}

	/**
	 * @param stateInfo
	 *            the stateInfo to set
	 */
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	/**
	 * @return the successKilled
	 */
	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}

	/**
	 * @param successKilled
	 *            the successKilled to set
	 */
	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}

	@Override
	public String toString() {
		return "SeckillExcution [seckillId=" + seckillId + ", state=" + state + ", stateInfo=" + stateInfo
				+ ", successKilled=" + successKilled + "]";
	}

}
