package DIO.Gerenciando_API2.controller;

import DIO.Gerenciando_API2.Usuario.Usuario;
import DIO.Gerenciando_API2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<Usuario> list(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody Usuario user){
        repository.save(user);
    }
    @PutMapping
    public void update(@RequestBody Usuario user){
        repository.save(user);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }

    @GetMapping("/{username}")
    public Usuario Usuario (@PathVariable ("username") String username){

        return repository.findByUsername(username);
    }


}
