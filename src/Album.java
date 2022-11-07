import java.util.*;
public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist){
        this.name = albumName;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration){
        Song song = new Song(songTitle, duration);
        if(findSong(songTitle)!=null){
            return false;
        }
        songs.add(song);
        return true;
    }

    public boolean addToPlayList(int trackno, LinkedList<Song> playlist){
        int c = trackno-1;
        if(c>=0 && c<songs.size()){
            Song song = songs.get(c);
            playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist){
        Song song = findSong(songTitle);
        if(song==null){
            return false;
        }
        playlist.add(song);
        return true;
    }

    private Song findSong(String songTitle){
        for(int i=0;i<songs.size();i++){
            Song song = songs.get(i);
            if(song.getTitle().equals(songTitle)){
                return song;
            }
        }
        return null;
    }
}

class Song {
    private String title;
    private double duration;

    public Song(String songTitle, double duration){
        this.title = songTitle;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return this.title+": "+this.duration;
    }
}