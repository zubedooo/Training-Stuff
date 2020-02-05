package com.company.day3;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter

public class Account implements Serializable {
	private int accaid;
	private double accbalance;
	private String accholdername;
}