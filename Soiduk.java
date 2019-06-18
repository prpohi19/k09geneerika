public abstract class Soiduk {
	String regnr = "";
	String mark = "";
	String model = "";

	public Soiduk(String regnr, String mark, String model){
		this.regnr=regnr;
		this.mark=mark;
		this.model=model;
	}

    public String toString() {
        return "Reg. märk: "+this.regnr+" Mark: "+this.mark+" Mudel: "+this.model;
    }
}
