/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.exception;

/**
 * @author Administrator
 *
 */
public class SeckillRepeatException extends SeckillException {

	public SeckillRepeatException(String message) {
		super(message);
	}

	public SeckillRepeatException(String message, Throwable cause) {
		super(message, cause);
	}

}
