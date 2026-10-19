public class Tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Responsable: "+ responsable);
        System.out.println("Horas Estimadas: "+ horasEstimadas);
        System.out.println("Tarea completada: "+ completada);

    }

    public void completar(){
        completada= true;
        System.out.println("La tarea ha sido completada");
    }

    void mostrarResponsable(){
        System.out.println("El responsable: "+ responsable);
    }

    void mostrarEstado(){
        System.out.println("Completada: "+ completada);
    }
}
