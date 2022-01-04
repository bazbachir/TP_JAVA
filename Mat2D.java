public class Mat2D
{
	private double T[][];
	Mat2D(double a[][]) //Constructeur
	{
		T=new double [a.length][];
		for(int i=0; i<a.length; i++)
		{
			T[i]=new double [a[i].length];
			for(int j=0; j<a[i].length;j++)
			{
				T[i][j]=a[i][j];
			}
		}
	}
	public void affiche() //méthode pour l'affichage des élements du tableau 
	{
		System.out.println("Les élements du tableau sont:");
		for(int i=0; i<T.length; i++)
		{
			for(int j=0; j<T[i].length; j++)
			{
				System.out.print(T[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public double somme1Ligne(int i) //méthode qui retourne la somme des élements d'une ligne
	{
		double var=0;
		for (int j=0; j<T[i].length;j++)
		{
			var=var+T[i][j];
		}
		return var;
	}
	public int nombreElements() //méthode qui calcule le nombre d'élements d'un tableau 2D
	{
		int a=0;
		for(int i=0; i<T.length;i++)
		{
			a=a+T[i].length;
		}
		return a;
	}
	public double sommeElements() //méthode qui calcule la somme des élements du tableau
	{
		double var=0;
		for(int i=0; i<T.length;i++)
		{
			var=var+somme1Ligne(i);
		}
		return var;
	}
	public double moyenne() //méthode qui calcule la moyenne des élements de la table
	{
		return (sommeElements()/nombreElements);
	}
	public double elementPlusGrand() //méthode qui retourne le plus grand élement du tableau
	{
		double var;
		var=T[0][0];
		for(int i=0;i<T.length;i++)
		{
			for(int j=0; j<T[i].length;j++)
			{
				if(var < T[i][j])
				{
					var=T[i][j];
				}
			}
		}
		return var;
	}
	public boolean existence(double a) //méthode qui verifier l'existence d'un double donné dans le tableau
	{
		boolean var=false;
		int i=0;
		int j=0;
		while(var==false && i<T.length)
		{
			while(var==false && j<T[i].length)
			{
				var=(T[i][j]==a);
				j++;
			}
			i++;
		}
		return var;
	}
}
