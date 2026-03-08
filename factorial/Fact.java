package factorial;

public class Fact {
    int n;
    public int fact(int n){
        int f=1;
        this.n=n;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}
