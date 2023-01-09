package test;

import main.UseSinglenton;
import main.Singleton;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UseSinglentonTest {
    @Test
    public void testSameMemoryLocationObject(){
        Singleton expectedObject= Singleton.getInstance();
        UseSinglenton result= new UseSinglenton();
        //Comprobando que por las dos vias que se contruyo la variable usan el mismo espacio en memoria
        //apuntan al mismo objeto creado una unica vez
        assertEquals(expectedObject.hashCode(), result.getSinglentonInstance().hashCode());
    }
}
