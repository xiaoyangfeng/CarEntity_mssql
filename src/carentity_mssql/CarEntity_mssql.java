/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carentity_mssql;

import carentity_mssql.entity.Car;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Blue
 */
public class CarEntity_mssql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Car ford = new Car("Ford", "Taurus", 2016);
         Car benz= new Car("Benz", "CAL45", 2016, 1000, Car.Colors.BLUE);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarEntity_mssqlPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        em.persist(ford);
        em.persist(benz);

        et.commit();

        em.close();
        emf.close();
    }
    
}
