package com.iflytek.demo;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;
import com.zms.xunfei.R;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		// 应用程序入口处调用,避免手机内存过小,杀死后台进程后通过历史intent进入Activity造成SpeechUtility对象为null
		// 注意：此接口在非主进程调用会返回null对象，如需在非主进程使用语音功能，请增加参数：SpeechConstant.FORCE_LOGIN+"=true"
		// 参数间使用“,”分隔。
		// 设置你申请的应用appid
		SpeechUtility.createUtility(MyApplication.this, "appid="
				+ getString(R.string.app_id));
		super.onCreate();
	}
}
