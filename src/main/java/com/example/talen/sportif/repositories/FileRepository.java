package com.example.talen.sportif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.talen.sportif.models.FileInfo;

@Repository
public interface FileRepository extends JpaRepository<FileInfo, Long> {

}
