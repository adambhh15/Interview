package com.selfInterview.dto.question;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {
	private int seq;
	private String category;
	private String question;
	
}
