public class POO3 {

    public static void main(String[] args) {

        Comercial c1= new Comercial(300, "DDR", 37, 1000);
        Repartidor r1= new Repartidor(" zona 1", "Fernando", 20, 900);

        c1.plus();
        r1.plus();

        System.out.println(c1);
        System.out.println(r1);
        
    }
    
}
