/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.exception;

/**
 * @author Administrator
 *
 */
public class SeckillException extends RuntimeException {

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillException(String message) {
		super(message);
	}

}
