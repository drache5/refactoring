#Extract Subclass

###순서
1. 새로운 하위 클래스 정의
2. 생성자 작성
3. 상위 클래스 생성자를 호출하는 부분을 찾아 바꾼다.
4. 상위 클래스 부터 생성자 매개변수 세트를 정리한다.
5. 기능을 하위 클래스로 이동 (push down method)
6. 다시 한 번 생성자 매개변수 정리.
7. 일부 데이터를 사용하는 메서드들을 하위 클래스로 내린 후, 데이터에 push down field 적용
