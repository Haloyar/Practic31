public class Students {
    public String fullName;
    public String universityId;
    public int currentCourseNumber;
    public float avgExamScore;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public Students() {
        super();
    }

    @Override
    public String toString() {
        return "Students{" +
                "fullName ='" + fullName + '\'' +
                ", universityId ='" + universityId + '\'' +
                ", currentCourseNumber =" + currentCourseNumber +
                ", avgExamScore =" + avgExamScore +
                '}';
    }
}
