public class moreStuff<I, D, S> {
    public I arv;
    public D komagaArv;
    public S sõna;

    public moreStuff(I arv, D komaArv, S sõna){
        this.arv = arv;
        this.komagaArv = komagaArv;
        this.sõna = sõna;
    }
    public I getArv(){
        return arv;
    }
    public D getKoma(){
        return komagaArv;
    }
    public S getSõna(){
        return sõna;
    }
}
