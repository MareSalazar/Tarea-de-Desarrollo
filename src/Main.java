//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        //3 Objetos
        Tarea tarea1= new Tarea();
        Tarea tarea2= new Tarea();
        Tarea tarea3= new Tarea();

        //Tarea 1
        tarea1.titulo="Matematicas";
        tarea1.responsable="Karla";
        tarea1.horasEstimadas=2;
        tarea1.completada= false;

        //Tarea 2
        tarea2.titulo="Lenguaje";
        tarea2.responsable="Ariana";
        tarea2.horasEstimadas=1.5;
        tarea2.completada= false;

        //Tarea 3
        tarea3.titulo="Programacion";
        tarea3.responsable="Nicole";
        tarea3.horasEstimadas=4.0;
        tarea3.completada= false;

        System.out.println("TAREA 1\n");
        tarea1.mostrarInformacion();

        System.out.println("TAREA 2\n");
        tarea2.mostrarInformacion();

        System.out.println("TAREA 3\n");
        tarea2.mostrarInformacion();

        System.out.println("TAREA COMPLETADA 1\n");
        tarea1.completar();

        System.out.println("Estado de las tareas actualizado y sus responsables\n");
        System.out.println("Tarea 1: \n");
        tarea1.mostrarEstado();
        tarea1.mostrarResponsable();

        System.out.println("Tarea 2: \n");
        tarea2.mostrarEstado();
        tarea2.mostrarResponsable();
        System.out.println("Tarea 3: \n");
        tarea3.mostrarEstado();
        tarea3.mostrarResponsable();


    }
}