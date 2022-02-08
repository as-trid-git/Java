public class POO1 {

    public static void main(String[] args) {
        
        Libro libro1= new Libro(111111, "titulo1", "autor1", 30);
        Libro libro2= new Libro(222222, "titulo2", "autor2", 40);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        libro1.setNumPag(70);

        if(libro1.getNumPag()>libro2.getNumPag()){
            System.out.println(libro1.getTitulo()+ " tiene más páginas ");

        }else{
            System.out.println(libro2.getTitulo()+ " tiene más páginas ");

        }
    }
    
}
