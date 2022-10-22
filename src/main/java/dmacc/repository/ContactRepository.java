package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Contact;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Oct 15, 2022
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}