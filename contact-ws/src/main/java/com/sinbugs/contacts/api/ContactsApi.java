package com.sinbugs.contacts.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinbugs.contacts.dto.Contact;
import com.sinbugs.contacts.service.ContactService;

@RestController
public class ContactsApi {
	
	@Autowired
	ContactService contactService;

	@RequestMapping(value="/product", method=RequestMethod.GET)
	public Contact getById() {
		return new Contact(1, "Alcarca", "Pepe", "+34656565656", "Pepe@sinbugs.com");
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public Contact updateOrSave(@RequestBody Contact contact) {
		return contactService.save(contact);
	}
}
