
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan kalkulator.
 *  
 */

package pbo1.pkg10118033.latihan48;

public class PBO110118033Latihan48 {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        System.out.println("VALUE 1 = "+kalkulator.getValue1());
        System.out.println("VALUE 2 = "+kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in Java");
        System.out.println("Result Add is      = "+kalkulator.add(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Result Minus is    = "+kalkulator.minus(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Result Multiple is = "+kalkulator.multiplication(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Result Division is = "+kalkulator.division(kalkulator.getValue1(),kalkulator.getValue2()));
    }
}