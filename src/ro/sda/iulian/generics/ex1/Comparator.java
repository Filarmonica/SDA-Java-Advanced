package ro.sda.iulian.generics.ex1;

public class Comparator <T extends Comparable<T>>{
    public void compare(T t1,T t2){
        int result =t1.compareTo(t2);
        if(result==1) {
            System.out.println(t1 + " is bigger than " + t2);
        }else if(result==-1) {
            System.out.println(t1 + " is smaller than " + t2);
        }else{
            System.out.println(t1 + " is equal to " + t2);
        }
    }
}

