package lab.rest.api.cloud.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import lab.rest.api.cloud.domain.model.User;
import lab.rest.api.cloud.domain.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository){
        
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        
    }

    @Override
    public User createUser(User userToCreate) {
        
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){

            throw new IllegalArgumentException("User ID already exists");

        }

        return userRepository.save(userToCreate);

    }

}
