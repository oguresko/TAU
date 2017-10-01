/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pjatk.tau.service;


import org.junit.Test;
import pl.edu.pjatk.tau.domain.Trasa;
import static org.junit.Assert.*;


/**
 *
 * @author s12116
 */
public class TrasaServiceTest {
    
    public TrasaServiceTest() {
        
        
        
    }
    
  
   
    @Test
    public void testAdd() {
        
        Trasa trasa = new Trasa(); 
        TrasaService trasaService = null;
        Trasa entity = trasaService.add(trasa);
        assertEquals(trasa, entity);
        assertEquals(trasa.getStartDate(), entity.getStartDate());
        assertEquals(trasa.getEndDate(), entity.getEndDate());
        assertEquals(trasa.getKilometry(), entity.getKilometry(),0.001);
        assertEquals(trasa.getId(), entity.getId());
        
    }
    
    @Test
    public void testGet() {
        
    }

   
    @Test
    public void testGetAll() {
      
    }
    
    @Test
    public void testDelete() {
        
    }

}