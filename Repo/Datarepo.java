package com.example.backendmania.Repo;


import com.example.backendmania.Dao.Newsdatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Datarepo extends JpaRepository<Newsdatabase,Integer> {
}
