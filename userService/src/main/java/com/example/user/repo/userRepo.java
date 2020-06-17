package com.example.user.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.user.ui.data.userEntity;
@Repository
public interface userRepo extends CrudRepository< userEntity,Long> {


}
