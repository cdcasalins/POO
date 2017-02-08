package poo;

import java.util.ArrayList;

public class Universidad {

    ArrayList<Curso> cursos;
    ArrayList<Profesor> profesores;

    public Universidad() {
        cursos = new ArrayList();
        profesores = new ArrayList();

    }

    public void agregarProfesor() {
        Profesor p1 = new Profesor(1);
        profesores.add(p1);

    }

    public void AgregarCurso() {
        Curso c = new Curso(10);
        cursos.add(c);

    }

    public void RegistrarProfesorCurso(Profesor p, Curso c) {
        p.cursos.add(c);
        c.setProfesor(p);

    }

}
