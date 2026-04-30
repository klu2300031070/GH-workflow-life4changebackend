package com.kelf.devops.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kelf.devops.model.BloodDonor;

@Repository
public interface BloodDonorRepository extends JpaRepository<BloodDonor, Long> {
public List<BloodDonor> findByBloodType(String bloodtype);
Optional<BloodDonor> findTopByAddharOrderByCurrentDonationDateDesc(String addhar);
List<BloodDonor> findByOrg(String org);
}
