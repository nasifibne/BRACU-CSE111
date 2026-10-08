package home4;

public class ConnectFriends {
    public String name;
    public int cap=2;
    public int total;
    public ConnectFriends[] friends;

    public ConnectFriends(String name , int cap){
        this.name= name;
        this.cap = cap;
        friends= new ConnectFriends[cap];
        System.out.printf("Welcome to ConnectFriends, %s\n",this.name);
    }

    public ConnectFriends(String name){
        this.name = name;
        friends = new ConnectFriends[cap];
        System.out.printf("Welcome to ConnectFriends, %s\n",this.name);
    }

    public void sendFriendRequest(ConnectFriends temp){
        if(total<cap){
            friends[total++] = temp;
            System.out.printf("%s sent a friend request to %s.\n",this.name, temp.name);
        }
        else {
            System.out.printf("%s has reached the friend request limit!\n",this.name);
        }
    }

    public void sendFriendRequest(ConnectFriends temp1, ConnectFriends temp2){
        sendFriendRequest(temp1);
        sendFriendRequest(temp2);
    }

    public void showDetails(){
        System.out.printf("User Name: %s\nMaximum number of Sent Friend Request: %d\nTotal Friends Request: %d\nSent Friends Request:",this.name,this.cap ,this.total);
        for(int i = 0 ; i<total ; i++){
            System.out.printf(friends[i].name + " ");
        }
        System.out.println();
    }

    public void removeRequest(String temp){
        boolean flag = false;
        int frnd=0;
        for(int i =0 ; i<total ; i++){
            if(temp.equals(friends[i].name)){
                flag = true;
                frnd=i;
            }
        }
        if(flag){
            friends[frnd]= null;
            for(int i = frnd ; i<total-1 ; i++){
                friends[i] = friends[i+1];
            }
            total--;
            System.out.printf("Reuqest to add %s is removed for %s.\n",temp , this.name);
        }
        else {
            System.out.printf("%s is not in %s's sent request list.\n",temp, this.name);
        }
    }

}
