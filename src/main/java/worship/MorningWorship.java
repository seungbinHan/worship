package worship;

import partOfWorship.Bible;
import partOfWorship.Praise;
import partOfWorship.Pray;
import partOfWorship.Word;

public class MorningWorship implements Worship {
  Praise praise;
  Pray pray;
  Word word;

  @Override
  public void prepare() {

    praise = new Praise().builder()
        .singers(new String[]{"김새벽"})
        .praises(new String[]{"그의 뜻은", "날 불러줘요"})
        .build();
    pray = new Pray().builder()
        .prayer("다같이")
        .script("각자 기도하겠습니다.")
        .build();

    word = new Word().builder()
        .speacher("김강도사")
        .wordScript("오늘의 잠언입니다...")
        .build();
  }

  @Override
  public void serve() {
    prepare();
    System.out.println("----------------새벽예배----------------");
    System.out.print("찬양인도:");
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
    System.out.println("설교자 :"+ word.getSpeacher());
    System.out.println("설교내용 :"+ word.getWordScript());
  }
}
