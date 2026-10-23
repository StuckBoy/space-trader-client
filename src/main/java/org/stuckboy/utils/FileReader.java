package org.stuckboy.utils;

import org.stuckboy.constants.Constants;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class FileReader {
    private FileReader() {}

    public static String readSpaceTraderSecret() {
        String result = "";
        File file = new File(Constants.SECRET_DIR + Constants.SPACE_TRADER_SECRET);
        try (Scanner scanner = new Scanner(file)) {
            result = scanner.nextLine();
        } catch (FileNotFoundException ex) {
            System.err.println("Could not find file");
        }
        return result;
    }

    public static String readAgentSecret(String agentName) {
        String result = "";
        File file = new File(Constants.SECRET_DIR + Constants.AGENT_SECRET + agentName.toLowerCase());
        try (Scanner scanner = new Scanner(file)) {
            result = scanner.nextLine();
        } catch (FileNotFoundException ex) {
            System.err.println("Could not find file");
        }
        return result;
    }
}
