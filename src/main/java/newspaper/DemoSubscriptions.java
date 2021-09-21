package newspaper;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalSub1 = new PhysicalNewspaperSubscription();
        PhysicalNewspaperSubscription physicalSub2 = new PhysicalNewspaperSubscription();

        OnlineNewspaperSubscription onlineSub1 = new OnlineNewspaperSubscription();
        OnlineNewspaperSubscription onlineSub2 = new OnlineNewspaperSubscription();

        System.out.println("-----------------------------");
        physicalSub1.setName("physicalSub_1");
        physicalSub1.setAddress("physicalSub_1_Address");

        System.out.print("Name: " + physicalSub1.getName());
        System.out.print(" ,Address: " + physicalSub1.getAddress());
        System.out.println(" ,Rate: " + physicalSub1.getRate());

        System.out.println("-----------------------------");
        physicalSub2.setName("physicalSub_2");
        physicalSub2.setAddress("physicalSub_two_Address");
        System.out.print("Name: " + physicalSub2.getName());
        System.out.print(" ,Address: " + physicalSub2.getAddress());
        System.out.println(" ,Rate: " + physicalSub2.getRate());

        System.out.println("-----------------------------");
        onlineSub1.setName("onlineSub_1");
        onlineSub1.setAddress("onlineSub_1@address");

        System.out.print("Name: " + onlineSub1.getName());
        System.out.print(" ,Address: " + onlineSub1.getAddress());
        System.out.println(" ,Rate: " + onlineSub1.getRate());

        System.out.println("-----------------------------");
        onlineSub2.setName("onlineSub_2");
        onlineSub2.setAddress("onlineSub_2_address");

        System.out.print("Name: " + onlineSub2.getName());
        System.out.print(" ,Address: " + onlineSub2.getAddress());
        System.out.println(" ,Rate: " + onlineSub2.getRate());
    }
}
