
abstract class PairMap {
	
	protected String keyArray []; // key들을 저장하는 배열
	protected String valueArray []; // value 들을 저장하는배열
	abstract String get(String key); // key 값으로 value를 검색
	abstract void put(String key, String value); // key와 value를 쌍으로 저장
	abstract String delete(String key); // key 값을 가진 아이템(value와 함께)을 삭제. 삭제된 value 값 리턴
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
	
}
