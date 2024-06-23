class Information<T> {
    T obj;
    Information(T obj){
        this.obj = obj;
    }
    T getInfo(){
        return obj;
    }
}
class Guy {
    public static void main(String[] args) {
        Integer i = 10;
        Information<Integer> obj = new Information<>(i);
        System.out.println("U stored :"+obj.getInfo());
        Float f = 3.14f;
        Information<Float> obj2 = new Information<>(f);
        System.out.println(obj2.getInfo());
        String str = "Hello World";
        Information<String> obj3 = new Information<>(str);
        System.out.println(obj3.getInfo());
    }
}