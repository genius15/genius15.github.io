package com.sogou.mobiletoolassist.contact;
import com.google.gson.annotations.SerializedName;

public class contactInfo {
	@SerializedName("email")
	public String email="";
	
	@SerializedName("id")
	public int id=-1;
	
	@SerializedName("name")
	public String name="";
	
	@SerializedName("userGroupIds")
	public String[] userGroupIds=null;
	
}
