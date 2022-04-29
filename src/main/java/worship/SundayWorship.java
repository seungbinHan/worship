package worship;

import common.OfferingKind;
import partOfWorship.Bible;
import partOfWorship.Offering;
import partOfWorship.Praise;
import partOfWorship.Pray;
import partOfWorship.Word;

public class SundayWorship implements Worship {

  Praise praise;
  Pray pray;
  Bible bible;
  Word word;
  Offering offering;
  @Override
  public void prepare() {
    praise = new Praise().builder()
        .singers(new String[]{"이싱어", "김싱어"})
        .praises(new String[]{"솟아오르자", "사랑의길"})
        .build();
    pray = new Pray().builder()
        .prayer("대표기도자1")
        .script("사랑하는 하나님......")
        .build();
    bible = new Bible().builder()
        .verse("요 3:16")
        .content("하나님이 세상을 이처럼 사랑하사...")
        .build();
    word = new Word().builder()
        .speacher("목사님")
        .wordScript("주님의 말씀을 전합니다...")
        .build();
    offering = new Offering();
    offering.setPrice( 15000000);
    offering.setKind(OfferingKind.Teeth);
  }

  @Override
  public void serve() {
    prepare();
    System.out.println("----------------주일예배----------------");
    System.out.print("찬양인도 :");
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
    System.out.println("봉헌 :" +offering.getKind());
    System.out.println("헌금액 :" +offering.getPrice());
  }


}
