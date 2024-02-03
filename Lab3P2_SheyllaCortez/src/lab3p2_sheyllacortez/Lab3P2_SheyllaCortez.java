/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_sheyllacortez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab3P2_SheyllaCortez {

    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Pokemon> pokemoncito = new ArrayList<>();
    private static ArrayList<Pokeball> mispokes = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1) Crear Pokemon ");
            System.out.println("2) Crear Pokebola ");
            System.out.println("3) Listar Pokemon ");
            System.out.println("4) Eliminar Pokemon ");
            System.out.println("5) Capturar Pokemon ");
            System.out.println("6) Modificar Pokemon");
            System.out.println("7) Salir ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    crearPoke();
                    break;
                case 2:
                    crearPokeball();
                    break;
                case 3:
                    listarPoke();
                    break;
                case 4:
                    System.out.println("Ingrese el tipo de pokemon que desea eliminar: ");
                    System.out.println("1) Fire");
                    System.out.println("2) Water");
                    System.out.println("3) Grass");
                    int op = entrada.nextInt();
                    switch (op) {
                        case 1:
                            deleteFire();
                            break;
                        case 2:
                            deleteWater();
                            break;
                        case 3:
                            deleteGrass();
                            break;
                        default:
                            System.out.println("Opcion invalida ");
                    }
                    break;
                case 5:
                    atrapaPk();
                    System.out.println("Su programador de DMAF games no pudo programar esta parte ");
                    break;
                case 6:
                    System.out.println("Ingrese el tipo de pokemon que desea mpdificar: ");
                    System.out.println("1) Fire");
                    System.out.println("2) Water");
                    System.out.println("3) Grass");
                    int option = entrada.nextInt();
                    switch (option) {
                        case 1:
                            modiFire();
                            break;
                        case 2: 
                            modiWater();
                            break; 
                        case 3: 
                            modiGrass();
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    break;
                case 7:
                    System.out.println("Que le vaya bien instructor ");
                    break;
                default:
                    System.out.println("Su opcion es invalida ");
            }
        } while (opcion != 7);
    }

    //Método para crear pokemon 
    public static void crearPoke() {
        int elijePoke = 0;
        do {
            System.out.println("Ingrese el pokemon a crear: ");
            System.out.println("1) Fuego");
            System.out.println("2) Agua");
            System.out.println("3) Planta");
            elijePoke = entrada.nextInt();
            switch (elijePoke) {
                case 1:
                    crearpkFuego();
                    break;
                case 2:
                    crearpkAgua();
                    break;
                case 3:
                    crearpkGrass();
                    break;
                default:
                    System.out.println("Su opcion no puede crear un pokemon");
            }

        } while (elijePoke < 1 || elijePoke > 3);

    }

    //Método para los pokemones de fuego 
    public static void crearpkFuego() {
        boolean atrapado = false;
        Pokeball poke = null;

        System.out.println("Ingrese nombre: ");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese numero del pokedex: ");
        int pokedex = entrada.nextInt();
        System.out.println("Ingrese la naturaleza del pokemon: ");
        entrada.nextLine();
        String naturaleza = entrada.nextLine();
        while ((!naturaleza.equalsIgnoreCase("Timido")) && (!naturaleza.equalsIgnoreCase("Energetico")) && (!naturaleza.equalsIgnoreCase("Misterioso"))) {
            System.out.println("Naturaleza incorrecta ");
            System.out.println("Ingrese la naturaleza del pokemon: ");
            naturaleza = entrada.nextLine();
        }
        System.out.println("Ingrese pontencia de las llamas del pokemon: ");
        int firepotent = entrada.nextInt();

        pokemoncito.add(new fireType(nombre, pokedex, naturaleza, atrapado, poke, firepotent));
    }

    //Método para crear pokemones de agua 
    public static void crearpkAgua() {
        boolean atrapado = false;
        Pokeball poke = null;

        System.out.println("Ingrese el nombre del pokemon: ");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese numero del pokedex: ");
        int pokedex = entrada.nextInt();
        System.out.println("Ingrese la naturaleza del pokemon: ");
        entrada.nextLine();
        String naturaleza = entrada.nextLine();
        while ((!naturaleza.equalsIgnoreCase("Timido")) && (!naturaleza.equalsIgnoreCase("Energetico")) && (!naturaleza.equalsIgnoreCase("Misterioso"))) {
            System.out.println("Naturaleza incorrecta ");
            System.out.println("Ingrese la naturaleza del pokemon: ");
            naturaleza = entrada.nextLine();
        }
        System.out.println("Su pokemon puede vivir fuera del agua {Si o No}:");
        String vivirAgua = entrada.nextLine();
        boolean viveAgua = false;
        if (vivirAgua.equalsIgnoreCase("si")) {
            viveAgua = true;
        } else if (vivirAgua.equalsIgnoreCase("no")) {
            viveAgua = false;
        } else {
            System.out.println("Su opcion es invalida");
            while ((!vivirAgua.equalsIgnoreCase("si")) && (!vivirAgua.equalsIgnoreCase("no"))) {
                System.out.println("Su pokemon puede vivir fuera del agua {Si o No}:");
                vivirAgua = entrada.nextLine();
                if (vivirAgua.equalsIgnoreCase("si")) {
                    viveAgua = true;
                } else if (vivirAgua.equalsIgnoreCase("no")) {
                    viveAgua = false;
                }
            }
        }
        System.out.println("Ingrese la velocidad para nadar: ");
        int rapidez = entrada.nextInt();

        pokemoncito.add(new waterType(rapidez, viveAgua, nombre, pokedex, naturaleza, atrapado, poke));
    }

    
    //Método para crear pokemones grass
    public static void crearpkGrass() {
        boolean atrapado = false;
        Pokeball poke = null;

        System.out.println("Ingrese el nombre del pokemon: ");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese numero del pokedex: ");
        int pokedex = entrada.nextInt();
        System.out.println("Ingrese la naturaleza del pokemon: ");
        entrada.nextLine();
        String naturaleza = entrada.nextLine();
        while ((!naturaleza.equalsIgnoreCase("Timido")) && (!naturaleza.equalsIgnoreCase("Energetico")) && (!naturaleza.equalsIgnoreCase("Misterioso"))) {
            System.out.println("Naturaleza incorrecta ");
            System.out.println("Ingrese la naturaleza del pokemon: ");
            naturaleza = entrada.nextLine();
        }
        System.out.println("Ingrese el tipo de habitat: ");
        String habitat = entrada.nextLine();
        System.out.println("Ingrese el dominio sobre las plantas [0-100]: ");
        int dominio = entrada.nextInt();
        while ((dominio < 0) || (dominio > 100)) {
            System.out.println("Ingrese el dominio sobre las plantas [0-100]: ");
            dominio = entrada.nextInt();
        }

        pokemoncito.add(new grassType(nombre, pokedex, naturaleza, atrapado, poke, habitat, dominio));
    }

    //Método para crear pokebola
    public static void crearPokeball() {
        System.out.println("Ingrese su color: ");
        entrada.nextLine();
        String color = entrada.nextLine();
        System.out.println("Ingrese numero de serie: ");
        int numSerie = entrada.nextInt();
        while (numSerie(numSerie) == true) {
            System.out.println("Su serie ya esta en un pokebola ");
            System.out.println("Ingrese numero de serie: ");
            numSerie = entrada.nextInt();
        }
        System.out.println("Ingrese la eficiencia: ");
        int eficiencia = entrada.nextInt();
        while ((eficiencia < 1) || (eficiencia > 3)) {
            System.out.println("Ingrese la eficiencia: ");
            eficiencia = entrada.nextInt();
        }
        mispokes.add(new Pokeball(color, numSerie, eficiencia));
        System.out.println(mispokes);
    }

    //Validar el numero de series
    public static boolean numSerie(int numSerie) {
        for (Pokeball j : mispokes) {
            if (j.getSerie() == numSerie) {
                return true;
            }
        }
        return false;
    }

    //Método para listar agrupados 
    public static void listarPoke() {
        for (Pokemon i : pokemoncito) {
            if (i instanceof fireType) {
                System.out.println("FireType -> ");
                System.out.println(i);
            } else if (i instanceof waterType) {
                System.out.println("WaterType ->");
                System.out.println(i);
            } else if (i instanceof grassType) {
                System.out.println("GrassType ->");
                System.out.println(i);
            }
        }

    }

    //Método para eliminar pokemones
    public static void deleteFire() {
        for (int i = 0; i < pokemoncito.size(); i++) {
            if (pokemoncito.get(i) instanceof fireType) {
                System.out.println(i + ")" + pokemoncito.get(i));
            }
        }

        //Eliminar
        System.out.println("Introducir el indice a eliminar: ");
        int indice = entrada.nextInt();
        while (indice < 0 || indice > pokemoncito.size()) {
            System.out.println("Introducir el indice a eliminar: ");
            indice = entrada.nextInt();
        }
        if (pokemoncito.get(indice) instanceof fireType) {
            pokemoncito.remove(indice);
            System.out.println("Pokemoncito eliminado");
        } else {
            System.out.println("No esta en los parametros ");
        }

    }

    public static void deleteWater() {
        for (int i = 0; i < pokemoncito.size(); i++) {
            if (pokemoncito.get(i) instanceof waterType) {
                System.out.println(i + ")" + pokemoncito.get(i));
            }
        }

        //Eliminar
        System.out.println("Introducir el indice a eliminar: ");
        int indice = entrada.nextInt();
        while (indice < 0 || indice > pokemoncito.size()) {
            System.out.println("Introducir el indice a eliminar: ");
            indice = entrada.nextInt();
        }
        if (pokemoncito.get(indice) instanceof waterType) {
            pokemoncito.remove(indice);
            System.out.println("Pokemoncito eliminado");
        } else {
            System.out.println("No esta en los parametros ");
        }

    }

    public static void deleteGrass() {
        for (int i = 0; i < pokemoncito.size(); i++) {
            if (pokemoncito.get(i) instanceof grassType) {
                System.out.println(i + ")" + pokemoncito.get(i));
            }
        }

        //Eliminar
        System.out.println("Introducir el indice a eliminar: ");
        int indice = entrada.nextInt();
        while (indice < 0 || indice > pokemoncito.size()) {
            System.out.println("Introducir el indice a eliminar: ");
            indice = entrada.nextInt();
        }
        if (pokemoncito.get(indice) instanceof grassType) {
            pokemoncito.remove(indice);
            System.out.println("Pokemoncito eliminado");
        } else {
            System.out.println("No esta en los parametros ");
        }

    }

    //Método modifca fire
    //IMPORTANTE - le puse al if que sea false para que deje entrar por si no termino el atrapar, si se lo quito no se podra probar
    //Pero estoy al tanto de que solo son los que ya fueron atrapados, es decir cuando el boolean es 
    public static void modiFire() {
        for (int i = 0; i < pokemoncito.size(); i++) {
            if ((pokemoncito.get(i).isAtrapado()) == false) {
                System.out.println("Ingrese el pokemon a modificar: ");
                int modificar = entrada.nextInt();
                if (pokemoncito.get(modificar) instanceof fireType) {
                    System.out.println("Que desea modifcar: ");
                    System.out.println("1) Nombre ");
                    System.out.println("2) Numero de entrada en la pokedex ");
                    System.out.println("3) Potencia de llamas ");
                    int op = entrada.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre: ");
                            entrada.nextLine();
                            String nombre = entrada.nextLine();
                            pokemoncito.get(i).setNombre(nombre);
                            break;
                        case 2:
                            System.out.println("Ingrese la nueva entrada: ");
                            int entradaPoke = entrada.nextInt();
                            pokemoncito.get(i).setNumPokedex(entradaPoke);
                            break;
                        case 3:
                            fireType fire = (fireType) pokemoncito.get(i);
                            System.out.println("Ingrese la nueva potencia: ");
                            int potencia = entrada.nextInt();
                            fire.setFirepotent(potencia);
                            pokemoncito.remove(i);
                            pokemoncito.add(i, fire);
                        default:
                            System.out.println("No puede modicar ese elemento ");
                    }
                }
            }
        }
    }

    //Método modifca water
    public static void modiWater() {
        for (int i = 0; i < pokemoncito.size(); i++) {
            if ((pokemoncito.get(i).isAtrapado()) == false) {
                System.out.println("Ingrese el pokemon a modificar: ");
                int modificar = entrada.nextInt();
                if (pokemoncito.get(modificar) instanceof waterType) {
                    System.out.println("Que desea modifcar: ");
                    System.out.println("1) Nombre ");
                    System.out.println("2) Numero de entrada en la pokedex ");
                    System.out.println("3) Vivir fuera de agua ");
                    int op = entrada.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre: ");
                            entrada.nextLine();
                            String nombre = entrada.nextLine();
                            pokemoncito.get(i).setNombre(nombre);
                            break;
                        case 2:
                            System.out.println("Ingrese la nueva entrada: ");
                            int entradaPoke = entrada.nextInt();
                            pokemoncito.get(i).setNumPokedex(entradaPoke);
                            break;
                        case 3:
                            waterType water = (waterType) pokemoncito.get(i);
                            System.out.println("Ingrese si puede o no vivir fuera del agua: ");
                            String vivir = entrada.nextLine();
                            String vivirAgua = entrada.nextLine();
                            boolean viveAgua = false;
                            if (vivirAgua.equalsIgnoreCase("si")) {
                                viveAgua = true;
                            } else if (vivirAgua.equalsIgnoreCase("no")) {
                                viveAgua = false;
                            } else {
                                System.out.println("Su opcion es invalida");
                                while ((!vivirAgua.equalsIgnoreCase("si")) && (!vivirAgua.equalsIgnoreCase("no"))) {
                                    System.out.println("Su pokemon puede vivir fuera del agua {Si o No}:");
                                    vivirAgua = entrada.nextLine();
                                    if (vivirAgua.equalsIgnoreCase("si")) {
                                        viveAgua = true;
                                    } else if (vivirAgua.equalsIgnoreCase("no")) {
                                        viveAgua = false;
                                    }
                                }
                            }
                            water.setLifeWater(viveAgua);
                            pokemoncito.remove(i);
                            pokemoncito.add(i, water);
                        default:
                            System.out.println("No puede modicar ese elemento ");
                    }
                }
            }
        }
    }
    //Método modifca fire

    public static void modiGrass() {
        for (int i = 0; i < pokemoncito.size(); i++) {
            if ((pokemoncito.get(i).isAtrapado()) == false) {
                System.out.println("Ingrese el pokemon a modificar: ");
                int modificar = entrada.nextInt();
                if (pokemoncito.get(modificar) instanceof grassType) {
                    System.out.println("Que desea modifcar: ");
                    System.out.println("1) Nombre ");
                    System.out.println("2) Numero de entrada en la pokedex ");
                    System.out.println("3) Habitat");
                    int op = entrada.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre: ");
                            entrada.nextLine();
                            String nombre = entrada.nextLine();
                            pokemoncito.get(i).setNombre(nombre);
                            break;
                        case 2: 
                            System.out.println("Ingrese la nueva entrada: ");
                            int entradaPoke = entrada.nextInt();
                            pokemoncito.get(i).setNumPokedex(entradaPoke);
                            break;
                        case 3:
                            grassType grass = (grassType) pokemoncito.get(i);
                            System.out.println("Ingrese el nuevo habitat: ");
                            entrada.nextLine();
                            String habitat = entrada.nextLine();
                            grass.setHabitat(habitat);
                            pokemoncito.remove(i);
                            pokemoncito.add(i, grass);
                            break;
                        default:
                            System.out.println("No puede modicar ese elemento ");
                    }    
                }
            }
        }
    }
    
    //Método para atrapar pokemon
    public static void atrapaPk(){
        System.out.println("Ingrese el indice de la pokebola a usar: ");
        int usarpk = entrada.nextInt();
    
    }
}
