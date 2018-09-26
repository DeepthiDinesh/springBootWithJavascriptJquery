package com.example.jsfspringboot.repository;

import com.example.jsfspringboot.model.UserDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<UserDetails, Long> {
    @Query("select ud from UserDetails ud where ud.id=:id")
    UserDetails findbyUserId(@Param("id") int id);
}

