/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.exception;

/**
 * @author Administrator
 *
 */
public class SeckillClosedException extends SeckillException {

	public SeckillClosedException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillClosedException(String message) {
		super(message);
	}

}
