package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_title")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisement"})
public class JobTitle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "job_title_id")
	private int id;
	@Column(name = "position")
	private String position;
	
	@OneToMany(mappedBy = "jobTitle")
	private List<JobAdvertisement> jobAdvertisements;
	
}