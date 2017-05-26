package Application.Controller.Pattern;
import java.util.HashMap;

public class appController {

	private HashMap<String, appHandler> handlerMap = new HashMap();
	
	public void mapCommand(String command, appHandler aHanlder){
		handlerMap.put(command, aHanlder);
	}
	
	public void handleRequest(String msg, HashMap<String, Object> data){
		appHandler aHandle = handlerMap.get(msg);
		aHandle.handler(data);
	}
}
