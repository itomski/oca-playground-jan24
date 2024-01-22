package de.lubowiecki.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class UserController {

    Repository<User, Integer> repo;

    public static void main(String[] args) {
        new UserController().start();
    }

    private void start() {

        Consumer<User> cons = u -> System.out.println(u);

        try {

            repo = new UserRepository();

            /*
            // FIND ALL
            List<User> data = repo.find();
            data.forEach(cons);
            */

            /*
            // FIND ONE
            repo.find(2).ifPresent(cons);
            */

            /*
            // DELETE BY ID
            if(repo.deleteById(6)) {
                System.out.println("Gelöscht");
            }
            repo.find().forEach(cons);
            */

            /*
            // DELETE BY OBJECT
            Optional<User> userOpt = repo.find(4);
            if(userOpt.isPresent()) {
                if (repo.delete(userOpt.get())) {
                    System.out.println("Gelöscht");
                }
            }
            repo.find().forEach(cons);
            */

            /*
            // INSERT
            User user = new User("Hank", "Pym");
            System.out.println(user);
            repo.insert(user);
            System.out.println(user);
            */

            // UPDATE
            Optional<User> userOpt = repo.find(7);
            if(userOpt.isPresent()) {
                User user = userOpt.get();
                user.setFirstname("Hans");
                user.setLastname("Petersen");
                if(repo.update(user)) {
                    System.out.println("Geändert");
                }
            }
            repo.find().forEach(cons);
        }
        catch (SQLException e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }
}
