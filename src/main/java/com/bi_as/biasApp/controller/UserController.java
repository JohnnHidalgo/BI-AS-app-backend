package com.bi_as.biasApp.controller;
import java.util.ArrayList;
import java.util.List;

import com.bi_as.biasApp.domain.User;
import com.bi_as.biasApp.dto.UserDto;
import com.bi_as.biasApp.service.UserService;
import com.bi_as.biasApp.service.UserServiceX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserDto> all(){
        List<UserDto> userDtoList=new ArrayList<>();
        for(UserDto userDto:userService.findAllUser()){
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

//
//
//    @Autowired
//    UserServiceX service;
//
//    @GetMapping
//    public List<User>listar(){
//        return service.listar();
//    }
//    @PostMapping
//    public User agregar(@RequestBody User p){
//        return service.add(p);
//    }
//    @GetMapping(path = {"/{id}"})
//    public User listarId(@PathVariable("id")int id){
//        return service.listarId(id);
//    }
//    @PutMapping(path = {"/{id}"})
//    public User editar(@RequestBody User p,@PathVariable("id") int id){
//        p.setIdUser(id);
//        return service.edit(p);
//    }
//    @DeleteMapping(path = {"/{id}"})
//    public User delete(@PathVariable("id") int  id){
//        return service.delete(id);
//    }
}