package ungrad1;

public class ConnectFriends {
    public int max;
    public int sent;
    public String name;
    public String frnd[] ;

    public ConnectFriends(String name){
        this.name = name;
        max=2;
        frnd = new String[max];
        System.out.printf("Welcome to ConnectFriends, %s\n",this.name);
    }
    public ConnectFriends(String name , int max){
        this.name = name;
        this.max = max;
        frnd = new String[max];
        System.out.printf("Welcome to ConnectFriends, %s\n",this.name);
    }
    public void sendFriendRequest(ConnectFriends s1){
        if(sent<max){
            frnd[sent++] = s1.name;
            System.out.printf("%s sent a friend request to %s.\n", this.name, s1.name);
        }
        else {
            System.out.printf("%s has reached the friend request limit!\n",this.name);
        }
    }
    public void  sendFriendRequest(ConnectFriends s1 , ConnectFriends s2){
        sendFriendRequest(s1);
        sendFriendRequest(s2);
    }
    public void showDetails(){
        System.out.printf("User name: %s\n",this.name);
        System.out.printf("Maximum number of sent Friend request: %d\n",this.max);
        System.out.printf("Total Friend Request: %d\n",this.sent);
        System.out.printf("Sent Friend Request ");
        for(int i =0 ; i<sent ; i++){
            System.out.printf(frnd[i] + " ");
        }
        System.out.printf("\n");
    }
    public void removeRequest(String s1){
        boolean flag = false;
        for (int i =0 ; i<sent ; i++){
            if(frnd[i].equals(s1)){
                flag = true;
                for(int j=i ; j<sent-1 ;j++){
                    frnd[j] = frnd[j+1];
                }
                sent--;
            }
        }
        if(flag){
            System.out.printf("Reuqest to add %s is removed for %s.\n",s1 , this.name);
        }
        else{
            System.out.printf("%s is not in %s's sent request list.\n",s1, this.name);
        }
    }
}
