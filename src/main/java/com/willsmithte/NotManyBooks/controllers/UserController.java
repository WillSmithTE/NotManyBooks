package com.willsmithte.NotManyBooks.controllers;

import com.willsmithte.NotManyBooks.model.User;
import com.willsmithte.NotManyBooks.repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Will Smith on 16/3/19.
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable("id")ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public User createUser(@Valid @RequestBody User user) {
        user.set_id(ObjectId.get());
        repository.save(user);
        return user;
    }
}
