public class Car extends Soiduk {
  private boolean myydud = false;

	public Car(String regnr, String mark, String model){
		super(regnr, mark, model);
	}

  public boolean onMyydud() {
    return myydud;
  }

  public void MyyAuto(){
    if(this.myydud){
      System.out.println(this+" Auto on juba müüdud");
      return;
    }
    myydud = true;
		System.out.println(this+" Auto müüdud.");
  }
}
