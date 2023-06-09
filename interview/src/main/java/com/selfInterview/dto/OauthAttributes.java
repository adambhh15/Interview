package com.selfInterview.dto;

import java.util.Map;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OauthAttributes {
	private Map<String, Object> attributes;
	private String nameAttributeKey;
	private String name;
	private String email;
	private String picture;
	
	@Builder
	public OauthAttributes(Map<String, Object> attributes, String nameAttributeKey, String name, String email,
			String picture) {
		this.attributes = attributes;
		this.nameAttributeKey = nameAttributeKey;
		this.name = name;
		this.email = email;
		this.picture = picture;
	}
	
	public static OauthAttributes of(String registrationId, String userNameAttributeName, Map<String, Object> attributes) {
		return ofGoogle(userNameAttributeName, attributes);	
		}

	private static OauthAttributes ofGoogle(String userNameAttributeName, Map<String, Object> attributes) {
		return OauthAttributes.builder()
				.name((String) attributes.get("name"))
				.email((String) attributes.get("email"))
				.picture((String) attributes.get("picture"))
				.attributes(attributes)
				.nameAttributeKey(userNameAttributeName)
				.build();
	}
	
	public SessionUser toEntity() {
		return SessionUser.builder()
				.name(name)
				.email(email)
				.picture(picture)
				.build();
	}
}
