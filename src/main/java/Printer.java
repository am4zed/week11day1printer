public class Printer {
    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner) {
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }


    public int checkPaper() {
        return this.sheetsLeft;
    }

    public int sheetsNeeded(int pages, int copies) {
        return pages * copies;
    }


    public void print(int pages, int copies) {
        int sheetsReq = sheetsNeeded(pages, copies);
        if (sheetsLeft >= sheetsReq && sheetsReq <= toner){
            sheetsLeft -= sheetsReq;
            toner -= sheetsReq;
        }
        else if(sheetsLeft < sheetsReq){
            System.out.println("Please, load more paper!");
        }
        else if(sheetsReq > toner){
            System.out.println("Please, load more toner!");
        }
    }

    public void refill(int sheets) {
        this.sheetsLeft += sheets;
    }

    public int checkTonerVolume() {
        return this.toner;
    }


}
