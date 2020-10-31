package fr.diginamic.testexceptions;

import sets.Pays;


public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException {

        Pays monPays = new Pays("France", 67_848_156, 42_878);


        try {
            ReflectionUtils.afficherAttributs(monPays);
            ReflectionUtils.afficherAttributs(null);
        } catch (ReflectionException e){
            System.out.println("L'objet ne peut pas être null");
        }

    }
}
