package interfaces;

import domain.SystemClass;

public class Runneable {

   public static void main(String[] args) {
       SystemClass system= new SystemClass();
       HomePage window = new HomePage(system);
       system.setMenuReference(window);
       window.setVisible(true);
    }
}
