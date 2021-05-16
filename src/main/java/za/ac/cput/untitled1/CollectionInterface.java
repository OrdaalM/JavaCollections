package za.ac.cput.untitled1;

import java.util.*;

public class CollectionInterface {

    public static void main(String[] args) {

        Employer emply1 = new Employer ("Software Developer", "15AB", "Ordaal", "Mthethwa", 256452);
        Employer emply2= new Employer ("System Analyst", "15AC", "James", "May", 255242);
        Employer emply3 = new Employer ("Business Analyst", "15AD", "Chris", "Gerald", 256425);
        Employer emply4 = new Employer ("Web Developer", "15AG", "Mlambo", "Nyanti", 2564352);
        Employer emply5 = new Employer ("Software Engineering", "15AF", "Asanda", "Meme", 2564582);

        List<Employer> mylist = new ArrayList<>();


        mylist.add(emply1);
        mylist.add(emply2);
        mylist.add(emply3);
        mylist.add(emply4);
        mylist.add(emply5);

        mylist.remove(emply3);
        System.out.println("Removed Element is : "+emply3);
        mylist.add(emply3);
        mylist.stream().findAny();


        HashSet<Employer> set = new HashSet<>();
        set.add(emply1);
        set.add(emply2);
        set.add(emply3);
        set.add(emply4);
        set.add(emply5);

        set.remove(emply2);
        System.out.println("Removed Element is : "+emply2);
        set.stream().findAny();

        Map<String, Employer> map = new HashMap<>();
        map.put("", emply1);
        map.put("", emply2);
        map.put("", emply3);
        map.put("", emply4);
        map.put("", emply5);


         map.remove(emply1);
         System.out.println("Removed Element is : "+emply1);


        System.out.println(":MYLIST ");
        for(Employer employer : mylist) {
            System.out.println(employer.getEmployeeName()+ " " + employer.getEmployeeSurname() + " " + employer.getLicenseNumber() +
                    " " + employer.getWorkType()+ " " + employer.getWorkType());
        }
        System.out.println("\nHASHSET ");
        for(Employer employer : mylist) {
            System.out.println(employer.getEmployeeName()+ " " + employer.getEmployeeSurname() + " " + employer.getLicenseNumber() +
                    " " + employer.getWorkType()+ " " + employer.getWorkType());
        }

        System.out.println("\nHASHMAP ");
        System.out.println(map.toString().replace(",", " ").replace("{", " ").replace("}", " ").trim());
    }
}



        
        



