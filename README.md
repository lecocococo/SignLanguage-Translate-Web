# SignLanguage-Translate-Web
졸업 프로젝트

<h1>현재 해야할것</h1>
1. 저장된 영상으로부터 딥러닝하여 결과값 뽑아내기<br>    
2. 뽑아진 결과를 스프링 서버로 전송<br>   
3. 스프링 서버에서 결과를 채팅으로 보여줄것<br>    

<h3> 현재 참조한 부분들</h3>
웹캠으로부터 얻은 영상을 서버로 보내는 법:https://snupi.tistory.com/170
flask파일 받아와서 저장하기: https://jaehaaheaj.tistory.com/entry/flask-003
getUserMedia()를 http에서 실행 시키는 법:https://stackoverflow.com/questions/34197653/getusermedia-in-chrome-47-without-using-https
https://stackoverflow.com/questions/58162952/aiortc-server-example-does-not-display-video-on-server

내장 톰캣에 로컬 키스토어 생성을 통해 https사용:https://velog.io/@max9106/Spring-Boot-%EB%82%B4%EC%9E%A5-%EC%9B%B9-%EC%84%9C%EB%B2%84-z8k66l0suf
flask에서 HTTPS 사용: https://velog.io/@danceintherain/python-flask-%EC%9B%B9%EC%84%9C%EB%B2%84-https-SSL%EC%9D%B8%EC%A6%9D%EC%84%9C
!!! 인증서 해결 방법 : https://superuser.com/questions/1083766/how-do-i-deal-with-neterr-cert-authority-invalid-in-chrome
                     https://peacocksoftware.com/blog/make-chrome-auto-accept-your-self-signed-certificate

////////////////
외부실행시 5500 포트 한번은 실행시키는것 필수!!!!!!!!!!!!
////////