import RepetitionCount.GeneratingOTPs;
import RepetitionCount.MaxRepetition;
import frontend.*;

public class Main {
    public static void main(String[] args) {

        /********** frontend implementation part **********/
        new SendOTP();

        /**********
         * bulk generation
         **********/

        int NUMBER_OF_OTP_TO_GENERATE = 10000;
        GeneratingOTPs.generateOTP(NUMBER_OF_OTP_TO_GENERATE);

        /********** using sorting algorithm **********/
        int NUMBER_OF_COUNT = 4000;
        MaxRepetition.sortAndCheckRepetition(NUMBER_OF_COUNT);

    }

}
