package helloworldmvc.model;

import helloworldmvc.Contract.IModel;

public class Model implements IModel {
	public String getHelloWorld() {
		DAOHelloWorld yes = new DAOHelloWorld();
		yes.readFile();
		return yes.getHelloWorldMessage();
	}
}
