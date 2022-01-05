public class TableauComplexes
{
	private Complexe t[];
	public TableauComplexes(int taille) //Constructeur qui génere un tableau des complexes aléatoire à partir de la taille
	{
		t=new Complexe[taille];
		for(int i=0; i<taille; i++)
		{
			t[i]=new Complexe();
		}
	}
	public void affiche() //méthode pour afficher les complexes du tableau
	{
		for(int i=0; i<t.length; i++)
		{
			t[i].affiche();
		}
	}
	public boolean existence(Complexe a) //méthode pour vérifier l'existence d'un complexe dans le tableau
	{
		boolean var=false;
		int i=0;
		while (var==false && i<t.length)
		{
			var = t[i].compare(a);
			i++;
		}
		return var;
	}
	public void echange(int i, int j) //méthode pour échanger deux cases du tableau
	{
		Complexe a=new Complexe();
		a=t[i];
		t[i]=t[j];
		t[j]=a;
	}
	public void supprime (int a)//méthode pour supprimer une case de tableau à partir de son indice
	{
		Complexe t2[];
		t2=new Complexe[t.length-1];
		for(int i=0; i<a-1; i++)
		{
			t2[i]=t[i];
		}
		for(int i=a+1; i<t.length; i++)
		{
			t2[i-1]=t[i];
		}
		t=new Complexe[t2.length];
		for(int i=0; i<t2.length; i++)
		{
			t[i]=t2[i];
		}
	}
	public void ajoute(Complexe a)
	{
		Complexe t2[];
		t2=new Complexe[t.length+1];
		for(int i=0; i<t.length; i++)
		{
			t2[i]=t[i];
		}
		t2[t.length]=a;
		t=new Complexe[t2.length];
		for(int i=0; i<t2.length; i++)
		{
			t[i]=t2[i];
		}
	}
	
}
