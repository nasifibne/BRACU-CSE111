package task4;

public class MobilePhone {
    public String[] name ;
    public int[] contact ;
    public int count;

    public void setContactCapacity(int cap){
        name = new String[cap];
        contact = new int [cap];
    }
    public void details(){
        System.out.println("Total Contacts: " + count);
        System.out.println("Contact List:");
        if (count>0){
            for (int i = 0 ; i<count ;i++){
                System.out.println(name[i] + ":" + contact[i]);
            }
        }
    }
    public void addContact(String name , int num){
        if(count<name.length()) {
            this.name[count] = name;
            this.contact[count] = num;
            System.out.printf("The contact of %s is added.\n", this.name[count]);
            count++;
        }
        else{
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int num){
        int index=0;
        boolean flag = false;

        for (int i= 0 ; i<count ; i++){
            if(contact[i] == num){
                index= i ;
                flag =true;
                //break;
            }
        }

        if(flag){
            System.out.printf("Calling %s . . .\n", name[index]);
        }
        else {
            System.out.printf("Calling %d . . .\n", num);
        }
    }
}
