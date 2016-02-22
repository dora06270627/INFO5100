
public class interfaceTest {

	public static void main(String[] args) {
		Assignment5 interfaceTest = new Assignment5();
		Assignment5.Teenager Joe = interfaceTest.new HighSchoolStudent();
		Joe.play();
		//Assignment5.Driver Dora = new Assignment5().new AdultBusDriver();
		Assignment5.AdultBusDriver Dora = interfaceTest.new AdultBusDriver();
		Assignment5.Adult adultDora= Dora;
		adultDora.work();
		Assignment5.Driver driverDora=Dora;
		driverDora.drive();
		Assignment5.DriveTeacher Gia =new Assignment5().new DriveTeacher();
		Assignment5.Driver driverGia=Gia;
		driverGia.drive();
		Assignment5.Teacher teacherGia=Gia;
		teacherGia.teach();
	}

}
