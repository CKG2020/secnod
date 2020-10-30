package org.thrift.idl.impl;

import org.apache.thrift.TException;
import org.thrift.idl.CommonRet;
import org.thrift.idl.MsgObject;
import org.thrift.idl.IProtocalService;

public class ProtocalService implements IProtocalService.Iface{

	public boolean commonAnswer(CommonRet commonRet) throws TException {
		System.out.println( "Todo commonAnswer" );
		return false;
	}

	public boolean upData(MsgObject msgObject) throws TException {
		System.out.println( "Todo upData" );
		return false;
	}

}
