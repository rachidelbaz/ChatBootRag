package org.sid.chatbootrag.services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import org.sid.chatbootrag.Repository.PersonRepository;
import org.sid.chatbootrag.entities.Person;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person,Long,PersonRepository> {
}
