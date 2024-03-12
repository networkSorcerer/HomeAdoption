package com.spring.openapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/***************************************************************************************
 * 현재 화면의 URL과 요청한 URL이 서로 다른 서버이기 때문에 CORS 정책에 따라 접근하지 못한다. 
 * 즉 CORS(Cross-Origin Resource Sharing, 교차 출처 리소스 공유)는 
 * 특정 서버에서 실행 중인 웹 애플리케이션이 다른 서버의 자원에 접근할 수 있는 권한을 부여하도록 브라우저에 알려주는 제약사항이다.
 * 동일 출처 정책(Same Origin Pollcy)은 브라우저가 보안상 이유로 스크립트에서 다른 서버로의 요청을 금지하는 정책이다. 
 * 악의적인 해커가 악성 스크립트를 이용하여 해커의 서버로 사용자 정보를 탈취할 가능성으로부터 보호하기 위한 관리적인 방법이다. 
 * 서버가 같은 경우를 '동일 출처' , 다른 경우를 '교차 출처'라 한다. 
 * 적절한 CORS를 사용하면 동일 출처 정책을 지키면서 교차 출처 환경에서 요청을 가능하게 할 수 있는데 
 * 요청과 응답 헤더를 조작해야 한다. 보통 헤더를 조작하기 위해서는 서버 프로그램 언어를 사용한다. 
 * 또는 서버 설정을 변경하거나 프록시(proxy) 기능을 사용하여 가능하게 할 수 있다.
 ***************************************************************************************/

/***************************************************************************************
 * 							  	매핑정보(메서드명은 매핑정보와 동일)		반환타입
 * 한국관광공사_국문관광정보 키워드 검색 화면 	/open/tourKeywordView 		tourAPI-keyword
 * 한국관광공사_국문관광정보 위치정보 화면 		/open/tourPositionView		tourAPI-position

 ***************************************************************************************/
@Controller
@RequestMapping("/open")
public class OpenAPIController {
	
	@GetMapping("/tourKeywordView")
	public String tourKeywordView() {
		return "tourAPI-keyword";
	}
	
	@GetMapping("/tourPositionView")
	public String tourPositionView() {
		return "tourAPI-position";
	}
}
