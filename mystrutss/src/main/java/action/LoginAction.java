package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	String uname=request.getParameter("uname");
	if(uname.equals("mathew")) {
		return "login.success";
	}
	else{
		return "login.register";
	}
	
}
}
