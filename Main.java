//import java.util.*; // tüm clasları kapsıyor yeterli alan yoksa sıkıntı yaratabilir '*' dan dolayı.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws MyEmptyStackException {


        //Stack stack = new StackArray();
        Stack stack = new StackLinkedList();
        try {
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }
        /*
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("String"); // integer yazdığımız zaman hata verdi çalışırken dene.
        HashMap<String, Double> grades = new HashMap();
        grades.put("Ali" , 35.0); // put metodu hem yeni şeyler eklemek için hemde listeyi güncellemek için kullanılabilir.
        System.out.println(grades);
        grades.put("Pelin" ,90.0);
        System.out.println(grades);
        grades.put("Enes", 10.0);
        System.out.println(grades);
        grades.put("Ali" , 60.0);
        System.out.println(grades);
        System.out.println(grades.keySet());
        System.out.println(grades.keySet() instanceof List); // Java'da instanceof anahtar kelimesi, bir nesnenin belirli bir sınıfın (veya onun alt sınıfının) bir örneği (instance'ı) olup olmadığını kontrol etmek için kullanılır
        System.out.println(grades.keySet() instanceof Set);
        */

    }
}