package com.jremind.exam04;

public class TvMain {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setType(new Tv());
		product.setModel("OLED TV");
		product.setCompany("±Ý¼º");
		
		Storage<Tv> storage = new StorageImplement<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);

	}

}
