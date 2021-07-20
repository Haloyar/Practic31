public class Main {
    public static void main(String[] args) {
        University uni = new University();

    }
    public enum StudyProfile {
        MEDICINE ("Медицина"),
        PHYSHICS ("Физика"),
        ARCHITECTURE ("Архитектура"),
        FILOSOPHY ("Философия"),
        HISTORY ("История");

        private final String profileName;
        StudyProfile (String profileName) {
            this.profileName = profileName;
        }
        private String getProfileName() {
            return profileName;
        }

    }

}
