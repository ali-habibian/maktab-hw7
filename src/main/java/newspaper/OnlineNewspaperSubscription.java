package newspaper;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) {
        this.address = address;
        boolean atSignFlag = false;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '@') {
                atSignFlag = true;
                break;
            }
        }

        if (atSignFlag) {
            this.setRate(9);
        } else {
            System.out.println("Address is invalid.");
            this.setRate(0);
        }
    }
}
