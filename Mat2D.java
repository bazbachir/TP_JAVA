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
}
