public class Complexe
{
	private double x;
	private double y;
	public Complexe(double a, double b) //Constructeur à deux paramètres 
	{
		x=a;
		y=b;
	}
	public Complexe() //Constructeur initilisant un nombre complexe aléatoire
	{
		x=Math.random()*10;
		y=Math.random()*10;
	}
	public void affiche()
	{
		if(y<0)
		{
			System.out.println(x+""+y+"i");
		}
		else
		{
			System.out.println(x+"+"+y+"i");
		}
		
	}
	public Complexe conjuge()
	{
		Complexe a=new Complexe(x, -y);
		return a;
	}
	public void ajoute(Complexe a)
	{
		x=x+a.x;
		y=y+a.y;
	}
	public boolean compare(Complexe a)
	{
		return(a.x==x && a.y==y);
	}
	
}
