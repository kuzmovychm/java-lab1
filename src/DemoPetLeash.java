public class DemoPetLeash {
    public static void main(String[] args) {
        PetLeash leash1 = new PetLeash();
        leash1.toStr();
        leash1.printNumberOfLeashes();
        PetLeash.printStaticNumberOfLeashes();
        System.out.println("");

        PetLeash leash2 = new PetLeash("Huanzhon", 5, 50, "red");
        leash2.toStr();
        leash2.printNumberOfLeashes();
        PetLeash.printStaticNumberOfLeashes();
        System.out.println("");

        PetLeash leash3 = new PetLeash("Tendi", 10, 25, "brown", "webbing", "Harness lead", "ok", true);
        leash3.toStr();
        leash3.printNumberOfLeashes();
        PetLeash.printStaticNumberOfLeashes();
    }
}
