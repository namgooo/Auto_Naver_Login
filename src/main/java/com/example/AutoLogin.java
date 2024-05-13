package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoLogin implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Github 2024-05-13 13:20
		
		// 크롬 드라이버 경로 설정
		// (주석한 이유 : 셀레니움 의존성 주입에서 라이브러리의 버전이 4.6부터 크롬 드라이버를 자동으로 인식해서 따로 코드를 작성할 필요가 없음)
		// System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chrome.exe");
		
		// WebDriver 옵션 설정
		ChromeOptions options = new ChromeOptions();
		// Chrome 웹 창을 최대한 크게 연다.
		options.addArguments("--start-maximized");
		// selenium이 웹 페이지가 팝업 차단을 위회한다.
		options.addArguments("--disable-popup-blocking");
		
		// 크롬 웹드라이버 객체 생성
		WebDriver driver = new ChromeDriver(options);
		
		// 네이버 로그인 페이지로 이동
		driver.get("https://nid.naver.com/nidlogin.login");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// 로그인 지연 (주석한 이유 : 라이브러리 문제인지 오류 발생...)
		// WebDriverWait wait = new WebDriverWait(driver, 5);
		
		// 매크로 봇으로 인지하는 것을 방지하기 위해서 아이디 입력을
		// 하나하나 입력하기 위해서 반복문을 통해서 입력하도록 코드 작성
		WebElement idInput = driver.findElement(By.id("id"));
		String userId = "실제 아이디";
		for(char c : userId.toCharArray()) {
			idInput.click();
			idInput.sendKeys(String.valueOf(c));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
		
		WebElement pwInput = driver.findElement(By.id("pw"));
		String userPw = "실제 비밀번호";
		for(char c : userPw.toCharArray()) {
			pwInput.click();
			pwInput.sendKeys(String.valueOf(c));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
		}
		
		// 로그인 버튼 클릭
        WebElement loginButton = driver.findElement(By.className("btn_login"));
        loginButton.click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}