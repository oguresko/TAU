/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pjatk.tau.service;

import java.util.List;
import pl.edu.pjatk.tau.domain.Trasa;

/**
 *
 * @author s12116
 */
public interface TrasaService {
    
    Trasa add(Trasa trasa);
    
    Trasa get(int id) throws IllegalArgumentException;

    List<Trasa> getAll();
    
    void delete(int id);
    
}
