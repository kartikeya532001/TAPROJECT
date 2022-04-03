// Data for signup

package Project;

import org.testng.annotations.DataProvider;

public class SignupData {


  @DataProvider (name="Signup")
  public Object[][] register() {
	  Object data[][] = new Object[3][4];
	  data[0][0]="Kartikeya";
	  data[0][1]="Khanna";
	  data[0][2]="500078285@stu.upes.in.ac";
	  data[0][3]="Khanna@5301";
	  data[1][0]="Pratham";
	  data[1][1]="Tyagi";
	  data[1][2]="500076693@stu.upes.ac.in";
	  data[1][3]="Khanna@5301";
	  data[2][0]="Aditya";
	  data[2][1]="Raj";
	  data[2][2]="500076748@stu.upes.ac.in";
	  data[2][3]="Khanna@5301";
	  return data;
  }
}



