package com.example.demo.bbs.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoardDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private long boardNo;
	private String name;
	private String title;
	private String content;
}
