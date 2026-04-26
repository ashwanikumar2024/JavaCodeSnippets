package Generic;

public class Generic2 <T extends Number>{
    T item;

    Generic2(T a){
        this.item=a;
    }

    T getValue(){
        return item;
    }
}

class Main4{
    public static void main(String[] args) {
        Generic2<Float> i = new Generic2<>(5.26f);
    }
}