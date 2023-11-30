// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Cliente: Sociedad
        Sociedad sociedad = new Sociedad();
        sociedad.setCodigo("ID1407");
        sociedad.setNombre("Apple");
        sociedad.setDireccionPostal("05001");
        sociedad.setPoblacion("España");
        sociedad.setProvincia("Madrid");
        sociedad.setEmail("applemail@gmail.com");
        sociedad.setTelefono("900 150 503");


        // Cliente: Autonomo
        Autonomo autonomo = new Autonomo();
        autonomo.setCodigo("ID2402");
        autonomo.setNombre("Garzón Vargas Oscar Mateo");
        autonomo.setDireccionPostal("05001");
        autonomo.setPoblacion("España");
        autonomo.setProvincia("Ávila");
        autonomo.setEmail("oscarm.garvar@educa.jcyl.es");
        autonomo.setTelefono("632047956");


        imprimir(sociedad);
        imprimir(autonomo);

    }

    public static void imprimir(Cliente cliente) {
        System.out.println("Código:" + cliente.getCodigo());
        System.out.println("Nombre:" + cliente.getNombre());
        System.out.println("DirecciónPostal:" + cliente.getDireccionPostal());
        System.out.println("Población:" + cliente.getPoblacion());
        System.out.println("Provincia:" + cliente.getProvincia());
        System.out.println("Email:" + cliente.getEmail());
        System.out.println("Telefono:" + cliente.getTelefono());

    }

}

