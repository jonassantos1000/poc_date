package br.com.poc.date;

import java.io.Serializable;
import java.time.ZonedDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DateEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private ZonedDateTime semZoneId;
	private ZonedDateTime comZoneId;

	public DateEntity() {
	}

	public DateEntity(ZonedDateTime semZoneId, ZonedDateTime comZoneId) {
		this.semZoneId = semZoneId;
		this.comZoneId = comZoneId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ZonedDateTime getSemZoneId() {
		return semZoneId;
	}

	public void setSemZoneId(ZonedDateTime semZoneId) {
		this.semZoneId = semZoneId;
	}

	public ZonedDateTime getComZoneId() {
		return comZoneId;
	}

	public void setComZoneId(ZonedDateTime comZoneId) {
		this.comZoneId = comZoneId;
	}

	@Override
	public String toString() {
		return "DateEntity [id=" + id + ", semZoneId=" + semZoneId + ", comZoneId=" + comZoneId + "]";
	}

}
