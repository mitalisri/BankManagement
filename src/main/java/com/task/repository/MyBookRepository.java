package com.task.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.model.MyBookList;



@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}
