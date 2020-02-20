package com.jbl.sandbox_java;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class TestBatching {

	public static void main(String[] args) {
		
		int nodeCnt = 3964;
		
		
		List<String> nodes = new ArrayList<String>();
		
		
		for(int c=0;c<nodeCnt;c++) {
			nodes.add("Item-"+c);
		}
		
		int j = 0;
		for ( int i = 50 ; i <= nodeCnt ; i = i + 50 ) {
			System.out.println("Processing "+j+" through "+i);
			
			List<String> slice = nodes.subList(j,i);	    
		    j = i;
		}

		if(j< nodeCnt) {
			System.out.println("Processing Remainder ("+j+" to "+nodeCnt+") ...");
			List<String> slice = nodes.subList(j,nodeCnt);	    
			
		}
	}

	
}
