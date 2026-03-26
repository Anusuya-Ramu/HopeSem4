package Day7;

class grandfather{
    public void retired(){
        System.out.println("i am retired and enjoying my life");
    }
}

class father extends grandfather{
    void business(){
        System.out.println("i am doing business and earning money");
    }
}

class son extends father{
    void job(){
        System.out.println("since ur going for job i'll give this business to ur sister");
    }
}

class daughter extends father{
     void notAccept(){
        System.out.println("i will not accept the business and will do my own work");
     }
}

public class Hierarchial {
    public static void main(String[] args) {
        son s = new son();
        s.job();
        s.business();
        s.retired();
        
        daughter d = new daughter();
        d.notAccept();
        d.business();
        d.retired();

        father f = new father();
        f.business();
        f.retired();

    }
}
