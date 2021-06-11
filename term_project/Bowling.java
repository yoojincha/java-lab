/*
 * [ Term Project ]
 * 
 * 파일명: Bowling.java
 * 이름: 차유진
 * 소속: 인문대학 영어영문학과
 * 학번: 20151816
 * 
 * 볼링 게임
 * 
 * - 2016년 새롭게 도입된 커런트 프레임 스코어링 방식 선택
 * - 오픈의 경우 쓰러진 핀의 수만큼 점수 합산
 * - 스트라이크의 경우 30점, 스페어의 경우 첫 투구에서 쓰러진 핀 수 + 10점
 * - 각 플레이어에게 10번의 프레임이 주어지고, 프레임 당 두 번의 투구 기회가 있다
 * - 스트라이크의 경우 두번째 투구 없이 다음 선수로 넘어간다
 * 
 */

import java.util.*;

public class Bowling {
	
	static int pin; // 남은 볼링 핀의 개수 
	static int round; // 총 20번의 투구를 진행하기 위한 변수
	static int clevel; // 컴퓨터의 레벨
	static int plevel; // 사용자의 레벨
	static int[] computer = new int[20]; // 컴퓨터의 점수를 기록하기 위한 배열
	static int[] cscore = new int[20]; // 컴퓨터의 누적 점수를 기록하기 위한 배열
	static int[] player = new int[20]; // 사용자의 점수를 기록하기 위한 배열
	static int[] pscore = new int[20]; // 사용자의 누적 점수를 기록하기 위한 배열
	static int ctotal=0; // 컴퓨터의 누적 점수를 계산하기 용이하도록 사용한 임시변수 
	static int ptotal=0; // 사용자의 누적 점수를 계산하기 용이하도록 사용한 임시변수 
	
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	public static void main(String[] args) {
		
		// 컴퓨터와 사용자의 레벨을 각각 입력받기
		System.out.print("computer의 레벨을 선택하세요\n1.초보자\n2.중급자\n3.상급자\n>> ");
		clevel = scanner.nextInt();
		System.out.print("\nplayer의 레벨을 선택하세요\n1.초보자\n2.중급자\n3.상급자\n>> ");
		plevel = scanner.nextInt();
		
		// 10개의 프레임에 각 두번의 투구가 있으므로 20번의 투구 진행
		for(round=0; round<20;) {
			Computer(round, clevel); // Computer의 투구 메소드
			Player(round, plevel); // 사용자의 투구 메소드
			round += 2; // 각 프레임에 두번의 투구를 진행하므로 한번에 +2
			Display(computer, player, round+1); // 출력 메소드
		}
		System.out.println("");
		// 마지막 총점수에 따라 최종 결과 메세지 출력
		if(ctotal>ptotal) System.out.println("패배");
		if(ctotal<ptotal) System.out.println("승리");
		if(ctotal==ptotal) System.out.println("무승부");
	}

	// 컴퓨터의 투구 메소드
	static void Computer(int i, int clevel) {

		switch(clevel) { // 입력받은 레벨에 따라 확률을 다르게 함
		
		case 1: // 초보자의 경우
			pin = 10; // 핀 10개로 시작
			computer[i] = random.nextInt(11); // 0~10까지의 정수 랜덤 생성하여 i번째 투구에 값 넣어줌
			if(computer[i] == 10) { // 생성된 정수가 10일 경우(스트라이크)
				computer[i] += 20; // 이미 저장된 10에 20점 추가 (스트라이크 총 30점)
				break; // 스트라이크의 경우 두번째 투구 진행하지 않음
			}
			pin -= computer[i]; // 첫 투구에서 쓰러뜨리고 남은 핀의 개수
			computer[i+1] += random.nextInt(pin+1); // 0부터 남은 핀 개수 사이의 정수 랜덤 생성하여 두번째 투구 자리에 넣어줌
			// 첫번째 투구 + 두번째 투구 = 10일경우(스페어) 첫 투구에서 쓰러뜨린 핀의 수 +10이 점수가 됨
			if(computer[i]+computer[i+1] == 10) computer[i+1] = 10-pin+10;
			break;
			
		case 2:  // 중급자의 경우
			pin = 10;
			computer[i] = random.nextInt(6)+5; // 항상 5핀 이상 쓰러뜨리도록 설정
			if(computer[i] == 10) {
				computer[i] += 20;
				break;
			}
			pin -= computer[i];
			computer[i+1] += random.nextInt(pin+1);
			if(computer[i]+computer[i+1] == 10) computer[i+1] = 10-pin+10;
			break;
			
		case 3:  // 상급자의 경우
			pin = 10;
			computer[i] = random.nextInt(3)+8; // 항상 8핀 이상 쓰러뜨리도록 설정
			if(computer[i] == 10) {
				computer[i] += 20;
				break;
			}
			pin -= computer[i];
			computer[i+1] += random.nextInt(pin+1);
			if(computer[i]+computer[i+1] == 10) computer[i+1] = 10-pin+10;
			break;
		}
		
	}
	
