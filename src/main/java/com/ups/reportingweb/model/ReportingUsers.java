package com.ups.reportingweb.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "REPORTING_USERS")
@Data
public class ReportingUsers {

	@Id
	@Column(name = "ID")
	private Long id;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "APPROVE")
	private String approve;

	@Column(name = "LOGIN_ATTEMPTS")
	private Integer loginAttempts;

	@Column(name = "LAST_PASSWORD_UPDATE")
	private Date lastPasswordUpdate;

	@Column(name = "DAYS_TO_EXPIRE")
	private Integer daysToExpire;

	@Column(name = "GROUP_ID")
	private Integer userGroupId;

}
