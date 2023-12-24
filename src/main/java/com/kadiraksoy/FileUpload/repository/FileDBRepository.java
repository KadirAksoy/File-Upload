package com.kadiraksoy.FileUpload.repository;

import com.kadiraksoy.FileUpload.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
