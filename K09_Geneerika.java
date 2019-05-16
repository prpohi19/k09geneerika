import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Hinne<T>
{
	public T 		tahis;				// Hinde tähis märgina, täisarvuna, murdarvuna või sõnena.
	public boolean 	labitud;			// Kas see hinne tähendab, et töö on läbitud või mitte (positiivne tulemus või negatiivne tulemus).
	public double 	protsent;			// Millisele soorituse taseme protsendile see hinne vastab kui hinne ei ole juba antud protsendina.

	Hinne(T tahis, Hindamissysteem <T> sys)
	{		
		this.tahis = tahis;		
		this.protsent = sys.teisenda_protsendiks(tahis);
		this.labitud = sys.kas_on_labitud(tahis);
	}
	Hinne(double protsent, Hindamissysteem <T> sys)
	{
		this.protsent = protsent;
		this.tahis = sys.teisenda_tahiseks(protsent);
		this.labitud = sys.kas_on_labitud(tahis);
	}
}

class Hinded<V>
{
	ArrayList <Hinne<V>> hinded;

	Hinded()
	{
		this.hinded = new ArrayList <Hinne<V>>();
	}
	void lisa(Hinne<V> hinne)
	{
		this.hinded.add(hinne);
	}
	boolean kas_koik_on_labitud()
	{
		boolean summa = true;
		for (Hinne<V> hinne : hinded)
		{
			summa = summa && hinne.labitud;
		}
		return summa && (hinded.size() > 0);
	}
	double leia_keskmine_protsendina()
	{
		double summa = 0.0;
		for (Hinne<V> hinne : hinded)
		{	
			summa += hinne.protsent;
		}
		return ymarda( (summa / hinded.size()), 2 );			
	}

	// Aus ümardamine.
	private static double ymarda(double algne, int komakohtade_arv)
	{
		if (komakohtade_arv < 0) throw new IllegalArgumentException();
	 
		BigDecimal bd_arv = new BigDecimal(Double.toString(algne));
		
		bd_arv = bd_arv.setScale(komakohtade_arv, RoundingMode.HALF_UP);
		
		return bd_arv.doubleValue();
	}
}

abstract class Hindamissysteem<U>
{
	ArrayList <U> tahised;
	U min_labitud;

	public abstract boolean kas_on_labitud(U tahis);
	public abstract double teisenda_protsendiks(U tahis);
	public abstract U teisenda_tahiseks(double protsent);
}


public class K09_Geneerika
{
	public static void main(String[] args)
	{
		Hindamissysteem <Character> systeem = new Eesti_TLU_eristav();
		Hinded <Character> muusikaopetuse_hinded = new Hinded <> ();

		muusikaopetuse_hinded.lisa(new Hinne <Character>(new Character('B'), systeem));
		muusikaopetuse_hinded.lisa(new Hinne <Character>(new Character('F'), systeem));
		muusikaopetuse_hinded.lisa(new Hinne <Character>(new Character('A'), systeem));

		System.out.println(muusikaopetuse_hinded.kas_koik_on_labitud());
		System.out.println(
			String.format( "%.2f",
				muusikaopetuse_hinded.leia_keskmine_protsendina() ));
	}	
}


class Eesti_TLU_eristav extends Hindamissysteem <Character>
{
	public Eesti_TLU_eristav()
	{
	  	this.min_labitud = 'E';
	  	this.tahised = new ArrayList <Character>()	{{	add('F');	
														add('E');
														add('D');
														add('C');
														add('B');
														add('A'); }};
	}
	
	public boolean kas_on_labitud(Character tahis)
	{
		return this.tahised.indexOf(tahis) >= this.tahised.indexOf(this.min_labitud);
	}
	
	public double teisenda_protsendiks(Character tahis)
	{
		switch(tahis)
		{
			case 'A' : return 1.00;
			case 'B' : return 0.90;
			case 'C' : return 0.80;
			case 'D' : return 0.70;
			case 'E' : return 0.60;
			case 'F' : return 0.50;
			default  : return 0.00;
		}
	}
	public Character teisenda_tahiseks(double protsent)
	{
			 if(protsent > 0.90) return 'A' ;
		else if(protsent > 0.80) return 'B' ;
		else if(protsent > 0.70) return 'C' ;
		else if(protsent > 0.60) return 'D' ;
		else if(protsent > 0.50) return 'E' ;
		else 					 return 'F' ;
	}
}