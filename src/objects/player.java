package objects;

public class player {

    private String long_name;
    private String age;
    private String dob;
    private String height_cm;
    private String weight_kg;
    private String nationality;
    private String club;

    public String getTeam_jersey_number() {
        return team_jersey_number;
    }

    public void setTeam_jersey_number(String team_jersey_number) {
        this.team_jersey_number = team_jersey_number;
    }

    private String team_jersey_number;

    public String getNumero_filas() {
        return numero_filas;
    }

    public void setNumero_filas(String numero_filas) {
        this.numero_filas = numero_filas;
    }

    private String numero_filas;

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHeight_cm() {
        return height_cm;
    }

    public void setHeight_cm(String height_cm) {
        this.height_cm = height_cm;
    }

    public String getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(String weight_kg) {
        this.weight_kg = weight_kg;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }


    @Override
    public String toString() {
        return "player{" +
                "long_name='" + long_name + '\'' +
                ", age='" + age + '\'' +
                ", dob='" + dob + '\'' +
                ", height_cm='" + height_cm + '\'' +
                ", weight_kg='" + weight_kg + '\'' +
                ", nationality='" + nationality + '\'' +
                ", club='" + club + '\'' +
                ", team_jersey_number='" + team_jersey_number + '\'' +
                ", numero_filas='" + numero_filas + '\'' +
                '}';
    }
}
