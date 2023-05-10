package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Size of the desktop is 1280*720");
}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}
}
