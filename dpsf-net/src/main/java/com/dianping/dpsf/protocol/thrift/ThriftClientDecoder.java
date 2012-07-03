/**
 * 
 */
package com.dianping.dpsf.protocol.thrift;

import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

/**    
 * <p>    
 * Title: ThriftClientDecoder.java   
 * </p>    
 * <p>    
 * Description: 描述  
 * </p>   
 * @author saber miao   
 * @version 1.0    
 * @created 2010-9-15 上午11:42:35   
 */
public class ThriftClientDecoder extends ThriftDecoder{

	/* (non-Javadoc)
	 * @see com.dianping.dpsf.protocol.thrift.ThriftDecoder#readTBase()
	 */
	@Override
	protected TBase readTBase(TProtocol protocol) throws TException {
		Response response = new Response();
		response.read(protocol);
		return response;
	}

	/* (non-Javadoc)
	 * @see com.dianping.dpsf.protocol.thrift.ThriftDecoder#wrappedObject(org.apache.thrift.TBase)
	 */
	@Override
	protected Object wrappedObject(TBase tb)  throws Exception{
		return new ThriftResponse((Response)tb);
	}

}
