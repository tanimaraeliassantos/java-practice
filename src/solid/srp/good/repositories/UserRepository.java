package solid.srp.good.repositories;

import solid.srp.good.models.User;

public interface UserRepository {
    User findById(Long id);

    void save(User user);
}
