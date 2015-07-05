/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.io.Serializable;
import java.util.List;

/**
 * a repository is a eapli.myapp.domain-driven design pattern to abstract the details of
 * persisting eapli.myapp.domain objects. it exposes a pure eapli.myapp.domain based interface without
 * leaking details of the implementation of the actual eapli.myapp.persistence mechanism.
 * there should be one repository per aggregate root only
 *
 * @author Paulo Gandra Sousa
 * @param <T> the type of the entity
 * @param <ID> the type of the entity's ID
 */
public interface Repository<T extends AggregateRoot, ID extends Serializable>
        extends List<T> {

    /**
     * gets all instances of the objects hold by this repository. in order to be
     * consistent with List we should use iterator() instead
     *
     * @return
     */
    List<T> all();

    /**
     * adds a new entity to the eapli.myapp.persistence store
     *
     * @param entity
     * @return the newly created persistent object
     */
    T create(T entity);

    /**
     * removes the object from the eapli.myapp.persistence storage. the object reference is
     * still valid but the persisted entity is/will be deleted
     *
     * @param entity
     */
    void delete(T entity);

    /**
     * returns the first n entities according to its "natural" order
     *
     * @param n
     * @return
     */
    List<T> first(int n);

    /**
     * returns a page of results using the natural order of the collection
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    List<T> page(int pageNumber, int pageSize);

    /**
     * reads an entity given its ID
     *
     * @param id
     * @return
     */
    T read(ID id);

    //T findById(PK id);
    /**
     * inserts or updates an entity
     *
     * check
     * http://blog.xebia.com/2009/03/23/jpa-implementation-patterns-saving-
     * detached-entities/ for a discussion on saveOrUpdate() behaviour and
     * merge()
     *
     * @param entity
     * @return the persisted entity - migth be a diferent object than the
     * parameter
     */
    T save(T entity);

    /**
     * updates an existing entity in the repository
     *
     * @param entity
     * @return
     */
    T update(T entity);

    /**
     * checks for the existence of an entity with the provided ID.
     *
     * @param key
     * @return
     */
    boolean containsEntity(ID key);
}
