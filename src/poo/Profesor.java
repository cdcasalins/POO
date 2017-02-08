package poo;

import java.util.ArrayList;

public class Profesor {

    int id;
    String nombre;
    ArrayList<Curso> cursos;

    Profesor(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Profesor(int id) {
        this.id = id;
        cursos = new ArrayList();

    }

    public boolean agregarCurso(Curso curso) {
        if (cursos.size() < 10) {
            cursos.add(curso);
           
        }
        return false;
    }

}
