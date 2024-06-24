package com.anu.tech.voltile;

public class SharedResource {
    private volatile boolean flag = false;

    public void setFlag() {
        flag = true;
    }

    public boolean isFlagSet() {
        return flag;
    }
    
    public static void main(String[] args) {
    	SharedResource resource=new SharedResource();
    	
		System.out.println("flag is "+resource.flag);
		resource.setFlag();
		System.out.println(resource.isFlagSet());

		
	}
}