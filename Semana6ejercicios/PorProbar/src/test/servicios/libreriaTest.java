package test.servicios;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;

public class libreriaTest{
    @Test
    public void testPrestar(){
        Libro milibro = new Libro ("Moby Dick","Hernan Melville");
        milibro.setPrestado(true);
        Libreria milibreria = new Libreria();
        try{
            milibreria.prestar(milibro);
            fail();
        }catch (Exception ex){
            assertTrue(true);

        }
    }
    @Test
    public void testDevolver(){
        Libro milibro = new Libro ("Mobi Dick","Hernan Melville");
        var milibreria = new Libreria();
        try{
            milibreria.devolver(milibro);
            fail();
        }catch (Exception ex){
            assertTrue(true);       
         }
    }
}
