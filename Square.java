package Reflection;

/*
 * @author Sachintha Ashika Bandara Yapa
 */

public class Square{
	public short length;
	private short width;
	
	public Square(int l, int w) {
		this.length = (short) l;
		this.width = (short) w;
	}
	public short getLength() {
		return length;
	}
	public void setLength(int l) {
		this.length = (short) l;
	}
	public short getWidth() {
		return width;
	}
	public void setWidth(int w) {
		this.width = (short) w;
	}
	public short getArea() {
		return (short) (length*width);
	}
	public short getDiagonalLength() {
		return (short) Math.sqrt(width*length+width*length);
	}
	public String toString() {
		return String.format(("l: %d, w:%d"), length, width);
	}
}

