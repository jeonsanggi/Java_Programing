package com.jremind.exam03;

public class Television implements RemoteControl{
	private int volumn;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolumn(int volumn) {
		// TODO Auto-generated method stub
		if(volumn > RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		}else if(volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		}else {
			this.volumn = volumn;
		}
		
		System.out.println("현재 TV 볼륨: " + volumn);
	}
	

}
