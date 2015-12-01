package camlin.service;

import camlin.domain.User;

/**
 * UserService
 * 
 * @author ritesh
 *
 */
public class UserService {

    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("Ritesh");
        user.setLastName("Menon");
        return user;
    }
}
