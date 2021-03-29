public class Classroom {

    public static void main(String[] args) {
        Wilder JVCD = new Wilder("Jean-Claude", true);
        Wilder spongeBob = new Wilder("Sponge Bob", true);
        Wilder doraTheExplorer = new Wilder("Dora", true);
        Wilder peppaPig = new Wilder("Peppa");
        System.out.println(JVCD.whoAmI());
        System.out.println(spongeBob.whoAmI());
        System.out.println(doraTheExplorer.whoAmI());
        System.out.println(peppaPig.whoAmI());
        peppaPig.setAware(true);
        System.out.println(peppaPig.whoAmI()+ " now!");
    }
}
