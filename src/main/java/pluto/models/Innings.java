package pluto.models;

class Innings {
    private long runs;
    private long wickets;

    private final String teamName;

    private long wides;

    public Innings(String teamName) {
        this.runs = 0;
        this.wickets = 0;
        this.teamName = teamName;
    }

    public long getRuns() {
        return runs;
    }

    public long getWickets() {
        return wickets;
    }

    public String toString() {
        return String.format("%s %d-%d", teamName, runs, wickets);
    }
}