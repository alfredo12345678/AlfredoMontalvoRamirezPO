public class TV {
    private cint channel;
    private int volumeleve;
    private boolean on;

    public int channel(){
        return channel;
    }

    public int getVolumeLevel(){
        return  volume();
    }

    public void turnOn(){
        on = true
    }

    public void turnOn(){
        on = false;
    }

    public void setChannel(int newChannel){ //1-120
        if (on && newChannel>=1 && newChannel<=120)
        channel = newChannel;
    } 

    }

    public void setVolume(int newVolumeLevel){//1-7
        if (on && newVolumeLevel>=1 && newVolumeLevel<=7){
        volumelevel = newVolumeLevel;
        }
        

    }

    public void volumeup(){
        //volumeLevel = volumeLeve + 1;
        if (on volumeLevel < 7){
            volumeLevel++;
        }

    }
    public void volumeDown(){
        if (on && volumeLevel > 1){
            volumeDown--;
        }    
    }
    public void channelLUp(){
            if (on channel > 120){
        channel++;
    }
    public void channelDown(){
            if (on channel < 1)
        channel--;
    }

    public static void main (String[] args)
    TV sony =new TV();
    sony.turnOn();
    sony.setChannel(112);
    sony.setVolume(7);


    system.out.println("the tv is"+ sony.getOn()+
                        "the chanel is"+ sony.getchannel()
                        "the volume is"+ sony.getVolumeLevel());

    sony.volumeDown();
    system.out(sony.getVolumeLevel());
    sony.volumeDown();
    system.out(sony.getVolumeLevel());
    sony.volumeDown();
    system.out(sony.getVolumeLevel()); 
    sony.volumeDown();
    system.out(sony.getVolumeLevel()); 
    sony.volumeDown();
    system.out(sony.getVolumeLevel()); 
    sony.volumeDown();
    system.out(sony.getVolumeLevel());
    sony.volumeDown();
    system.out(sony.getVolumeLevel()); 

    sony.turnOff();                  



}