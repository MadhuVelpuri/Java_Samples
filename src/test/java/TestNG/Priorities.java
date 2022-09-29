package TestNG;

import org.testng.annotations.Test;

public class Priorities {

        // "check-mail" group test method.
        @Test(groups = { "check-mail" }, priority = 0)
        public void logIn() {
            System.out.println("Log In.");
        }

        @Test(groups = { "check-mail" }, priority = 0)
    public void logIn1() {
        System.out.println("Log In1.");
    }


        // Do not have any group.
        @Test(groups = { "ViewNews" }, priority = 2)
        public void viewNews() {
            System.out.println("Viewing News.");
        }

        // "check-mail" group test method.
        @Test(groups = { "check-mail" }, priority = 1)
        public void checkMail() {
            System.out.println("Checking Mail.");
        }

        @Test(groups = {"work"},priority = -1)
        public void ThoughtOfWork() {
        System.out.println("Thought of doing work all the time.");
    }


        // "check-mail" group test method.
        @Test(groups = { "check-mail" }, priority = 4)
        public void logOut() {
            System.out.println("Logout.");

        }
    }
