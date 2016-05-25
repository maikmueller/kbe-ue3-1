package de.htw_berlin.ai_bachelor.kbe.annotation;

@CreationInfo(description = "ein Rechteck", tags = {"Rechteck", "Geometrie"},
		baseclass = Form.class, interfaces = {Moveable.class, Rotatable.class})

public class Rectangle extends Form
	implements Moveable, Rotatable
{
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public void rotate(int angle) {
		System.out.println("rotate");
		
	}
	@Override
	public void move(int x, int y) {
		setX(getX() + x);
		setY(getY() + y);
	}	
	
}
