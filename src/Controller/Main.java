package Controller;

import java.io.IOException;
import View.RegistrationView;
import model.RegistrationModel;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    RegistrationView theView = new RegistrationView();
    RegistrationModel theModel = new RegistrationModel();
    RegistrationController theController = new RegistrationController(theView, theModel);
    theView.setVisible(true);
  }

}
