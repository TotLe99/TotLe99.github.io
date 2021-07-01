package ChuanHoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chuanHoa {
    public static void main(String[] args) {
        list();
    }

    static void list() {
        List<String> fullNames = new ArrayList<String>();
        fullNames.add("Nguyễn   hữu tiến ");
        fullNames.add("  Lê vĂn tốt ");
        fullNames.add("nguyễn việt ANh");
        fullNames.add("  Hoàng trọng  kHoa");
        fullNames.add(" ĐàO việt phong");
        fullNames.add("                  cÔ GiÁo NgỌC               ");
        System.out.print("Trước khi chuẩn hoá: "+fullNames);
        chuanHoa(fullNames);
    }

    /*static void chuanHoa(List<String> fullNames) {
        String s;
        s = s.toLowerCase();
        String [] ss;
        String s2 = "";
        ss = s.split(" ");
        for (int i = 0; i < ss.length; i++){
            String s1 = "";
            if(ss[i].length() != 0){
                s1+= Character.toUpperCase(ss[i].charAt(0));
                if (ss[i].length() > 1) s1+= ss[i].substring(1);
                s2+= s1;
                if (i < ss.length) s2+= " ";
            }
        }
        if (s2.charAt(s2.length() - 1) == ' ') s2+= "\b";
        System.out.print("\n---------------------------------");
        System.out.print("\nSau khi chuẩn hoá: " +s2);
    }*/

    public static void chuanHoa(List<String> fullNames) {
        for (int i = 0; i < fullNames.size(); i++) {
            String name = "";
            String temp = fullNames.get(i);
            temp = temp.trim().toLowerCase();

            for (int j = 0; j < temp.length(); j++) {
                if (j == 0 || temp.charAt(j-1) == ' ') {
                    if (temp.charAt(j) == ' ') { continue; } else {name += Character.toUpperCase(temp.charAt(j));}
                    
                } else {name += temp.charAt(j);}
            
            }
            System.out.print("\n-------------------------------------------------");
            System.out.print("\n                 "+name);
        }
    }
}

