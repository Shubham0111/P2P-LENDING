package com.lending.P2PLending.dao;

import com.lending.P2PLending.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Component
public interface DummyDao extends JpaRepository<Dummy,Integer> {
    @Query(value = "select * from dummy where id=:id", nativeQuery = true)
    Optional<Dummy> findByIds(Integer id);
}
