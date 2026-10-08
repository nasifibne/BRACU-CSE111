package lab2;

//Parent Class
class Waste {
    String id;

    Waste(String id) {
        this.id = id;
    }
}

//Disjoint Class
class SorterBot {
    public void processItem(Waste item) {
        //WRITE YOUR CODE HERE
        if(item instanceof UsedBattery){
            UsedBattery ub = (UsedBattery) item;
            System.out.println("Scanning Item " + ub.id + " [Type: BATTERY]" );
            if(ub.used){
                System.out.println("Duracell-X is leaking. Sealing in concrete container.");
            }
            else {
                System.out.println("Energizer stored in dry cell.");
            }
        }
        else if(item instanceof  Waste){
            System.out.println("Scanning Item "+ item.id+ " [Type: UNKNOWN]\nItem sent to generic incinerator.");
        }
        else if(item instanceof PlasticBottle){
            PlasticBottle pb = (PlasticBottle) item;
            System.out.println("Scanning Item "+pb.id+" [Type: PLASTIC]");
            System.out.println(pb.used + " compressed from 500ml to flat disk.");
        }
        System.out.println("-------------------------------");
    }
}
