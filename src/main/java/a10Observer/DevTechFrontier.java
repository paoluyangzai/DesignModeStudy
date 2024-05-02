package a10Observer;

import java.util.Observable;

public class DevTechFrontier extends Observable {
    private String name;

    public DevTechFrontier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void postNewPublication(String content){
        setChanged();
        notifyObservers(content);
    }
}
