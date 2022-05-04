package Java;

public class StringIntern {
    public static void main(String[] args) {
        String name="Anshuman Singh";
        String name1=new String("Anshuman Singh");
        boolean isTrue= name == name1;
        System.out.println(isTrue);

        boolean isTrue1 = name==name1.intern();
        System.out.println(isTrue1);
    }
}
