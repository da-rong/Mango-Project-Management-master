package com.mangoprojectmanagement.dao;

import com.mangoprojectmanagement.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer>
{
}
