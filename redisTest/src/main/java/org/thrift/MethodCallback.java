package org.thrift;

import org.apache.thrift.async.AsyncMethodCallback;

public class MethodCallback implements AsyncMethodCallback {
	Object res = null;

	public Object getResult() {
		// 返回结果值
		return this.res;
	}

	// 处理服务返回的结果值
	public void onComplete(Object response) {
		System.out.println(response);
		this.res = response;
	}

	// 处理调用服务过程中出现的异常
	@Override
	public void onError(Exception ex) {
		ex.printStackTrace();
	}
}
