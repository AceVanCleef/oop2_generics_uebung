package main;

/**
 * Box<Q, T>: Q = key, T = value.
 *
 * Eine Klasse mit mehreren Typparametern (hier: key-value - Paar).
 *
 * Created by degonas on 27.06.2017.
 */
public class BoxWith2Typeparams<Q, T> {

    /* T als auch Q können A, B, C, oder D sein*/
    private Q key;
    private T val;  //generisches Attribut...

    //..dessen setter
    public void setValue(T val){
        this.val = val;
    }

    //...und getter.
    public T getValue(){
        return val;
    }

    public void setKey(Q key){
        isNull(key);
        this.key = key;
    }

    public Q getKey(){
        return key;
    }


    /***** Generische Methode schreiben *****/

    /**
     * [Warum eine generische Methode?] Ausschlaggebend: <P>
     *     Es könnten auch zwei isNull() geschrieben werden: public void isNull(Q key) und public void isNull(T val).
     *     Doch die generische Methode ist flexibel genug, um den Tippaufwand zu reduzieren.
     *
     * [P nimmt den Typ des Parameterobjektes an]
     * Die Methode wird in setValue und setKey verwendet:
     *  - setKey(Q key){
     *      isNull(key);        //hier: P = Q
     *      //do stuff
     *    }
     *  - setValue(T val)
     *      isNull(val)         //hier: P = T
     *      //do stuff
     *    }
     * Ebenso kann <P> isNull auch ausserhalb dieser Klasse verwendet werden:
     *  - box.isNull(new B());  //hier: P = B
     *
     * @param param
     * @param <P> ein unabhängiger Typparam, der nichts mit T oder Q zu tun hat.
     * @return boolean
     */
    public <P> boolean isNull(P param){
        return (param==null);
    }

}
