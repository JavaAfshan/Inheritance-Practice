import javax.swing.JOptionPane;

public class democlass {
	public static void main(String  args[]) {

char choice,choice1;
String Choice=new String();
do {
	Choice=JOptionPane.showInputDialog("Enter 1 for testing basic inheritance\nEnter 2 for testing the class Box\nEnter 3 for testing private Box\nEnter 0 for exit");
	choice=Choice.charAt(0);
	if(choice=='1')
	{
		subclass1 s2=new subclass1();
	superclass1 s1=new superclass1();
	
		do {
			Choice=JOptionPane.showInputDialog("Enter 1 for input the superclass\nEnter 2 for the input of subclass\nEnter 3 for the display of superclass\nEnter 4 for the display of subclass\nEnter 5 for sum of all the values\nEnter 0 for exit");
			choice1=Choice.charAt(0);
			if(choice1=='1')
			{
				s1.getdata();
			}
			else if(choice1=='2')
			{
				s2.getdata();
			}
			else if(choice1=='3')
			{
				s1.show();
			}
			else if(choice1=='4')
			{
				s2.show();
			}
			else if(choice1=='5')
			{
				s2.sum();
			}
			else if(choice1=='0')
			{
				JOptionPane.showMessageDialog(null, "Hope so it will improve your basic inheritance concepts");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please enter the right choice");
			}
		}while(choice1!=0);
	}
	else if(choice=='2')
	{
		WeightBox2 w=new WeightBox2();
		do {
			Choice=JOptionPane.showInputDialog("Enter 1 for input data\nEnter 2 for display data\nEnter 3 for calculating the volume\nEnter 0 for exit");
			choice1=Choice.charAt(0);
			if(choice1=='1')
			{
				w.getdata();
			}
			else if(choice1=='2')
			{
				w.Showdata();
			}
			else if(choice1=='3')
			{
				JOptionPane.showMessageDialog(null,"\nLength: "+w.length+"\nWidth: "+w.width+"\nHeight: "+w.height+"\nThe volume of this box is "+w.volume(),"Volume of the box",JOptionPane.PLAIN_MESSAGE);
			}
			else if(choice1=='0')
			{
				JOptionPane.showMessageDialog(null, "Hope so it will improve your inheritance concepts");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please enter the right choice");
			}
			
		}while(choice1!='0');
	}
	else if(choice=='3')
	{
		JOptionPane.showMessageDialog(null, "Object with different dimensions");
		
		WeightBox3 v1=new WeightBox3(2,3,4,5);
		v1.Showdata();
		JOptionPane.showMessageDialog(null, "The volume of this box is "+v1.volume(),"Volume",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Object with different dimensions");
		
		WeightBox3 v2=new WeightBox3(2,3,4,51);
		v2.Showdata();
		JOptionPane.showMessageDialog(null, "The volume of this box is "+v2.volume(),"Volume",JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "By Default Object");
		WeightBox3 v3=new WeightBox3();
		v3.Showdata();
		JOptionPane.showMessageDialog(null, "The volume of this box is "+v3.volume(),"Volume",JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Cube Object");
		WeightBox3 v4=new WeightBox3(2,3);
		JOptionPane.showMessageDialog(null, "The volume of this box is "+v4.volume(),"Volume",JOptionPane.PLAIN_MESSAGE);
		
		v4.volume();
		JOptionPane.showMessageDialog(null, "Passing Cube Object");
		WeightBox3 v5=new WeightBox3(v4);
		v5.Showdata();
		JOptionPane.showMessageDialog(null, "The volume of this box is "+v5.volume(),"Volume",JOptionPane.PLAIN_MESSAGE);
		
		
	}
	else if(choice=='0')
	{
		JOptionPane.showMessageDialog(null, "Hope so it will improve your inheritance concepts");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Please enter the right choice");
	}
}while(choice!='0');

}
	}
