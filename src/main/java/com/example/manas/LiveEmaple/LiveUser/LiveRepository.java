package com.example.manas.LiveEmaple.LiveUser;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveRepository extends JpaRepository<LiveUser, Integer> {
}
