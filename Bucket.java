public class Bucket <T1, T2> {

    private T1 content;
    private T2 volume;

    public Bucket(T1 content, T2 volume) {
        this.content = content;
        this.volume = volume;
    }

    public T1 getContent() {
        return content;
    }

    public T2 getVolume(){
        return volume;
    }
}