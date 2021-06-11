/*
 
 파일명: Dictionary.java
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 2 ]
 
 문제 3. 추상클래스의 활용 
 
 PairMap을 상속받는 Dictionary 클래스를 구현하라.
 
 */

class Dictionary extends PairMap { // PairMap을 상속받음
	protected int count = 0; // 저장된 값의 개수
	
	public Dictionary(int capacity) { // 생성자
		keyArray = new String [capacity];
		valueArray = new String [capacity];
	}
	
	@Override
	String get(String key) {
		for(int i=0; i<count; i++) { // 배열에 저장된 값의 개수만큼 반복
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		return null; // key를 발견할 수 없을 경우 null 리턴
	}

	@Override
	void put(String key, String value) {
		int i=0;
		for(i=0; i<count; i++) { // 배열에 저장된 값의 개수만큼 반복
			if(keyArray[i].equals(key))	break;
		}

		if(i == count) { // key를 발견하지 못할 경우
			if(i < keyArray.length) {
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}		
		}
		else { // value를 수정만 하는 경우
			keyArray[i] = key;
			valueArray[i] = value;			
		}
	}

	@Override
	String delete(String key) {
		int i=0;
		for(i=0; i<count; i++) { // 현재 배열에 저장된 원소 개수만큼 반복
			if(keyArray[i].equals(key))
				break;
		}

		if(i==count) // 발견 안됨
			return null;
		
		String value = valueArray[i];
		
		// 앞으로 한 자리씩 이동
		int last = count-1;
		for(int j=i; j<last; j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		
		count--;
		return value;
	}

	
	@Override
	int length() { return count; }

}
