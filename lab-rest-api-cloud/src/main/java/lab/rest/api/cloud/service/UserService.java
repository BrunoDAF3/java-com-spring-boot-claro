package lab.rest.api.cloud.service;

import lab.rest.api.cloud.domain.model.User;


public interface UserService {

    User findById(Long id);

    User createUser(User userToCreate);

}
