package Animales;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Animal {
    protected String Sonidos;
    protected String Alimentos;
    protected String Habitat;
    protected String Nombre_cientifico;

    public abstract String Obtener_nombre_cientifico();
    public abstract String Obtener_sonidos();
    public abstract String Obtener_alimentos();
    public abstract String Obtener_habitat();
}

