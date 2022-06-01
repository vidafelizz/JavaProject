package ch07;

public class Television {
	// 멤버변수(전역변수)
	int channel;   // 채널번호
	int volume;	   // 음크기
	boolean onOff; // 전원상태
	
	void print() {
		System.out.println("채널은 " + channel);
	}
	int getChannel() {
		return channel;
	}
	int setChannel(int ch) {
		return channel = ch;
	}
}