	// 사용자의 투구 메소드 (컴퓨터 투구와 동일)
	static void Player(int i, int plevel) {

		switch(plevel) {
		
		case 1:
			pin = 10;
			player[i] = random.nextInt(11);
			if(player[i] == 10) {
				player[i] += 20;
				break;
			}
			pin -= player[i];
			player[i+1] += random.nextInt(pin+1);
			if(player[i]+player[i+1] == 10) player[i+1] = 10-pin+10;
			break;
			
		case 2:
			pin = 10;
			player[i] = random.nextInt(6)+5;
			if(player[i] == 10) {
				player[i] += 20;
				break;
			}
			pin -= player[i];
			player[i+1] += random.nextInt(pin+1);
			if(player[i]+player[i+1] == 10) player[i+1] = 10-pin+10;
			break;
			
		case 3:
			pin = 10;
			player[i] = random.nextInt(3)+8;
			if(player[i] == 10) {
				player[i] += 20;
				break;
			}
			pin -= player[i];
			player[i+1] += random.nextInt(pin+1);
			if(player[i]+player[i+1] == 10) player[i+1] = 10-pin+10;
			break;
		}
		
	}
	
	// 출력 메소드
	static void Display(int[] computer, int []player, int round){
		System.out.println("");
		System.out.println("Round "+round/2); // 각 투구가 아닌 프레임의 번호를 출력하도록 /2 해줌
		System.out.println("====================================================================================");
		
		// 컴퓨터 점수 출력
		System.out.print("|| Computer |");
		ctotal = 0;
		for(int j = 0; j<20;) {
			ctotal += computer[j]+computer[j+1]; // 프레임의 점수 = 첫투구와 두번째 투구에서 얻은 점수의 합산
			if(computer[j+1]>10) ctotal -=  computer[j]; // 두번째 투구에서 스페어를 했을 경우 중복으로 점수 합산이 되지 않도록 첫 투구의 값을 빼줌
			cscore[j] = ctotal; // 점수 배열에 저장
			
			if(round<=j+1) System.out.printf("     |"); // 진행하지 않은 프레임은 공백으로 출력
			else if(computer[j]==30) System.out.printf("  X  |"); // 스트라이크의 경우 X 출력
			else if(computer[j]==0) { // 첫 투구에서 핀을 아무것도 쓰러뜨리지 못했을 때
				if(computer[j+1]==0) System.out.printf(" -  -|"); // 두번째 투구에서도 0개 핀일 경우 두 투구 모두에 대해 - 출력
				else if(computer[j+1] != 10) System.out.printf(" - %2d|",computer[j+1]); // 두번째 투구에서 쓰러뜨린 핀이 있을 경우
				else System.out.printf(" -  /|"); // 두번째 투구에서 스페어 했을 경우
			}
			else if(computer[j+1]>=10) System.out.printf("%2d  /|",computer[j]); // 첫 투구에서 쓰러뜨린 핀이 있고, 두번째에서 스페어를 한 경우
			else System.out.printf("%2d %2d|",computer[j],computer[j+1]); // 첫 투구에서 쓰러뜨린 핀이 있고, 두번째에서 스페어를 하지 못한 경우
			j+=2; // 다음 프레임으로 넘어감
		}
		System.out.printf("  Total  ");
		
		System.out.println("||");
		System.out.println("||          |-----------------------------------------------------------|         ||");
		System.out.print("||          |");
		for(int j = 0; j<20;) {
			if(round<=j+1) System.out.printf("     |"); // 진행하지 않은 프레임은 공백으로 출력
			else System.out.printf(" %3d |",cscore[j]); // 배열에 저장해둔 누적 점수 출력
			j+=2;
		}
		System.out.printf("   %3d   ||",ctotal); // 현재까지 총 점수 출력
		System.out.println("");
		System.out.println("||--------------------------------------------------------------------------------||");
		
		// 사용자 점수 출력
		System.out.print("|| Player   |");
		ptotal = 0;
		for(int j = 0; j<20;) {
			ptotal += player[j]+player[j+1];
			if(player[j+1]>10) ptotal -=  player[j];
			pscore[j] = ptotal;
			
			if(round<=j+1) System.out.printf("     |");
			else if(player[j]==30) System.out.printf("  X  |");
			else if(player[j]==0) {
				if(player[j+1]==0) System.out.printf(" -  -|");
				else if(player[j+1] != 10) System.out.printf(" - %2d|",player[j+1]);
				else System.out.printf(" -  /|");
			}
			else if(player[j+1]>=10) System.out.printf("%2d  /|",player[j]);
			else System.out.printf("%2d %2d|",player[j],player[j+1]);
			j+=2;
		}
		System.out.printf("  Total  ");
		
		System.out.println("||");
		System.out.println("||          |-----------------------------------------------------------|         ||");
		System.out.print("||          |");
		for(int j = 0; j<20;) {
			if(round<=j+1) System.out.printf("     |");
			else System.out.printf(" %3d |",pscore[j]);
			j+=2;
		}
		System.out.printf("   %3d   ||",ptotal);
		System.out.println("");
		System.out.println("====================================================================================");
	}
}