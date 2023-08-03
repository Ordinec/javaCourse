package homework19;

public class Translations {
    private String english;
    private String japanese;
    private String german;

    public Translations(String english, String japanese, String german){
        this.english = english;
        this.japanese = japanese;
        this.german = german;
    }

    public void setEnglish(String english){
        this.english = english;
    }

    public void setJapanese(String japanese){
        this.japanese = japanese;
    }

    public void setGerman(String german){
        this.german = german;
    }

    public String getEnglish(){
        return this.english;
    }

    public String getJapanese(){
        return this.japanese;
    }

    public String getGerman(){
        return this.german;
    }

    @Override
    public String toString(){
        return english + ", " + japanese + ", " + german;
    }

    @Override
    public boolean equals(Object obj){
        Translations other = (Translations) obj;
        return this.english.equals(other.english) &&
                this.japanese.equals(other.japanese) &&
                this.german.equals(other.german);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + english.hashCode();
        result += 31 * result + japanese.hashCode();
        result += 31 * result + german.hashCode();
        return result;
    }
}
