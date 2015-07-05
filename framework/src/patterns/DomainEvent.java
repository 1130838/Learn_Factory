/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.Calendar;

/**
 * a Domain event is a eapli.myapp.domain/driven design pattern to signal significant events
 * that happened in the eapli.myapp.domain.
 *
 * these are not technical issues/events but meaningful eapli.myapp.domain concepts
 *
 * @author Paulo Gandra Sousa
 */
public interface DomainEvent {

    /**
     * returns the date and time when the event occurred in the eapli.myapp.domain
     *
     * @return
     */
    Calendar occurredAt();

    /**
     * returns the date and time when the event was recorded in the system
     *
     * @return
     */
    Calendar registeredAt();
}
