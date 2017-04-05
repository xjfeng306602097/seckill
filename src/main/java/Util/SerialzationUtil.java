/**
 * @author xiaojunfeng
 * @version 1.0
 */
package Util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

/**
 * @author Administrator
 *
 */
public class SerialzationUtil {
	//通过concurrentHashMap保存对应的class及其schema
	private static Map<Class<?>, Schema<?>> cachedSchema = new ConcurrentHashMap<Class<?>, Schema<?>>();  
	
	//定义私有的构造函数，使其无法子类化
	private SerialzationUtil(){
		
	}
	
	/**
	 * 获取schema
	 * @param clazz
	 * @return
	 */
	private static <T> Schema<T> getSchema(Class<T> clazz){
		 Schema<T> schema = (Schema<T>) cachedSchema.get(clazz);  
	        if (schema == null) {  
	        	try {
					schema = (Schema<T>) RuntimeSchema.createFrom(clazz);
					if(schema != null){
						cachedSchema.put(clazz, schema);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }  
	        return schema;  
	}
	/**
	 * 序列化
	 * @param obj 对象
	 * @return
	 */
	public static <T> byte[] serializer(T obj){
		byte[] bytes = null;
		Class<T> clazz = (Class<T>) obj.getClass();
		LinkedBuffer linkedBuffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
		try {
			Schema<T> schema = getSchema(clazz);
			return ProtobufIOUtil.toByteArray(obj, schema, linkedBuffer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bytes;
	}
	/**
	 * 反序列化，获取对象
	 * @param data 二进制数组
	 * @param clazz 类型
	 * @return
	 */
	public static <T> T deserializer(byte[] data, Class<T> clazz){
		try {
			Schema<T> schema = getSchema(clazz);
			T instance = (T) schema.newMessage();
			ProtostuffIOUtil.mergeFrom(data, instance, schema);
			return instance;
		} catch (Exception e) {
			throw new IllegalStateException(e.getMessage(), e);
		}
	}
}
