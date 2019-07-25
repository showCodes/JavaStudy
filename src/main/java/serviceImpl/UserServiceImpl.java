package main.java.serviceImpl;

import main.java.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("Add new user!");
    }
}
