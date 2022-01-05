class Etudiant
{
	/** Attributs */
	String nom;
	String prenom;
	int numero;  // numero de l’etudiant
	static int nbretucrees=0;  // nombre d’etudiants crees
	String [] courssuivis;  // tableau contenant les cours suivis
	int notes[]; // tableau des notes pour chaque cours suivis
	
	public Etudiant(String nom, String prenom, String [] cours)
	{
		this.nom=nom;
		this.prenom=prenom;
		courssuivis=new String [cours.length];
		for(int i=0; i<cours.length; i++)
		{
			courssuivis[i]=cours[i];
		}
		nbretucrees++;
		numero=nbretucrees;
		notes=new int[cours.length];
		for(int i=0; i<notes.length;i++)
		{
			notes[i]=0;
		}
	}
	public Etudiant(Etudiant a)
	{
		nom=a.nom;
		prenom=a.prenom;
		numero=a.numero;
		courssuivis=new String[a.courssuivis.length];
		for(int i=0;i<courssuivis.length; i++)
		{
			courssuivis[i]=a.courssuivis[i];
		}
		notes=new int [a.notes.length];
		for(int i=0; i<notes.length; i++)
		{
			notes[i]=a.notes[i];
		}
	}
	public boolean compare(Etudiant a)
	{
		boolean var=true;
		var=(nom==a.nom && prenom==a.prenom && numero==a.numero);
		int i=0;
		while(var && i<courssuivis.length)
		{
			if(courssuivis[i]=!a.courssuivis[i])
			{
				var=false;
			}
			i++;
		}
		i=0;
		while(var && i<notes.length)
		{
			if(notes[i]=!a.notes[i])
			{
				var=false;
			}
			i++;
		}
		return var;
	}
	public String transforme()
	{
		String a="";
		a=nom+" "+prenom;
		return a;
	}
	public void affiche()
	{
		System.out.println(nom+" "+prenom+" "+numero);
	}
}
