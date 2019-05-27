public class Printer {
    private int numOfSheetsPaperLeft;
    private int numOfCopies;
    private int numOfPages;

    public Printer(int numOfSheetsPaperLeft, int numOfCopies, int numOfPages) {
        this.numOfSheetsPaperLeft = numOfSheetsPaperLeft;
        this.numOfCopies = numOfCopies;
        this.numOfPages = numOfPages;
    }

    public int getNumOfSheetsPaperLeft() {
        return this.numOfSheetsPaperLeft;
    }

    public int getNumOfCopies() {
        return this.numOfCopies;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }

    public int NumOfPagesAndCopied() {
        return (this.numOfPages - this.numOfCopies);
    }
}
