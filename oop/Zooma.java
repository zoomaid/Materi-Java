public class Zooma {

    public static void main(String[] args) {
        /**
         * keyword new berfungsi untuk membuat object, dan dibutuhkan constructor dalam membuat
         * object.
         */
        Hero superman = new Hero("Superman", true);

        Hero batman = new Hero();
        batman.setName("Batman");
        batman.setCanFly(false);

        System.out.println("Hero name: "+ superman.getName() + " and he/she can fly? " + superman.isCanFly());
        System.out.println("Hero name: "+ batman.getName() + " and he/she can fly? " + batman.isCanFly());
    }
}
