public class principal
{
	public static void main(String args[])
	{
		Complexe a=new Complexe(2, 3);
		Complexe b=new Complexe();
		a.affiche();
		a.conjuge().affiche();
		a.ajoute(b);
		b.affiche();
		System.out.println(a.compare(b));
		System.out.println(" Le tableau des complexes ....");
		TableauComplexes t=new TableauComplexes(0);
		t.ajoute(a);
		t.ajoute(b);
		t.affiche();
	}
}
