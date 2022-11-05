import javax.swing.JOptionPane;
public class WeightBox2 extends Box2 {
int weight;
WeightBox2()
{
	super();
	weight=-1;
}
WeightBox2(int w,int l,int wi,int h)
{
weight=w;
length=l;
width=w;
height=h;
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
}
