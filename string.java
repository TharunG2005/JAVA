public class string {
    public static void main(String[] args){
        String greeting = "Hello";
        System.out.println(greeting);
        String txt="abcdefghijklmnopqrstuvwxyz";
        System.out.println("The lenghth of the txt is :"+txt.length());
        String ulcase="Hello world";
        System.out.println(ulcase.toUpperCase());
        System.out.println(ulcase.toLowerCase());
        String in="Please locate where 'locate' occurs!";
        System.out.println(in.indexOf("locate"));
        String fn="Arun";
        String ln="Kumar";
        System.out.println(fn+" "+ln);
        System.out.println(fn.concat(ln));
        int x=10;
        String y="20";
        String z=x+y;
        System.out.println(z);
        String t="We are the so-called \"Vikings\"from the north.";
        System.out.println(t);
    }
}
