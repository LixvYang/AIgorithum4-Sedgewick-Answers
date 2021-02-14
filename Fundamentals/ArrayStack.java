package Fundamentals;

public class ArrayStack {
    //声明操作
    private String[] items;
    private int count;
    private int n;

    public ArrayStack(int n){
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    public boolean push(String item){
        if(count == n) return flase;
        items[count] = item;
        ++count;
        return true;
    }

    public String pop(){
        if(count==0)return null;
        String tmp = items[count-1];
        --count;
        return tmp;
    }
}