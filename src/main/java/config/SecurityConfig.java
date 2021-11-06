package config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SecurityConfig {
	public static final String ROLE_MANAGER = "MANAGER";
	public static final String ROLE_EMPLOYEE = "EMPLOYEE";
	
	private static final Map<String, List<String>> mapConfig = new HashMap<String, List<String>>();
	
	static {
		Init();
	}

	public static void Init() {
		// TODO Auto-generated method stub
		List<String> urlPattern1 = new ArrayList<String>();
		urlPattern1.add("/userInfo");
		urlPattern1.add("/employeeTask");
		mapConfig.put(ROLE_EMPLOYEE, urlPattern1);
		
		List<String> urlPattern2 = new ArrayList<String>();
		urlPattern2.add("/userInfo");
		urlPattern2.add("/managerTask");
		mapConfig.put(ROLE_MANAGER, urlPattern2);
	}
	
	public static Set<String>getAllAppRoles(){
		return mapConfig.keySet();
	}
	
	public static List<String> getUrlPatternsForRole(String role){
		return mapConfig.get(role);
	}
}
