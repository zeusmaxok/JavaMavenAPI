package RestFulServices;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;

import beans.RestResponse;

public class UsernameTool {

	public static String getUsernameRange(String username, String serv) {
		
		System.out.println("UsernameTool getUsernameRange is called");
		
		String result = "";
		
		char initial = username.charAt(0);
		
		RestResponse res = new RestResponse();
		
		res.setUsername(username);
		res.setServ(serv);
		res.setInvokeDate(java.time.LocalDate.now().toString());
		res.setInvokeTime(java.time.LocalTime.now().toString());
		
		
		
		if((initial >= 'A' && initial <= 'L')||(initial >= 'a' && initial <= 'l')) {
			//return Json
			
			Gson gson = new Gson();
			
			result = gson.toJson(res);
			
			
		}else if((initial >= 'M' && initial <= 'Z')||(initial >= 'm' && initial <= 'z')) {
			
			// return xml
			StringWriter sw = new StringWriter();
			try {
				JAXBContext context = JAXBContext.newInstance(RestResponse.class);
				Marshaller m = context.createMarshaller();
				
				m.marshal(res, sw);
				
				result = sw.toString();
				
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
		return result;
		
	}
	
}
