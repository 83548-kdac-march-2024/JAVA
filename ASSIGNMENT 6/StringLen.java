package com.sunbeam.enitity;

import com.sunbeam.exception.ExceptionLineTooLong;

public class StringLen {
	private String msg;
	 int len;
	
//	public void countStringLength(String msg) throws ExceptionLineTooLong {
//		if(msg.length() >80) {
//			throw new ExceptionLineTooLong();
//		}
//		
//			this.msg=msg;
//		
//		
//	}
	
//	public void setMsg(String msg) throws ExceptionLineTooLong
//	{
//		if(msg.length() >80) {
//			throw new ExceptionLineTooLong();
//		}
//		
//			
//		this.msg = msg;
//	}


//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "[ "+msg+" ]";
//	}
//

	public void setString(String s) throws ExceptionLineTooLong 
	{
		if(msg.length() >5) 
		{
			throw new ExceptionLineTooLong();
		}
			
		this.msg = msg;
		
	}

}
