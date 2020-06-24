package com.jremind.exam03;

public class RemoteControlMain {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
//		rc = new RemoteControl() {
//			private int volumn;
//
//			@Override
//			public void turnOn() {
//				// TODO Auto-generated method stub
//				System.out.println("TV를 켭니다");
//				
//			}
//
//			@Override
//			public void turnOff() {
//				// TODO Auto-generated method stub
//				System.out.println("TV를 끕니다.");
//				
//			}
//
//			@Override
//			public void setVolumn(int volumn) {
//				// TODO Auto-generated method stub
//				if(volumn > RemoteControl.MAX_VOLUMN) {
//					this.volumn = RemoteControl.MAX_VOLUMN;
//				}else if(volumn < RemoteControl.MIN_VOLUMN) {
//					this.volumn = RemoteControl.MIN_VOLUMN;
//				}else {
//					this.volumn = volumn;
//				}
//				
//				System.out.println("현재 TV 볼륨: " + volumn);
//			}
//		};
		
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
//		rc = new RemoteControl() {
//			
//			private int volumn;
//
//			@Override
//			public void turnOn() {
//				// TODO Auto-generated method stub
//				System.out.println("Audio를 켭니다.");
//				
//			}
//
//			@Override
//			public void turnOff() {
//				// TODO Auto-generated method stub
//				System.out.println("Audio를 끕니다.");
//				
//			}
//
//			@Override
//			public void setVolumn(int volumn) {
//				// TODO Auto-generated method stub
//				if(volumn > RemoteControl.MAX_VOLUMN) {
//					this.volumn = RemoteControl.MAX_VOLUMN;
//				}else if(volumn < RemoteControl.MIN_VOLUMN) {
//					this.volumn = RemoteControl.MAX_VOLUMN;
//				}else {
//					this.volumn = volumn;
//				}
//				
//				System.out.println("현재 Audio 볼륨: " + volumn);
//			}
//		};
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}
}
