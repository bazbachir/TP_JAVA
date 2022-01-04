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
}
