package tech.jamersondev.singleton.model;

public class Connection {
    private boolean inUse;

    public Object query(String sql){
        System.out.println(String.format("Running %s in connection \n", sql));
        return null;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
