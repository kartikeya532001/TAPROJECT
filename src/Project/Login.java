//Data for login

package Project;

import org.testng.annotations.DataProvider;

public class Login {
 

  @DataProvider (name="login")
  public Object[][] login() {
	  Object data[][] = new Object[3][2];
	  data[0][0]="500078285@stu.upes.in.ac";
	  data[0][1]="Khanna@5301";
	  data[1][0]="500076693@stu.upes.ac.in";
	  data[1][1]="Khanna@5301";
	  data[2][0]="500076748@stu.upes.ac.in";
	  data[2][1]="Khanna@5301";
	  return data;
  }
}
