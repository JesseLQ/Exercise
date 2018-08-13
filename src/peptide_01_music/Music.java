package peptide_01_music;

//音符
enum Note {
    MIDDLE_C, V_SHARP, B_FLAT;
}

//乐器
class Instrument {
    void play(Note n) {
        System.out.println("Instrument play()");
    }
}

//子乐器
class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play()");
    }
}

//音乐
public class Music {
    //调子
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
