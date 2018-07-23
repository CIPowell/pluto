package pluto.models;

public class Match {
    private Innings[] innings;
    private String location;
    private String weather;
    
    public Match(String location, String weather) {
        this.innings = new Innings[2];
        this.location = location;
        this.weather = weather;
    }

    public void toss(String teamBattingFirst, String teamBattingSecond){
        for (int i = 0; i < innings.length; i++){
            innings[i] = new Innings(i % 2 == 0 ? teamBattingFirst : teamBattingSecond);
        }
    }

    public String getLocation() {
        return location;
    }

    public String getWeather() {
        return weather;
    }

    public String getSmallScore() {
        String score = "";

        for(int i = 0; i < innings.length; i++) {
            score += innings[i].toString() + "\n";
        }

        return score;
    }
}