package ungraded1;

class KKFlavouredTea extends KKTea {
    public KKFlavouredTea(String flavor, int price, int teaBags) {
        // Calls the protected constructor of KKTea to set the specific flavor name
        super("KK " + flavor + " Tea", price, teaBags);
    }

    public static void updateSoldStatusFlavoured(KKFlavouredTea t) {
        t.status = true;
        flavouredCount++;
    }
}