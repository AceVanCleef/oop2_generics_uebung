package main;

/**
 * Eine generische Klasse mit einem einzelnen Typparameter.
 *
 * Created by degonas on 06.03.2017.
 */
class Box<T>{
    /* T = A, B, C, oder D */
    private T val;  //generisches Attribut...

    //..dessen setter
    public void setValue(T val){
        this.val = val;
    }

    //...und getter.
    public T getValue(){
        return val;
    }
}