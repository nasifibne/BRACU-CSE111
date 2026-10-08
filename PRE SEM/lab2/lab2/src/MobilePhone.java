public class MobilePhone {
    public String[] name;
    public int[] num;
    public int count =0;
    public int cap;

    public void setContactCapacity(int x){
        cap =x;
        this.name = new String[cap];
        this.num= new int [cap];
        this.count=0;
    }
    public void details(){
        System.out.println("total contact " + count);
        System.out.println("Contact List:");
        if (count==0){
        }
        else{
            for (int i=0 ; i<count ; i++){
                System.out.println(name[i] +":" + num[i]);
            }
        }
    }
    public void addContact(String s , int x){
        if(count<cap){
            name[count] = s;
            num[count] = x;
            count++;
            System.out.println("The contact of "+ s +" is added.");
        }
        else{
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int x){
        String temp="";
        boolean flag = false;
        for(int i =0 ; i<count ; i++){
            if (num[i] == x){
                temp = name[i];
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println( "calling " +  temp + "... " );
        }
        else {
            System.out.println( "calling " +  x + "... ");
        }
    }
}
