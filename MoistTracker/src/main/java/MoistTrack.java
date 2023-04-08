public class MoistTrack {

    private int userWeight = 0;
    private int userCup = -1;
    public static double neededCupsPercentage;

    public static String messagetoUser;

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }

    public int getUserCup() {
        return userCup;
    }

    public void setUserCup(int userCup) {
        this.userCup = userCup;
    }

    public double getNeededCupsPercentage() {
        return neededCupsPercentage;
    }

    public void setNeededCupsPercentage(double neededCupsPercentage) {
        this.neededCupsPercentage = neededCupsPercentage;
    }

    public String getMessagetoUser() {
        return messagetoUser;
    }

    public void setMessagetoUser(String messagetoUser) {
        this.messagetoUser = messagetoUser;
    }

    public void calculateNeededCupsPercentage() {
        neededCupsPercentage = (userCup * 8) / userWeight;
    }


}
