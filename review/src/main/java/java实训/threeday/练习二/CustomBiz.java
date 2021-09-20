package java实训.threeday.练习二;


public class CustomBiz {
    String names[] ;

    public CustomBiz(String[] names) {
        this.names = names;
    }

    public void addName(String name, int i){
       this.names[i]=name;
    }
}
