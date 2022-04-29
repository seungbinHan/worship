package worship;

import common.OfferingKind;
import partOfWorship.Bible;
import partOfWorship.Offering;
import partOfWorship.Praise;
import partOfWorship.Pray;
import partOfWorship.Word;

public class WednesdayWorship implements Worship {

  Praise praise;
  Pray pray;
  Bible bible;
  Word word;

  @Override
  public void prepare() {

    praise = new Praise().builder()
        .singers(new String[]{"박싱어", "한싱어"})
        .praises(new String[]{"의인의삶", "사랑의 혼인잔치"})
        .build();
    pray = new Pray().builder()
        .prayer("대표기도자1")
        .script("사랑하는 삼위께......")
        .build();
    bible = new Bible().builder()
        .verse("요 3:16")
        .content("하나님이 세상을 이처럼 사랑하사...")
        .build();
    word = new Word().builder()
        .speacher("부교역자님")
        .wordScript("주일말씀 속편 말씀입니다...")
        .build();


  }

  @Override
  public void serve() {
    prepare();
    System.out.println("----------------수요예배----------------");
    System.out.print("찬양인도 및 싱어 :");
    for (var singers: praise.getSingers()){
      System.out.println(singers);
    }
    System.out.print("찬양곡 : ");
    for (var praise: praise.getPraises()){
      System.out.println(praise);
    }
    System.out.println("대표기도자 :" + pray.getPrayer());
    System.out.println("대표기도문 :" + pray.getScript());
    System.out.println("성경봉독");
    System.out.println("성경구절 :" + bible.getVerse());
    System.out.println(bible.getContent());
    System.out.println("설교자 :"+ word.getSpeacher());
    System.out.println("설교내용 :"+ word.getWordScript());

  }
}
