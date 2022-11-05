import javax.swing.JOptionPane;
public class subclass1 extends superclass1 {

	int k;
	subclass1()
	{
	super();
	 k=0;
	}
	void show()
	{
		JOptionPane.showMessageDialog(null, "The first number is "+i+"\nThe second number is "+j+"\nThe third number is "+k);
	}
	void getdata()
	{
		super.getdata();
		String K=JOptionPane.showInputDialog("Enter the third value");
		k=Integer.parseInt(K);
	}
	void sum()
	{
		JOptionPane.showMessageDialog(null, "The sum of "+i+", "+j+" and "+k+" is "+(i+j+k),"Sum",JOptionPane.PLAIN_MESSAGE);
	}
}
