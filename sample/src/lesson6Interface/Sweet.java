package lesson6Interface;

public abstract class Sweet implements Food {

	public Sweet()
	{
		System.out.println("IS SWEET");
	}
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}

}
