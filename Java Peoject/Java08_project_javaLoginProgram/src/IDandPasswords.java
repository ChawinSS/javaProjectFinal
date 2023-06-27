import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("test","11111");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}