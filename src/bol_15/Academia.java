/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_15;

import datosPersoa.Persoal;
import notamediaav.Nota;

/**
 *
 * @author Josemolamazo
 */
public class Academia {

    public static int numReferencia = 2020;
    private String nome;
    private int nota;
    private Persoal alumno;

    public Academia() {
    }

    public Academia(int numReferencia, String nome, int nota, Persoal alumno) {
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getNota() {
        
        return nota;
    }

    public void setNota(int nota) {

        this.nota = nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Datos da clase =" + "\nnº referencia: " + numReferencia + "\nnome =" + nome + "\nnota=" + nota + "\nalumno=" + alumno;
    }

}
