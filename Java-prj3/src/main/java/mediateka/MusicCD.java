package mediateka;
public class MusicCD extends Media {

    public MusicCD(String ty, String n, String a, String t, String sz, String d) {
        setType(ty);
        setName(n);
        setArtist(a);
        setTitle(t);
        setSize(sz);
        setDuration(d);
    }

    public String toString() {
        return "Type: " + getType() + " Name: " + getName() + " Artist: " + getArtist() + " Title: " + getTitle()
                + " Size in mb: "
                + getSize() + " Duratin: "
                + getDuration();
    }

}
