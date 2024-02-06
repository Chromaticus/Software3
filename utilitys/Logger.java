package utilitys;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Logger {

    private static final String logPath = "login_activity.txt";

    public static void log(String userName, Boolean successful) throws IOException {
        try {

            BufferedWriter logger = new BufferedWriter(new FileWriter(logPath, true));
            logger.append(ZonedDateTime.now(ZoneOffset.UTC).toString() + " UTC-LOGIN ATTEMPT-USERNAME: " + userName +
                    " LOGIN SUCCESSFUL: " + successful.toString() + "\n");
            logger.flush();
            logger.close();
        }
        catch (IOException error) {
            error.printStackTrace();
        }

    }
}
