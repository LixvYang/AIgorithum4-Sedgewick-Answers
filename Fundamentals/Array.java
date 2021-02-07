package array;

public class Array {
    //定义数组保存数据
    public int data[];
    //定义数组长度
    private int n;
    //定义数组中元素的个数
    private int count;

    //构造数组
    //构造方法，定义数组大小
    public Array(int capacity){
        this.data = new int[capacity];
        this.n = capacity;
        this.count=0;//一开始一个数都没有存所以为0
    }

    //根据索引，找到数据中的元素并返回
    public int find(int index){
        if (index<0 || index>=count) return -1;
        return data[index];
    }

    public boolean insert(int index,int value){
        if(count == n){
            System.out.println("Have no space");
            return false;
        }

        if(index<0||index>=count){
            System.out.println("Space no");
            return false;
        }

        for(int i=count; i>index;--i){
            data[i]=data[i-1];
        }
        data[index]=value;
        ++count;
        return true;
    }
    public boolean delete(int index){
        if(index<0||index>=count)return false;
        //从删除位置开始，将后面的元素向前移动一位
        for(int i=index+1;i<count;++i){
            data[i-1]=data[i];
        }
        --count;
        return true;
    }
    public void printAll(){
            for(int i=0;i<count;++i){
                System.out.print(data[i]+" ");
            }
        System.out.println();
    }
    public static void main(String[] args) {
        Array array = new Array(5);
        array.printAll();
        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3, 10);
        //array.insert(3, 11);
        array.printAll();
    }
}
