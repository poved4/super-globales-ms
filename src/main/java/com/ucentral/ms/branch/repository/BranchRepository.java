package com.ucentral.ms.branch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ucentral.ms.branch.model.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> { }
