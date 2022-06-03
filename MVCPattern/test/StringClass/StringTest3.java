package properties;

import java.util.Scanner;

public class StringTest3 {
	public static void main(String[] args) {
		
		//문자열 추출
// 콘솔상에서 파일명을 입력받아 파일명과 확장자를 추출하여 출력하는 프로그램을 작성하세요. 
// 단, 잘못된 파일명(abc, .txt, abc.)을 입력했을때 오류메세지 출력후  
// 다시 입력받아 처리 할 수 있도록 작성하세요 

//	     1. 오류파일 검사(indexOf(), startsWith(), endsWith()) 
//        1-1 오류파일인경우  
//            - 메세지 출력  
//            - 다시 file입력받기 
//        1-2 정상적인 파일인 경우 
//            - .의 위치 추출(indexOf()) 
//            - .의 앞부분 문자열값 추출(substring()) 
//            - .의 뒷부분 문자열값 추출 
//            - 출력하고 break; 
		
		   Scanner r = new Scanner(System.in); 
		   System.out.println("파일명을 입력하세요"); 
		   String file = r.nextLine(); 
		
		   while(true){ 
			   
			   if(file.indexOf(".")== -1 || file.startsWith(".") || file.endsWith(".") ) {
				   System.out.println("파일이 오류입니다. 다시 입력하세요");
				   file = r.nextLine(); 
				   }else {
					   int p = file.indexOf("."); // .의 위치를 뽑아옴
					   String f = file.substring(0,p); //파일명이 됨
					   String e = file.substring(p+1);
					   System.out.println("파일 앞부분 : "+ f);
					   System.out.println("파일 확장자 : "+ e);
					   
					   break;
				   }


		   } 
	}

}
