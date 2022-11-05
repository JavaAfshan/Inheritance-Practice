import javax.swing.JOptionPane;
public class WeightBox3 extends Box2 {
private int weight;
WeightBox3()
{
	super();
	weight=-1;
}
WeightBox3(int w,int l,int wi,int h)
{
weight=w;
length=l;
width=wi;
height=h;
}
WeightBox3(int l,int w)
{
length=width=height=l;
weight=w;
}
WeightBox3(WeightBox3 v)
{
	weight=v.weight;
	length=v.length;
	width=v.width;
	height=v.height;
}
void getdata()
{
super.getdata();
String dimension=JOptionPane.showInputDialog("Enter the weight of the box");
weight=Integer.parseInt(dimension);
}
void Showdata()
{
	JOptionPane.showMessageDialog(null, super.showdata()+"The weight of the box is "+weight,"Dimensions of the box",JOptionPane.PLAIN_MESSAGE);
}
int volume()
{
return super.volume();	
}
int getlength()
{
return length;	
}
int getwidth()
{
return width;	
}
int getheight()
{
return height;	
}
}
