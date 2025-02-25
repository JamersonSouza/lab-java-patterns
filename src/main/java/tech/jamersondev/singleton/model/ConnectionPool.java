package tech.jamersondev.singleton.model;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static ConnectionPool instance = new ConnectionPool();
    private final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    public static ConnectionPool getInstance(){
        return instance;
    }

    private ConnectionPool(){
        System.out.println("Create connection..");
        connectionsPool = new ArrayList<Connection>();
        for(int i = 0; i < POOL_SIZE; i++){
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection(){
        Connection avaliable = null;
        for(Connection connection : connectionsPool){
            if(!connection.isInUse()){
               avaliable = connection;
               break;
            }
        }
        if(avaliable == null){
            System.out.println("No Connections avaliable");
            return null;
        }
        avaliable.setInUse(true);
        return avaliable;
    }

    public void leaveConnection(Connection connection){
        connection.setInUse(false);
    }

}
