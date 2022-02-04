package com.mzgo.todayantapi.api.service;

import com.mzgo.todayantapi.api.entity.user.User;
import com.mzgo.todayantapi.api.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUser(String userId) {
        return userRepository.findByUserId(userId);
    }
}
