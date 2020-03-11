package Intr.org;

public class Desktop implements  HardWare,Software {
	@Override
	public void softwaeResources() {
System.out.println("os");
	}
	@Override
	public void hardwareResources() {
		System.out.println("Harddisk");

	}
	
	public void desktopModel1() {
		System.out.println("Model");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources();
		d.softwaeResources();
		
	}

}
