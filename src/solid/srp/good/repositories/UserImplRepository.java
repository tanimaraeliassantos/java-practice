package solid.srp.good.repositories;

import java.util.HashMap;
import java.util.Map;
import solid.srp.good.models.User;
import solid.srp.good.repositories.UserRepository;

public class UserImplRepository implements UserRepository {
    private final Map<Long, User> database = new HashMap<>();

    @Override
    public User findById(Long id) {
        System.out.println("BD: buscando usuario con ID: " + id);
        return database.get(id);
    }

    @Override
    public void save(User user) {
        database.put(user.getId(), user);
        System.out.println("BD: guardando correctamente el usuario " + user.getUsername());
    }

}
