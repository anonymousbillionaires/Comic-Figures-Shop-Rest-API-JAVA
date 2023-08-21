package com.comicfiguresshop.restapi.repository;

import com.comicfiguresshop.restapi.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, String> {
}
