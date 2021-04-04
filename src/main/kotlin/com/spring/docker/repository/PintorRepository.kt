package com.spring.docker.repository

import com.spring.docker.model.Pintor
import org.springframework.data.jpa.repository.JpaRepository

interface PintorRepository : JpaRepository<Pintor, Int>
