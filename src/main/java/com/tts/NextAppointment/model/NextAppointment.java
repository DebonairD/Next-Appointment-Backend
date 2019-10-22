package com.tts.NextAppointment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NextAppointment {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String name;
		private String service;
		private String location;
		private Integer time;
		private Integer date;
		private Integer amount;
		
		public NextAppointment() {}

		public NextAppointment(String service, String name, String location, Integer time, Integer date, Integer amount) {
			this.name = name;
			this.time = time;
			this.date = date;
			this.service = service;
			this.amount = amount;
			this.location = location;
		}

		public String getService() {
			return service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public Integer getTime() {
			return time;
		}

		public void setTime(Integer time) {
			this.time = time;
		}

		public Integer getDate() {
			return date;
		}

		public void setDate(Integer date) {
			this.date = date;
		}

		public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public Long getId() {
			return id;
		}

		@Override
		public String toString() {
			return "NextAppointment [service=" + service + ", name=" + name + ", location=" + location + ", time="
					+ time + ", date=" + date + ", amount=" + amount + "]";
		}

		
}
