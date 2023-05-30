package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null; //null은 초기화를 뜻함
		 
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//week = week+2;
		switch(week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.THUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
				
		
		}
		System.out.println("오늘 요일: " + today);
		if(today == Week.SUNDAY) {
			System.out.println("일요일엔 HTML5 CSS3 프로젝트 젠장");
		} else if(today == Week.FRIDAY) {
			System.out.println("열심히 자바 젠장 HTML5 CSS3 젠장");
			
		} else if(today == Week.MONDAY) {
			System.out.println("코딩 꿀잼");
		} else if(today == Week.THUESDAY) {
			System.out.println("CSS 꿀잼");
		} else {
			System.out.println("오늘은 노는날");
		}
		
	}

}
