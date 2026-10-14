class Auction {
    String productName;
    double startingPrice;
    String winningBidder;
    double highestBid;

    Auction(String productName, double startingPrice) {
        this.productName = productName.toUpperCase();
        this.startingPrice = startingPrice;
        this.highestBid = startingPrice;
        this.winningBidder = "None";
    }

    void placeBid(String bidderName, double amount) {
        placeBid(bidderName, amount, true);
    }

    void placeBid(String bidderName, double amount, boolean display) {
        bidderName = bidderName.toUpperCase();

        System.out.println("Bidder Name   : " + bidderName);
        System.out.printf("Bid Amount    : Rs. %.2f%n", amount);

        if (amount > highestBid) {
            highestBid = amount;
            winningBidder = bidderName;
            System.out.println("Bid Status    : Bid Accepted");
        } else {
            System.out.println("Bid Status    : Bid Rejected - Bid Must Be Higher");
        }
    }

    void displaySummary() {
        System.out.println("\n---------- AUCTION SUMMARY ----------");
        System.out.println("Product Name   : " + productName);
        System.out.println("Winning Bidder  : " + winningBidder);
        System.out.printf("Final Bid Amount: Rs. %.2f%n", highestBid);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Auction a = new Auction("Laptop", 50000);

        System.out.println("========= ONLINE AUCTION PLATFORM =========");
        System.out.println("Product Name     : " + a.productName);
        System.out.printf("Starting Price   : Rs. %.2f%n%n", a.startingPrice);

        a.placeBid("Ravi", 52000);
        System.out.println();

        a.placeBid("Priya", 55000);
        System.out.println();

        a.placeBid("Ravi", 53000);

        a.displaySummary();
    }
}
