package com.jremind.exam03;

public class Audio implements RemoteControl{
	private int volumn;
	private boolean mute;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolumn(int volumn) {
		// TODO Auto-generated method stub
		if(volumn > RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		}else if(volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		}else {
			this.volumn = volumn;
		}
		
		System.out.println("현재 Audio 볼륨: " + volumn);
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리");
		}else {
			System.out.println("Audio 무음 해제");
		}
	}
	
	
	
	
	
	

}
