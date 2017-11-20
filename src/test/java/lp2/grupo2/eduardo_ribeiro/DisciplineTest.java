package lp2.grupo2.eduardo_ribeiro;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DisciplineTest {

    Discipline discipline = new Discipline();
    String [] disciplines = {"LP2", "Algoritmos", "LAB1", "LAB4", "Outher"};

    @Test
    public void addDisciplineTest(){
        assertArrayEquals(disciplines, discipline.addDisciplines());
    }
}
