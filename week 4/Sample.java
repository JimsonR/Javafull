
class Sampl<T,K>{

    public T item;
    public K item2;

    public Sampl(T item,K item2){
        this.item=item;
        this.item2=item2;
    }
    public void updateItem(Integer i){
//

//        this.item = (T)(i);
//        T upd = ;
//        return upd;
//        Integer i2= Integer(Integer.parseInt(item.toString())+i);

    }

    public  T getItem(){
        return item;
    }

}


public class Sample {

    public static void main(String [] args){

        Sampl<Integer,String> obj=new Sampl<>(1,"jimmy");
        obj.updateItem(3);
        System.out.println(obj.getItem());
        System.out.println(obj.item);





    }
}