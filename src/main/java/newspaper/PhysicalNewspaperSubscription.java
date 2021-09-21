package newspaper;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) {
        this.address = address;
        boolean digitFlag = false;
        for (int i = 0; i < address.length(); i++) {
            if (Character.isDigit(address.charAt(i))) {
                digitFlag = true;
                break;
            }
        }

        if (digitFlag) {
            this.setRate(15);
        } else {
            System.out.println("Address is invalid.");
            this.setRate(0);
        }
    }
}
