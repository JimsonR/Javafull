public class Sbs {
    public static void main(String[] args) {
        StringBuffer sbuff = new StringBuffer("my name is ");
        StringBuilder suild = new StringBuilder("jimm");
        String s = sbuff+"ssad";
//        System.out.println(sbuff+suild);
        System.out.println(sbuff+" "+ sbuff.hashCode());
        sbuff.append("Jims");
        System.out.println(sbuff+" "+ sbuff.hashCode());
        StringBuilder sbuild = new StringBuilder("my name is ");
        System.out.println(sbuild+ " "+ sbuild.hashCode());
        sbuild.append("Jims");
        System.out.println(sbuild+" "+ sbuild.hashCode());


    }
}
