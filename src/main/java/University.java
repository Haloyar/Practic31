


public class University<StudyProfile> {
    public String id;
    public String fullName;
    public String shortName;
    public int yearOfFoundation;
    public StudyProfile mainProfile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public University() {
        super();
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName ='" + fullName + '\'' +
                ", shortName ='" + shortName + '\'' +
                ", yearOfFoundation =" + yearOfFoundation +
                ", mainProfile =" + mainProfile +
                '}';
    }
}
