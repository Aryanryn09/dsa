package enums;

public class basic {
    public static void main(String[] args) {
        Week weeks;
        weeks = Week.Monday;
        weeks = Week.saturday;
        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }

    enum Week {
        Monday, Tuesday, thursday, friday, saturday, sunday;
//m t w t f s s
        //    //they ar eall constants =
        //public static final
//        typ eis week


        Week() {
            System.out.println("constructr is called for" + this);
        }
    }

}
