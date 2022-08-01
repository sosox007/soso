package com.giantlink.grh.entities;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_company")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private String address;

	@JsonManagedReference
	@OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
	private Set<CompanyEntity> entities;
}
