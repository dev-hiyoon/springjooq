package com.example.springjooq.repository;

import com.example.springjooq.entity.jooq.tables.User;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final DSLContext dslContext;

    public List<User> getUsers() {
        return dslContext.selectFrom(User.USER).fetchInto(User.class);
    }

}
