package webshop;


public class Webshop 
{
	private Klant guppie;
	private int klantLeeftijd = 4;
	
	public int prijs;
	public String item;

	boolean uitverkocht;
	boolean winkelIsSchoon;

	public Webshop()
	{
		uitverkocht = false;
		winkelIsSchoon = true;
	}

	public Klant getGuppie()
	{
		return guppie; 
	}

	public void setGuppie(Klant guppie)
	{
		if(guppie instanceof Klant)
		{
			this.guppie = guppie;
		}
		else
		{
			System.exit(0);
		}
		
	}

	public int getKlantLeeftijd()
	{
		return klantLeeftijd;
	}

	public void setKlantLeeftijd(int klantLeeftijd)
	{
		if(klantLeeftijd >= 0)
		{
			this.klantLeeftijd = klantLeeftijd;
		}
		else
		{
			System.exit(0);
		}
		
	}

	public boolean isUitverkocht()
	{
		return uitverkocht;
	}

	public void setUitverkocht(boolean uitverkocht)
	{
		if(uitverkocht == true || uitverkocht == false)
		{
			this.uitverkocht = uitverkocht;
		}
		else
		{
			System.exit(0);
		}
		
	}

	public boolean isWinkelIsSchool()
	{
		return winkelIsSchoon;
	}

	public void setWinkelIsSchoon(boolean winkelIsSchoon)
	{
		if(winkelIsSchoon == true || winkelIsSchoon == false)
		{
			this.winkelIsSchoon = winkelIsSchoon;
		}
		else
		{
			System.exit(0);
		}
		this.winkelIsSchoon = winkelIsSchoon;
	}

	
}






