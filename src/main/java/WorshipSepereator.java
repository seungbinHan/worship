import common.WorshipKinds;
import worship.MorningWorship;
import worship.SundayWorship;
import worship.WednesdayWorship;
import worship.Worship;

public class WorshipSepereator {
  public Worship matcher(WorshipKinds WorshipName){
    Worship worship = null;

    if(WorshipName.equals(WorshipKinds.sunday)){
      worship = new SundayWorship();
    }else if(WorshipName.equals(WorshipKinds.wednesday)){
      worship = new WednesdayWorship();
    }else if(WorshipName.equals(WorshipKinds.morning)){
      worship = new MorningWorship();
    }
    return worship;
  }

}
