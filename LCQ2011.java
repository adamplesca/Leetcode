class LCQ2011 {
    public int finalValueAfterOperations(String[] operations) {
        //iterates through a string array, which adds or subtracts if finds the correct text
        int num = 0;

        for (String operation : operations) {
            if (operation.equals("--X") || operation.equals("X--")) {
                num -= 1;
            } else if (operation.equals("++X") || operation.equals("X++")) {
                num += 1;
            }
        }
        return num;
    }
}