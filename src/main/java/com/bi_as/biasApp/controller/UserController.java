package com.bi_as.biasApp.controller;
import java.util.ArrayList;
import java.util.List;

import com.bi_as.biasApp.domain.User;
import com.bi_as.biasApp.dto.UserDto;
import com.bi_as.biasApp.service.UserService;
import com.bi_as.biasApp.service.UserServiceX;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/user")
public class UserController {

    private UserService userService;

    private static final Logger LOGGER= LoggerFactory.getLogger(UserService.class);

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

    @PostMapping("/add/")
    public User agregar(@RequestBody User p){
        LOGGER.info("Agregando usuario");
        return userService.add(p);
    }


    @PostMapping("/login/")
    public User login(@RequestBody User user){
        LOGGER.info(user.getNicknameUser());

        //        String[] arraruuser=user.split("@");
//        List<UserDto> userDtoList=new ArrayList<>();
//        for(UserDto userDto:userService.findAllUser()){
//            if (userDto.getNicknameUser().equals(arraruuser[0]) && userDto.getPassword().equals(arraruuser[1])){
//                LOGGER.info("Si se encontro");
//            }else {
//                LOGGER.info("No se encontro");
//            }
//        }

        return userService.findIOneUSer(1);

    }




//
//    @RequestMapping(value = "/",method = RequestMethod.P,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    List<UserDto> all(){
//        List<UserDto> userDtoList=new ArrayList<>();
//        for(UserDto userDto:userService.findAllUser()){
//            userDtoList.add(userDto);
//        }
//        return userDtoList;
//    }

//
//
//    @Autowired
//    UserServiceX service;
//
//    @GetMapping
//    public List<User>listar(){
//        return service.listar();
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