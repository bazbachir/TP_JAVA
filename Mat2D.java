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
		for (int j=0; j<T[i-1].length;j++)
		{
			var=var+T[i-1][j];
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
			var=var+somme1Ligne(i+1);
		}
		return var;
	}
	public double moyenne() //méthode qui calcule la moyenne des élements de la table
	{
		return (sommeElements()/nombreElements());
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
				if(T[i][j]==a)
				{
					var=true;
				}
				j++;
			}
			j=0;
			i++;
		}
		return var;
	}
	public static void main(String args[]) //le main pour tester les différentes méthodes
	{
		double [][] tableau ={{7,3,1,5},{1,2},{55}, {4,8,9}};
		Mat2D mat = new Mat2D(tableau);
		mat.affiche();
		System.out.println("La somme des élements de la 2 eme ligne: "+mat.somme1Ligne(2));
		System.out.println("Le nombre d'élements du tableau est: "+mat.nombreElements());
		System.out.println("La somme des élements du tableau est : "+mat.sommeElements());
		System.out.println("La moyenne est: "+mat.moyenne());
		System.out.println("Le plus grand élement est: "+mat.elementPlusGrand());
		System.out.println("existe il le nombre 55 dans le tableau? ... "+mat.existence(55));
		
	}
}
