package mediateka;
public class VideoDVD extends Media {
    private String director;

    public VideoDVD(String ty, String n, String di, String sz, String d) {
        setType(ty);
        setName(n);
        setDirector(di);
        setSize(sz);
        setDuration(d);
    }

    public String toString() {
        return "Type: " + getType() + " Name: " + getName() + " Director: " + getDirector() + " Size in mb: "
                + getSize() + " Duratin: "
                + getDuration();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
