package sample;

interface Writer
{
  public abstract void write();
	
}

class Pen implements Writer
{
	public void write()
	{
		System.out.println("in this writing by pen ");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("in this writing by pencil ");
	}
}
class Kit
{
	public void somthing(Writer p) 
	{
		p.write();
	}
}
public class Interface 
{

	public static void main(String[] args) 
	{
		Kit k =new Kit();
	   Writer p =new Pen();
	   Writer pc =new Pencil();
		k.somthing(pc);
		k.somthing(p);
	}

}
