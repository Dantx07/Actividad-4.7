package Animales;

public class Prueba_Animales {
    public static void main (String[] Args)  {
        Animal[] Animales = new Animal[4];

        Animales[0] = new Gatos();
        Animales[1] = new Perros();
        Animales[2] = new Leones();
        Animales[3] = new Lobos();

        for (Animal animale : Animales) {
            System.out.println(animale.Obtener_nombre_cientifico());
            System.out.println("Habitad: " + animale.Obtener_habitat() + "\nSonido: " + animale.Obtener_sonidos() + "\nAlimentos: " + animale.Obtener_alimentos() + "\n\n");
        }
    }
}