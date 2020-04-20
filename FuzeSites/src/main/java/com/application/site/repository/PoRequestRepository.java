package com.application.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.site.entity.PoRequest;

public interface PoRequestRepository extends JpaRepository<PoRequest, Integer> {

}
