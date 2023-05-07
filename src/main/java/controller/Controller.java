package controller;

import dao.DataAccessObject;
import dto.Byjus;

public class Controller {

	public static void main(String[] args) {
		
		//create object for table class
		Byjus byjus=new Byjus();
//		byjus.setId(1);
//		byjus.setName("vishnu");
//		byjus.setAddress("Tumkur");
		//create object for dao package class
		DataAccessObject accessobject= new DataAccessObject();
		//accessobject.insert(byjus);
		
	//	accessobject.update();
		//accessobject.fetch(1);
		accessobject.delete(1);
	}
}
