package com.ups.reportingweb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ups.reportingweb.model.ReportingUsers;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface ReportingUsersRepository extends PagingAndSortingRepository<ReportingUsers, Long> {

	ReportingUsers findByUserId(@Param("userId") String userId);

}
