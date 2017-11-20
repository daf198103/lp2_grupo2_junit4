package lp2.grupo2.eduardo_ribeiro;

import java.util.Arrays;

public class Discipline {

    public static String[] getDiscplinesTaughtByProfessorLucasNadalete() {
        String[] disciplines = {"LP2", "Algoritmos", "LAB1", "LAB4"};
        System.out.println("The disciplines taught by Professor Lucas Nadalete are: "
                + Arrays.toString(disciplines));

        return disciplines;
    }

    public String[] addDisciplines() {
        String[] disciplines = {"LP2", "Algoritmos", "LAB1", "LAB4", "Outher"};
        System.out.println("The disciplines taught by Professor Lucas Nadalete are: "
                + Arrays.toString(disciplines));

        return disciplines;
    }
}
