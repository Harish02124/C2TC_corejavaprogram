//multiple inheritance - 
package Dayeight.interfaces.extendinginterfaces;

public class ExtendingInterfacesDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}