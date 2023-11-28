package devDojo.classes02.Aula08OrientacaoObjetos_Classes.teste;

import devDojo.classes02.Aula08OrientacaoObjetos_Classes.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.name = "Pedro";
        aluno.age = 18;
        aluno.gender = 'M';

        System.out.println(aluno.name);
    }
}
