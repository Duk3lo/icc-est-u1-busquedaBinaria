import controllers.PersonaController;
import models.Persona;

public class App {
    public static void main(String[] args) {

        // Datos
        int[] numeros = { 1, 3, 5, 7, 9, 11 };
        Persona[] personas = {
                new Persona("Ana", 20),
                new Persona("Luis", 25),
                new Persona("Carlos", 30)
        };

        BusquedaBinaria bb = new BusquedaBinaria();
        PersonaController pc = new PersonaController();
        ShowConsole vista = new ShowConsole();

        // Prueba búsqueda de número
        int valorBuscado = 7;
        boolean encontrado = bb.buscadaNumero(numeros, valorBuscado);
        vista.showResult(encontrado, valorBuscado);

        // Prueba búsqueda de persona
        String nombre = "Luis";
        Persona pEncontrada = pc.findByName(personas, nombre);
        vista.showPersonResult(pEncontrada, nombre);
    }
}
