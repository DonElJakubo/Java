package nowe;

//You are given a string containg a detailed list of files. Your task is to evaluate a simple query on a certain subset of these files.
//        The string consist of N lines separated by end-of-line characters (ASCII code 10). Each line contains information about one file, grouped in three columns: size, date and name (in the order). The columns (expect for the last one) have fixed lengths and are separated by one space. They have the folowing formats and meanings:
//        Column size has length 10 and contains the size of the file in bytes. The size is less than 2^31 bytes and is alligned to the right.
//        Column date has lenght 11 and contains the last modification date of the file in the format "dd MMM yyyy".  The names of the months are Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, and Dec.
//        Column name is of variable length and contains the name of file. Thne name of the file consists of at most 255 printable ASCII characters and contains at least one dot character.
//        We are only interested in files that satisfy the following criteria:
//        Their size is larger than or equal to 240*2^10 bytes.
//        They were last midified after 31 Jan 1990.
//        Calculate the quantity of these files.
//        Write a function:
//class nowe.Solution {
//    public String solution(String S);
//}
//that, given a string S describing the file list, returns the answer to the query, encoded as a string. If there are no files satisfying the criteria listed above, the function should return "NO FILES".
//        working with example, where given string S with N = 8 lines (enclosed between """):
//"""
//        779091968 23 Sep 2009 system.zip
//        284164096 14 Aug 2013 to-do-list.xml
//        714080256 19 Jun 2013 blockbuster.mpeg
//        329 12 Dec 2010 notes.html
//        444596224 17 Jan 1950 delete-this.zip
//        641 24 May 1987 setup.png
//        245760 16 Jul 2005 archive.zip
//        839909376 31 Jan 1990 library.dll
//        """
//the function should return "4".
//
//Asume that:
//N is an integer within the range [1..100];
//string S consists only of printable ASCII characters;
//String S is a correct list of files according to the specification above. Files can have the same names.
class Solution3 {
    public String solution(String S) {
        String[] files = S.split("\n");
        int count = 0;
        for (String file : files) {
            String[] fileInfo = file.trim().split("\\s+");
            int size = Integer.parseInt(fileInfo[0]);
            int day = Integer.parseInt(fileInfo[1]);
            int month = getMonthNumber(fileInfo[2]);
            int year = Integer.parseInt(fileInfo[3]);
            // check criteria
            if (size >= 240 * 1024 && year > 1990 || (year == 1990 && month > 1) || (year == 1990 && month == 1 && day > 31)) {
                count++;
            }
        }
        return count == 0 ? "NO FILES" : Integer.toString(count);
    }

    private int getMonthNumber(String month) {
        switch (month) {
            case "Jan": return 1;
            case "Feb": return 2;
            case "Mar": return 3;
            case "Apr": return 4;
            case "May": return 5;
            case "Jun": return 6;
            case "Jul": return 7;
            case "Aug": return 8;
            case "Sep": return 9;
            case "Oct": return 10;
            case "Nov": return 11;
            case "Dec": return 12;
            default: return 0;
        }
    }
}