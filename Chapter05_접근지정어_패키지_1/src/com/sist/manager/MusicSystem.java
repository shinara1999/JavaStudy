package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import lombok.Getter;
import lombok.Setter;

/*
 * 		class A
 * 		{
 * 			int aa;
 * 			static int bb;
 * 		}
 * 
 * 		A a=new A(); => a.aa
 * 		A.bb => static은 생성자 호출 없이 접근 가능하다.
 */

/*
 * 		<tr class="list hover">
		<td class="number">1</td>
		<td class="td-rank"><span class='rank'><span class=' rank-none '><span class="rank-txt">변동 없음</span></span></span></td>
		<td class="info">
			<a href="#" class="cover" onclick="fnViewAlbumLayer(84181610);return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/084/181/610/84181610_1692585955705_1_140x140.JPG" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="앨범 제목이 들어갑니다." /></a>
			<a href="#" class="title ellipsis" title="새창 열림" onclick="fnPlaySong('103151984','1');return false;">Love Lee</a>
			<a href="#" class="artist ellipsis" onclick="fnViewArtist(80197389); return false;">AKMU (악뮤)</a>
		</td>
		<td class="btns"><a href="#" class="btn-basic btn-listen" title="새창 열림" onclick="fnPlaySong('103151984','1'); return false;">듣기</a></td>
		<td class="btns"><a href="#" class="btn-basic btn-add" title="새창 열림" onclick="fnPlaySong('103151984','3'); return false;">재생목록에 추가</a></td>
		<td class="more">
			<div class="toggle-button-box duplicate-add-album">
				<button type="button" class="btn btn-basic btn-more">더보기</button>
				<div class="list">
					<div class="duration ranking-1">
						<span class="ranking"><strong class="btn-radius">1위</strong>연속 9시간 째</span>
						<span class="top10"><strong class="btn-radius">TOP10</strong>연속 9시간 째</span>
					</div>
					<div id="svgContainer-1" class="svg-container"></div>
					<div class="time">
						<span class="hour">h</span>
<span>05</span><span>06</span><span>07</span><span>08</span><span>09</span><span>10</span><span>11</span><span>12</span><span>13</span><span>14</span><span>15</span><span>16</span>
					</div>
					<div class="ranking-link ranking-1">
						<span class="active">1위</span>
						<span>2위</span>
						<span>3위</span>
					</div>

					<div class="more-btns">
						<button type="button" id="add_my_album_103151984" class="btn-basic btn-album" songId=103151984 onclick="fnAddMyAlbumForm('#add_my_album_103151984','103151984',0,30);return false;">마이앨범에 담기</button>
						<a href="#" class="btn-basic btn-down" title="새창 열림" onclick="fnDownSong('103151984');return false;">다운로드</a>
						<span class="lyr-chart-mv lyr-mv" id="list-mv_103151984">
							<a href="#" class="btn-basic btn-mv" title="새창 열림" onclick="fnPlayMv('103151984',3);return false;">뮤직비디오 보기</a>
						</span>
					</div>
					<button type="button" class="close btn-close">닫기</button>
				</div>
			</div>
		</td>
	</tr>
 */

public class MusicSystem {
	@Getter // 저장된 값 가져오기
	@Setter // 값 저장
	private static Music[] musics=new Music[50]; // private으로 데이터를 감추고 getter/setter로 메소드에 접근한다.
	static // 자동으로 초기화시킬때 사용하는 블럭
	{
		// 초기화 블록 => static 변수만 사용 가능 => 자동 인식
		// 상속은 불가능 => 호출 없이 실행이 가능
		// 생성자를 이용할 수 있다.
		//	1. 예외처리 => io(파일, 메모리, 네트워크) => 프로그램의 정상 종료
		//	<table class="list-wrap">
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap td.info a.title");
			System.out.println(title);
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			
			for(int i=0;i<title.size();i++)
			{
				musics[i]=new Music(); // 주소 할당
				musics[i].setMno((i+1));
				musics[i].setTitle(title.get(i).text()); // setter
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				// musics[i].title
			}
		}catch(Exception ex) {}
	}
	
}
