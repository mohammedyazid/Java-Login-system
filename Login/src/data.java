import java.util.HashMap;

public class data {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	data(){
		
		logininfo.put("yazid","yazid");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}