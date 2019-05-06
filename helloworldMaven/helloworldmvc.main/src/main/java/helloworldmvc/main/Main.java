package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		View view = new View();
		
		Controller controller = new Controller(view, model);
		controller.run();
	}

}
