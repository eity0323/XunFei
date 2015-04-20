package com.iflytek.ise.result;

public class FinalResult extends Result {

	public int ret;

	public float total_score;

	@Override
	public String toString() {
		return "返回值：" + ret + "，总分：" + total_score;
	}
}
