import javax.swing.JOptionPane;
public class Box2 {
int length,width,height;
Box2()
{
length=width=height=-1;	
}
Box2(int l,int w,int h)
{
length=l;
width=w;
height=h;
}
Box2(Box2 ob)
{
length=ob.length;
height=ob.height;
width=ob.width;
}
Box2(int length)
{
this.length=width=height=length;	
}
int volume()
{
return length*height*width;	
}

void getdata()
{
	
	String dimension=JOptionPane.showInputDialog("Enter the length of the box");
	length=Integer.parseInt(dimension);
	dimension=JOptionPane.showInputDialog("Enter the width of the box");
	width=Integer.parseInt(dimension);
	dimension=JOptionPane.showInputDialog("Enter the height of the box");
	height=Integer.parseInt(dimension);

}

String showdata()
{
String data="";
data=data+"The length of the box is "+length+"\nThe width of the box is "+width+"\nThe height of the box is "+height+"\n";
return data;
}
}
