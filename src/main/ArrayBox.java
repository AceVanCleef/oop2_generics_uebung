package main;

/** eine Klasse mit Constraints: ArrayBox<T extends A>
 *
 * Die Constraint <T extends A> sagt dem Compiler, dass er sich sicher sein kann, dass T ein Objekt
 * vom Typ A oder dessen Kinder B, C oder D sein wird.
 *
 * Created by degonas on 27.06.2017.
 */
public class ArrayBox<T extends A> {
        private A[] myArray = new A[5];
        public void add(T val){
            myArray[0] = val;   //wenn ArrayBox<T>, dann hier Problem: Compiler
                                // nicht sicher, ob val vom Typ T als Typ A betrachtet
                                // werden darf. (Ein cast ist eine suboptimale Lösung und widerspricht
                                // dem generischen Ansatz).
                                // LÖSUNG: class ArrayBox<T extends A>
                                // Der Compiler weiss dann, dass T = A oder B, C oder D sein wird.
        }

}
