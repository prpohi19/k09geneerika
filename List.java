public class List<H, N> {
    public H hinne;
    public N nimi;

    public List(H hinne, N nimi){
        this.hinne = hinne;
        this.nimi = nimi;
    }
    public N getName(){
        return nimi;
    }
    public H getGrade(){
        return hinne;
    }
}