package Chapter5.e3.thieves;

import Chapter5.e3.citadel.Vault;

public class Thief extends Vault {

    public static void main(String[] args){
        Thief justThief = new Thief();
        justThief.steal(justThief);
    }

    public void steal(Vault v){
        System.out.println(this.jewels);
        Thief firstThief = new Thief();
        System.out.println(firstThief.jewels);
    }


}
