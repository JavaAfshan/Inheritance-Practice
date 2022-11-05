import javax.swing.JOptionPane;
public class superclass1 {
int i,j;
superclass1()
{
i=0;j=0;	
}
void show()
{
	JOptionPane.showMessageDialog(null, "The First value is "+i+"\nThe second value is "+j);
}
void getdata()
{
String I=JOptionPane.showInputDialog("Enter the first value: ");
i=Integer.parseInt(I);
String J=JOptionPane.showInputDialog("Enter the second value: ");
j=Integer.parseInt(J);
}
}
