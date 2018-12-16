package beans;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestResponse {

	private String username;
	private String serv;
	private String invokeDate;
	private String invokeTime;
	private ArrayList<String> tobeInvokeServsList;

	public RestResponse() {
		tobeInvokeServsList = new ArrayList<>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getServ() {
		return serv;
	}

	public void setServ(String serv) {
		this.serv = serv;
	}

	public String getInvokeDate() {
		return invokeDate;
	}

	public void setInvokeDate(String invokeDate) {
		this.invokeDate = invokeDate;
	}

	public String getInvokeTime() {
		return invokeTime;
	}

	public void setInvokeTime(String invokeTime) {
		this.invokeTime = invokeTime;
	}

	public void addToServsList(String serv) {
		tobeInvokeServsList.add(serv);
	}
}
